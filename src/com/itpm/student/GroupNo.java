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
public class GroupNo {
    
    private int id;
    private String gNo;
    
    public GroupNo(int id, String gNo){
        this.id = id;
        this.gNo = gNo;
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
     * @return the gNo
     */
    public String getgNo() {
        return gNo;
    }

    /**
     * @param gNo the gNo to set
     */
    public void setgNo(String gNo) {
        this.gNo = gNo;
    }
    
    
    
}
