/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;

import ie.lyit.users.Guest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jim
 */
public class DisplayTables {
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "password";
        
        Guest guest;
        ArrayList<Guest> list = new ArrayList<>();
        
        
        public ArrayList<Guest> displayGuestTable(String sql) throws SQLException{
        // int id,String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout
        Date date;
             try {
            list.clear();
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
          
            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery(sql);

            // 4. Process the result set
            list.clear();
            while (myRs.next()) {
                guest = new Guest(myRs.getInt("id"),myRs.getString("title"),
                        myRs.getString("fname"),myRs.getString("surname"),
                        myRs.getString("address"),
                        myRs.getString("phone"),
                        myRs.getString("email"),
                        myRs.getDate("checkin"),
                        myRs.getDate("checkout"));
                       // myRs.getInt("roomno"));
                list.add(guest);
            }
          
        } catch (Exception exc) {
            exc.printStackTrace();
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
             return list;
    }   
        
    
    // Pass in sql string to add a guest
    public void addGuest(String sql)throws SQLException{
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            myStmt = myConn.createStatement();
            myStmt.executeUpdate(sql);
          
           
       
        } catch (Exception exc) {
            exc.printStackTrace();
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
