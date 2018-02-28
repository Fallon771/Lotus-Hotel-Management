package ie.lyit.threads;
import ie.lyit.gui.MainFrame;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jim
 * 
 * Custom thread that will check to see if our server is alive every 2 sec's 
 * Thread is started in MainFrame constructor.
 */

public class CheckStatus extends Thread{
    
    Connection myConn = null;
    MainFrame frame;
    
    volatile boolean running = true; 
    private String user;
    private String pass;
    private String database = "localhost/hotel_db";
    
    // Just printing a start time
    String startStamp = new SimpleDateFormat("dd.MM.yyyy || HH:mm:ss a").format(new Date());
    String currentStamp;

    public void run(){
        System.out.print("Started at: ["+startStamp+"]\n");
        while(running)
        try{
            sleep(3000);
            currentStamp = new SimpleDateFormat("HH:mm:ss a").format(new Date());
            // Try connect to database...
            user = "root";
            pass = "password";
            myConn = DriverManager.getConnection("jdbc:mysql://"+database, user, pass);
            System.out.print("\n--------------------------------------------------------------");
            System.out.print("\n[Thread 1:] Server check...Success!  ==> Time Stamp:["+currentStamp+"]\n");
            System.out.print("--------------------------------------------------------------\n");
            // Pass in flag to change icon on footer
            frame.setStatus(running);
        }
        catch(Exception e){
        System.out.print("Server ping stopped...\nServer must be down...!!\n");
        // Break out of loop if cant connect
        running = false;
        frame.setStatus(running);

        }  
        finally{
            if(myConn != null){
                try {
                    myConn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CheckStatus.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
        }
    }
    
    // Getter's and Setter's
    public boolean getStatus(){
    return running;
    }
    public String getDatabase(){
    return database;
    }
    public void setDatabase(String database){
    this.database = database;
    }
    public void setStatus(){
    running = true;
    }
}
