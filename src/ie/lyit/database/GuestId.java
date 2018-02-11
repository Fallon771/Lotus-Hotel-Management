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
import javax.swing.JOptionPane;

/**
 *
 * @author jim
 */
public class GuestId {
    
    boolean check;
    private int id;
    
    
    public void getGuestId()throws SQLException{
        
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
       
        String user = "root";
        String pass = "password";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            // 2. Create a statement
            myStmt = myConn.createStatement();
            // 3. Execute SQL query
            myRs = myStmt.executeQuery("SELECT id \n" +
                                        "FROM guest \n" +
                                        "WHERE id=(\n" +
                                        "SELECT max(id) FROM guest\n" +
                                        ")");
            // 4. Process the result set
            while (myRs.next()) {
                id = myRs.getInt("id");
            }
            check = true;

        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Error connecting to database..is Xammp running??\n"
                    + "\nUser: root\nPassword: password", "Connection Error", JOptionPane.ERROR_MESSAGE);
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
        
    }   // End of method
    public int getId(){
        return (id+1);
    }
    
}
