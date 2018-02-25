
package ie.lyit.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author James Fallon
 * 
 * Class to check for double booking
 * 
 */
public class ValidBooking {
   
    public static boolean checkForDoubleBook(Date checkin,Date checkout,int roomNo) throws SQLException{
    
        // Select all checkins & checkout dates from guests currently staying in the room passed into the string
        String sql ="SELECT DISTINCT `checkin`,`checkout`,`roomno` FROM guest,rooms WHERE roomno = '"+roomNo+"'";
        boolean validDate = true;
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        
        String user = "root";
        String pass = "password";        
        
        // int id,String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout
             try {
                 
            // Format date strings
            Format f = new SimpleDateFormat("yyyy-MM-dd");
            String in = f.format(checkin);
            String out = f.format(checkout);
            Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(in);
            Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(out);
    
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
          
            // 2. Create a statement
            myStmt = myConn.createStatement();

            // 3. Execute SQL query
            myRs = myStmt.executeQuery(sql);

            // 4. Process the result set
           
            while (myRs.next()) {
                
                // Loop through all the guests that our either booked or checked into the choosen room.
                // If the checkin date the user selected is after or before the guest currently staying...then set flag to false.
                if( dateIn.after(myRs.getDate("checkin")) && dateIn.before(myRs.getDate("checkout"))){
                    validDate = false;
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
