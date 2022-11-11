/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.tag;

/**
 *
 * @author Anjelo
 */
public class Tag {
    
    private int id;
    private String tagID;
    private String subject;
    private String code;
    private String rTag;
    
    Tag(){
        
    }
    public Tag(int id,String tagID,String subject,String code,String rTag){
        this.id = id;
        this.tagID = tagID;
        this.subject = subject;
        this.rTag =rTag;
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
     * @return the tagID
     */
    public String getTagID() {
        return tagID;
    }

    /**
     * @param tagID the tagID to set
     */
    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the rTag
     */
    public String getrTag() {
        return rTag;
    }

    /**
     * @param rTag the rTag to set
     */
    public void setrTag(String rTag) {
        this.rTag = rTag;
    }
    
    
    
}
