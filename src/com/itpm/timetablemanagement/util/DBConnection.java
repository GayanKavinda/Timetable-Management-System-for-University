/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;


import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author gayan
 */
public class DBConnection {
    
    
     public static final Properties PROPERTIES = new Properties();
    
    private static Connection connection;
    private static String path = "";
    private static String DBpath = "";
            
    public static boolean isDatabaseExist(String dbPath){
        File file = new File(dbPath);
        return file.exists();
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
        path = new File("").getAbsolutePath();
        DBpath = path.concat("\\timetable.db");
         
        if(isDatabaseExist(DBpath)){
            
            if(connection == null || connection.isClosed()){
                //get property file to acces data
                PROPERTIES.load(Constant.class.getResourceAsStream(Constant.PROPERTIES) );
                
                try{
                    Class.forName(PROPERTIES.getProperty("driver"));
                    connection = DriverManager.getConnection(PROPERTIES.getProperty("url")+DBpath);
                }
                catch(Exception ex){
                    
                    JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }else{
//            System.out.println("else => ");
            CreateTable.createDatabase(DBpath);
            
            if(connection == null || connection.isClosed()){
                
                //get property file to acces data
                PROPERTIES.load(Constant.class.getResourceAsStream(Constant.PROPERTIES) );
                
                try{
                    Class.forName(PROPERTIES.getProperty("driver"));
                    connection = DriverManager.getConnection(PROPERTIES.getProperty("url")+DBpath);
                }
                catch(Exception ex){
                    
                    JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
        
        
        
        return connection;
    }
}
