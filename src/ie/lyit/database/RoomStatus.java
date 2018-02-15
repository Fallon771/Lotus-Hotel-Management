/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;

import ie.lyit.gui.MainFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James F
 */
public class RoomStatus extends Thread{
    
        static MainFrame frame;
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        Boolean check = false;
        volatile boolean running = true; 
        
        String user = "root";
        String pass = "password";
        private String database = "localhost/hotel_db";
        ArrayList<Integer> rooms = new ArrayList<>();
        
    public void run(){
   
         while(running){
         try{ 
            myConn = DriverManager.getConnection("jdbc:mysql://"+database, user, pass);
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select `roomno`,`booked` from rooms");
            sleep(5000);
            while (myRs.next()) {
                    
                    if(myRs.getInt("roomno") >= 200 && myRs.getInt("roomno") <= 207 && !myRs.getBoolean("booked")){
                    rooms.add(myRs.getInt("roomno"));
                    }
                }
           passArray();
           // rooms.clear();
        }
         catch(Exception p){
         System.out.print(p.getMessage());
         }
         
         // Close connections
         finally{
            
         if(myRs != null){
             try {
                 myRs.close();
             } catch (SQLException ex) {
                 Logger.getLogger(RoomStatus.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
          if(myConn != null){
             try {
                 myRs.close();
             } catch (SQLException ex) {
                 Logger.getLogger(RoomStatus.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
          if(myStmt != null){
             try {
                 myStmt.close();
             } catch (SQLException ex) {
                 Logger.getLogger(RoomStatus.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
         }  // End of finally block
         
       }
    } // End of run() method
    public void passArray(){
        frame.setRoomButtons(rooms);
    }
}
