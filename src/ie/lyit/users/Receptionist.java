/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;
import ie.lyit.database.Connect;
import ie.lyit.database.DBConnections;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author James F.
 */
public class Receptionist implements DBConnections{
    
    private String fName;
    private String sName;
    private String emailAddress;
    private int id;
    
    
    
    Connect conn =new Connect();
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    

    public Receptionist(){
        
    }
    
    public Receptionist(String fName,String sName,int id,String email){
    
        this.fName = fName;
        this.sName = sName;
        this.id = id;
        this.emailAddress = email;
         
    }
    // Action Methods
   
    public  void generateBill(){
    
    }
    
    public void feedBack(){
    
    }

    // Getter's & Setter's
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     // Abstract methods
    
    // Check in
    @Override
    public void addGuest(Guest guest) {
        
        // Get guest details
        String guestFName = guest.getfName();
        String guestSName = guest.getsName();
        String guestAdress = guest.getAddress();
        String guestTitle = guest.getTitle();
        Date guestCheckin = guest.getCheckIn();
        Date guestCheckout = guest.getCheckOut();
        
        //Parse date from string to correct format(SQL accepts only yyyy-mm-dd)
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        // Create strings and format date
        String in = df.format(guestCheckin);
        String out = df.format(guestCheckout);

        String sql = "INSERT INTO `guest` (`fname`, `surname`,`address`,`title`,"
                + "`checkin`,`checkout`) VALUES ('"+guestFName+"','"+guestSName+"',"
                + "'"+guestAdress+"','"+guestTitle+"','"+in+"','"+out+"');";
        try{
        conn.addGuest(sql);
        }
        catch(Exception e){
            System.out.print("Error occured while adding...");
            JOptionPane.showMessageDialog(null, "Error adding guest to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    // Check-out
    @Override
    public void removeGuest() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void displayGuests() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void displayRooms() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void bookRoom() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
