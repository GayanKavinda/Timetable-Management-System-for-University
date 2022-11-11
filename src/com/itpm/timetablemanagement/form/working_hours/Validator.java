/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.form.working_hours;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author gayan
 */
public class Validator {
    public static void validateLength(String type, JTextField hcount, JTextField mcount){
        
        if(type.contains("hour")){
            if(hcount.getText().length() > 1)
                hcount.setText("");
        }else{
            if(mcount.getText().length() > 4){
                mcount.setText("");
            }
        }
    }
    
    public static void filterInt(KeyEvent evt, String type, JLabel error, JTextField txt_hour){
        
        int key = evt.getKeyCode();
        
        if((key < 48) || (key > 57)){
            
            if((key < 96) || (key > 105)){
                error.setText("Input only numbers");
                if(type.contains("hour")){
                    evt.setKeyCode(1);
                    txt_hour.setText("");
                }
            }
            else
                error.setText("");
        }else{
            error.setText("");
        }  
    }
}
