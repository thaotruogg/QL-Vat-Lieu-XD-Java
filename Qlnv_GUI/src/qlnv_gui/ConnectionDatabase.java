/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv_gui;

/**
 *
 * @author thaotruogg
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class ConnectionDatabase {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;\"\n" + " + \"databaseName=DatabaseVLXD;" + "user=sa;" + "password=123456;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456";
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                return DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, e);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
