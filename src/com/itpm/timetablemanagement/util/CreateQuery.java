/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author gayan
 */
public class CreateQuery {
    public static String getQuery(String ID) throws ParserConfigurationException, SAXException, IOException{
        String path = new File("").getAbsolutePath();
        NodeList nodeList;
        Element element = null;
        
         String root = System.getProperty("java.class.path");
         int place = root.indexOf(";");
         root = root.substring(place + 1);
            
        //read source xml file
        //get the query by it's tag name
//        nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder()
//                .parse(new File(root + "\\com\\spm\\timetablemanagement\\resource\\query.xml"))
//                .getElementsByTagName(Constant.QUERY);
//        
        nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder()

                 .parse(new File(path+"\\query.xml"))

                .getElementsByTagName(Constant.QUERY);
        
        for(int i = 0; i < nodeList.getLength(); i++){
            
            element = (Element) nodeList.item(i);
            
            //check the passed id is equels to the rlevent quries
            if(element.getAttribute(Constant.QUERY_ID).equals(ID))
                break;                          
        }
        return element.getTextContent().trim();
    }
}
