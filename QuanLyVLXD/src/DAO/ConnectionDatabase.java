/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author thaotruogg
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
public class ConnectionDatabase {
    //private static String DB_URL = "jdbc:sqlserver://localhost:1433;\"\n" + " + \"databaseName=DatabaseVLXD;" + "user=sa;" + "password=123456;";
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=DatabaseVLXD;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123456";
    
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                System.out.println("connect successfully!");
//                JOptionPane.showMessageDialog(null, "Connect successfully!");
            } catch (SQLException ex) {
                System.out.println("connect failure!");
                JOptionPane.showMessageDialog(null, "Connect failure!");
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return conn;
    }
    
//    public static Connection getConnection(){
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            try {
//                return DriverManager.getConnection(DB_URL);
//            } catch (SQLException e) {
//                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, e);
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
}
