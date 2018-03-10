/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.threads;

import ie.lyit.gui.MainFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author James F
 * 
 * This thread will keeping check the database
 */
public class RoomStatus extends Thread{
    
        MainFrame frame;
    
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        Boolean check = false;
        volatile boolean running = true; 
        
        String user = "root";
        String pass = "password";
        private String database = "localhost/hotel_db";
    
        // Hash Map to store keys(room number) & values (booked 0/1)
        HashMap<Integer,Boolean> roomNo = new HashMap();
        
    public void run(){
   
         while(running){
           
         try{ 
            System.out.print("[Thread 2:]Started.. :) \n");
            sleep(5000);
            myConn = DriverManager.getConnection("jdbc:mysql://"+database, user, pass);
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select `roomno`,`booking` from rooms,roombooked");
            
            while (myRs.next()) {
                    
                    if(myRs.getInt("roomno") >= 100 && myRs.getInt("roomno") <= 407){
                    roomNo.put(myRs.getInt("roomno"), myRs.getBoolean("booking"));
                    }
                }       
        }
         catch(Exception p){
         System.out.print(p.getMessage());
         }
         
         // Close connections
         finally{
           MainFrame.setRoomButtons(roomNo);
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
          roomNo.clear();
         }  // End of finally block
         }
       }
    } // End of run() method

