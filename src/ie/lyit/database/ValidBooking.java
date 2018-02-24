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
import java.util.Date;
/**
 *
 * @author James Fallon
 * Class to check for double booking
 */
public class ValidBooking {
   
    public static boolean checkForDoubleBook(Date date,int roomNo) throws SQLException{
    
        String sql ="SELECT DISTINCT `checkin`,`checkout`,`roomno` FROM guest,rooms WHERE roomno = '"+roomNo+"'";
        boolean validDate = true;
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "password";        
        
        // int id,String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout
             try {
             //Date checkin=new SimpleDateFormat("dd/MM/yyyy").parse(date);
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
          
            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery(sql);

            // 4. Process the result set
           
            while (myRs.next()) {
                       
                if(date.after( myRs.getDate("checkin")) && date.before(myRs.getDate("checkout"))){
                System.out.print("\n\nBOOKING DEBUG::"+"CANT BOOK\n\n");
                return validDate = false;
                 }
                else{
                System.out.print("\n\nBOOKING DEBUG: YOU CAN BOOK\n\n");
                return validDate;
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
        }  
             return validDate;
    }
}
