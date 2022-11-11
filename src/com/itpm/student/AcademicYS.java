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
public class AcademicYS {
    
    private int id;
    private String ys;

    public AcademicYS(int id, String ys){
        this.id = id;
        this.ys = ys;
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
     * @return the ys
     */
    public String getYs() {
        return ys;
    }

    /**
     * @param ys the ys to set
     */
    public void setYs(String ys) {
        this.ys = ys;
    }
    
    
    
}
