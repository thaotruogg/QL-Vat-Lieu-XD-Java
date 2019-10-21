/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

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
    //private static String DB_URL = "jdbc:sqlserver://localhost:1433;\"\n" + " + \"databaseName=DatabaseVLXD;" + "user=sa;" + "password=123456;";
    private  String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=DatabaseVLXD;"
            + "integratedSecurity=true";
    private String USER_NAME = "sa";
    private String PASSWORD = "123456";
    private String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    protected Connection conn = null;
    
    public void getConnection() {
        try {
            try {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void getClose(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
