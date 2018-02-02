/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.testers;
import ie.lyit.database.ConnectionToDb;
import java.sql.*;

/**
 *
 * @author James Fallon
 * 
 */
public class DbTester {
    
    public static void main(String args[])throws SQLException{
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "password";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            
            boolean check = myConn.isClosed();
           

            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from guest");

            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("surname") + ", " + myRs.getString("fname"));
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
    }     
}
