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
public class GenerateID {
    
        private int id;
        private String gId;

    GenerateID(int id, String gId) {
        this.id = id;
        this.gId = gId;
    }

    GenerateID() {
         
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
     * @return the gId
     */
    public String getgId() {
        return gId;
    }

    /**
     * @param gId the gId to set
     */
    public void setgId(String gId) {
        this.gId = gId;
    }

}
