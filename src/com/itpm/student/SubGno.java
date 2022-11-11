/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.student;

/**
 *
 * @author Anjelo
 */
public class SubGno {
    
    private int id;
    private String SGno;
    
    public SubGno(int ID, String sgn){
        this.id = ID;
        this.SGno = sgn;
    } 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the SGno
     */
    public String getSGno() {
        return SGno;
    }

    /**
     * @param SGno the SGno to set
     */
    public void setSGno(String SGno) {
        this.SGno = SGno;
    }
    
    
    
}
