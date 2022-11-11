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
public class DegreeP {
    
     private int id;
     private String dp;

     
     public DegreeP(int id, String dp){
         this.id = id;
         this.dp = dp;
                 
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
     * @return the dp
     */
    public String getDp() {
        return dp;
    }

    /**
     * @param dp the dp to set
     */
    public void setDp(String dp) {
        this.dp = dp;
    }
    
     
    
}
