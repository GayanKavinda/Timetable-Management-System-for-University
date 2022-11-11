/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author gayan
 */
public class CharecterSizeFilter extends PlainDocument{
    
    int limit;

    public CharecterSizeFilter(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
       if(offs == limit)
           return;
       
       if( (getLength() + str.length()) <= limit){
           
           super.insertString(offs, str, a);
       }
    }
    
}
