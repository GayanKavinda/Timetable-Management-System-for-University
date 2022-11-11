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
public class SubGroupID {
    
        private int id;
        private String subgId;
        
        public SubGroupID(int id, String subgId){
            
            this.id = id;
            this.subgId = subgId;
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
     * @return the subgId
     */
    public String getSubgId() {
        return subgId;
    }

    /**
     * @param subgId the subgId to set
     */
    public void setSubgId(String subgId) {
        this.subgId = subgId;
    }
        
        
}
