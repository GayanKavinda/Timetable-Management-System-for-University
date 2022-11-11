/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;

import com.itpm.timetablemanagement.home.Dialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gayan
 */
public class CreateTable {
    
    
    static Connection connection;
    static boolean lock = false;
    static Dialog dialog = new Dialog();
    
    public static void createDatabase(String DBpath){
        StringBuffer queryList = new StringBuffer();
        String query = new String();
        Statement statement;
        String path = new File("").getAbsolutePath();
        int counter = 0;
        dialog.setVisible(true);
        
        JOptionPane.showMessageDialog(null , "Waite for database creating...", "Database Creating", JOptionPane.INFORMATION_MESSAGE);
        
        try{
            if(connection == null || connection.isClosed()){
                Class.forName("org.sqlite.JDBC").newInstance();
                connection = DriverManager.getConnection("jdbc:sqlite:"+DBpath);
                
                try {
                    FileReader reader = new FileReader(new File(path+"\\timetable.sql"));
                    BufferedReader br = new BufferedReader(reader);
                    
                    while((query = br.readLine())!= null){
                        queryList.append(query);
                    }
                    
                    String [] data = queryList.toString().split(";");
                    statement = connection.createStatement();
                    
                    for(int i = 0; i < data.length;i++){
                        if(!data[i].trim().equals("")){
                            
                            statement.executeUpdate(data[i]);
                            counter ++;
                        }
                        
                        dialog.jProgressBar1.setValue(i);
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    lock = true;
                } catch (IOException ex) {
                    Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    lock = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
            lock = true;
            JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null , "Cannot configure database"+ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            lock = true;
        }
        
        if(!lock){
            dialog.jProgressBar1.setValue(100);
            dialog.setVisible(false);
            JOptionPane.showMessageDialog(null , "Database Created with "+counter+" queries", "Database Ok", JOptionPane.INFORMATION_MESSAGE);
        }   
    }    
}
