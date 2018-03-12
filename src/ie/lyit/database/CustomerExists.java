package ie.lyit.database;

import ie.lyit.users.Guest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author James Fallon
 * Class that will check if a customer already exists in the database from a previous stay
 */
public class CustomerExists {
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        boolean check = false;
        
        String user = "root";
        String pass = "password";
    
    public CustomerExists(){
    
    }      
    public boolean checkForGuest(String sql,String email) throws SQLException{
        // int id,String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout
      
            try {
           
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery(sql);
          
            while (myRs.next()) {
               if(myRs.getString("email").equals(email)){
                   check = true;
               }
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
        } // End of finally block    
            return check;
    }   // End of method
}
