/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.timetablemanagement.util;

/**
 *
 * @author Nipuna Liyanage
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBNEW {

    static Connection connection;
    static Statement statement;
    public static Connection c;

    public static void createCon() throws Exception {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:timetable.sqlite");
            //System.out.println("connected");
            statement = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        try {
            createCon();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void iud(String sql) throws Exception {

        if (c == null) {
            createCon();
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {

        if (c == null) {
            createCon();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static void closeConn() throws Exception {

        if (c == null) {
            createCon();
        } else {
            c.close();
        }

    }
}
