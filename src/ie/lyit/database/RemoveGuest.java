/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jim
 */
public class RemoveGuest {
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        Boolean check = false;
        
        String user = "root";
        String pass = "password";
    
    public void removeGuest(String sql) throws SQLException{
     try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            myStmt = myConn.createStatement();
            myStmt.executeUpdate(sql);
          
        } catch (Exception exc) {
            exc.printStackTrace();
            check = false;
        } finally {
            
            if (myStmt != null) {
                myStmt.close();
            }
            if (myConn != null) {
                myConn.close();
            }
        }  
    }
    
}
