package ie.lyit.users;
import ie.lyit.database.Insertions;
import ie.lyit.database.DBConnections;
import ie.lyit.gui.BookingPopup;
import ie.lyit.hotel.Bill;
import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Rooms;
import java.awt.Color;
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
    BookingPopup popup;
   
    Insertions conn =new Insertions();
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
        String phone = guest.getPhoneNo();
        String email = guest.getEmailAddress();
        String guestTitle = guest.getTitle();
        Date guestCheckin = guest.getCheckIn();
        Date guestCheckout = guest.getCheckOut();

        //Parse date from string to correct format(SQL accepts only yyyy-mm-dd)
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        // Create strings and format date
        String in = df.format(guestCheckin);
        String out = df.format(guestCheckout);

        String sql = "INSERT INTO `guest` (`fname`, `surname`,`address`,`title`,"
                + "`checkin`,`checkout`,`phone`,`email`) VALUES ('"+guestFName+"','"+guestSName+"',"
                + "'"+guestAdress+"','"+guestTitle+"','"+in+"','"+out+"','"+phone+"','"+email+"');";
        
        String sql2 = "INSERT INTO `gueststore` (`fname`, `surname`,`address`,`title`,"
                + "`phone`,`email`) VALUES ('"+guestFName+"','"+guestSName+"',"
                + "'"+guestAdress+"','"+guestTitle+"','"+phone+"','"+email+"');";
        
        try{
        conn.insertToDatabase(sql);
        conn.insertToDatabase(sql2);
        }
        catch(Exception e){
            System.out.print("Error occured while adding...");
            JOptionPane.showMessageDialog(null, "Error adding guest to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    // Check if room is available or booked
    public int checkRoomStatus(Color c){
       
        // Check status of room by checking the color set on the jbuttons
        switch (c.toString()) {
            case "java.awt.Color[r=153,g=255,b=153]":
                JOptionPane.showMessageDialog(null, "Room Available..", "Room Check", JOptionPane.INFORMATION_MESSAGE);
                return 1;
            case "java.awt.Color[r=255,g=204,b=204]":
                //JOptionPane.showMessageDialog(null, "Room Not Available..", "Room Check", JOptionPane.INFORMATION_MESSAGE);
                popup = new BookingPopup();
                popup.setVisible(true);
                popup.displayRoomTable();
                return 2;
            default:
               // JOptionPane.showMessageDialog(null, "Room Booked..", "Room Check", JOptionPane.INFORMATION_MESSAGE);
               popup = new BookingPopup();
               popup.setVisible(true);
               popup.displayRoomTable();
               return 3;
        }          
    }
    public void addBill(Bill bill){
        
    }
    public void addCreditCard(CreditCard card){
        
        int id = card.getId();
        long cardno = card.getCardNum();
        int cvc = card.getCvc();
        String type = card.getType();
        String expiry = card.getExpiry();
       
        // SQL String to pass into database
        String sql = "INSERT INTO `creditcard` (`id`,`cardnumber`,`expiry`,`cvc`,`type`) VALUES "
                + "('"+id+"','"+cardno+"', '"+expiry+"','"+cvc+"','"+type+"');";
        
        // Pass in string
        try{
               conn.insertToDatabase(sql);
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error adding card to database!", "Error", JOptionPane.ERROR_MESSAGE);
           }  
    }
    public void addRoom(Rooms room){
   
       int roomNo = room.getRoomNum();
       int guestNo = room.getId();
       int adults = room.getAdults();
       boolean booked = room.getBooked();
       int children = room.getChildren();
       
       int book = (booked) ? 1:0;
      
        String sql = "INSERT INTO `rooms` (`id`,`booked`,`roomno`,`adults`,`children`) VALUES "
                + "('"+guestNo+"','"+book+"', '"+roomNo+"', '"+adults+"', '"+children+"');";
        
           try{
               conn.insertToDatabase(sql);
           }
           catch(Exception e){
               System.out.print("Error occured while adding room...");
               JOptionPane.showMessageDialog(null, "Error adding room to database!", "Error", JOptionPane.ERROR_MESSAGE);
           }   
    }

    // Check-out
    @Override
    public void removeGuest() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public void displayGuests() {
       
    }

    @Override
    public void displayRooms() {
           
    }   
}
