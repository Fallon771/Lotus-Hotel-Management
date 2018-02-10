package ie.lyit.database;
import ie.lyit.gui.MainFrame;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author jim
 * 
 * Custom thread that will check to see if our server is alive every 2 sec's 
 * Thread is started in MainFrame constructor.
 */

public class CheckStatus extends Thread{
    
    
    Connection myConn = null;
    boolean running = true; 
    private String user;
    private String pass;
    
    public void run(){

        while(running)
        try{
            
            // Try connect to database...
            user = "root";
            pass = "password";
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            System.out.print("Server running...\n");
            sleep(2000);
            
        }
        catch(Exception e){
        System.out.print("Server stopped..");
        // Break out of loop if cant connect
        running = false;
        }   
    }
    
    public boolean getStatus(){
    return running;
    }
}
