package ie.lyit.database;
import ie.lyit.gui.MainFrame;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
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
    String startStamp = new SimpleDateFormat("dd.MM.yyyy -- HH.mm.ss").format(new Date());
    String currentStamp;

    public void run(){
        System.out.print("Started at: ["+startStamp+"]\n");
        while(running)
        try{
            currentStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
            // Try connect to database...
            user = "root";
            pass = "";
            myConn = DriverManager.getConnection("jdbc:mysql://localhost/hotel_db", user, pass);
            System.out.print("Server running...\nTime Stamp:["+currentStamp+"]\n");
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
