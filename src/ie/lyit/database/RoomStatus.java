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
            myConn = DriverManager.getConnection("jdbc:mysql://"+database, user, pass);
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select `roomno`,`booked` from rooms");
            
            sleep(5000);
            while (myRs.next()) {
                    
                    if(myRs.getInt("roomno") >= 200 && myRs.getInt("roomno") <= 207){
                    roomNo.put(myRs.getInt("roomno"), myRs.getBoolean("booked"));
                    }
                }
          
           MainFrame.setRoomButtons(roomNo);
        }
         catch(Exception p){
         System.out.print(p.getMessage());
         }
         
         // Close connections
         finally{
             System.out.print("Hashmap: ");
            for(Map.Entry<Integer,Boolean>entry: roomNo.entrySet()){
             Integer key = entry.getKey();
             Boolean value = entry.getValue();
             System.out.print("\nKey:"+key+" => Value:"+value);
            }
            
            
            }
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
    } // End of run() method

