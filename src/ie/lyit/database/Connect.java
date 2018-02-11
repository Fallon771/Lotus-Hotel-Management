/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James Fallon
 * 
 */

public class Connect implements Runnable{
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        Boolean check = false;
        
        String user = "root";
        String pass = "password";
    
    // Constructor
    public Connect(){
    
    }
    public void run(){
        
        try{
        connectToHotel();
        sleep(2222);
        }
        catch(Exception e){
        e.getMessage();
        }
    }
    // Connect to our hotel database
    public void connectToHotel()throws SQLException{
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
          
            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from guest");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("surname") + ", " + myRs.getString("fname"));
                
            }
            check = true;

        } catch (Exception exc) {
            exc.printStackTrace();
            check = false;
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                
                myConn.close();
            }
        }  
    }  
    
    // Pass in sql string to add a guest
    public void addGuest(String sql)throws SQLException{
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            myStmt = myConn.createStatement();
            myStmt.executeUpdate(sql);
          
            // 3. Execute SQL query
       
         
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
    
    public void setStatus(){
    check = false;
    }
    public boolean getStatus(){ 
        return check;
    }
    
}
