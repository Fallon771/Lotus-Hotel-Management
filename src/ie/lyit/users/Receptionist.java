/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;
import ie.lyit.hotel.Date;
import ie.lyit.database.DBConnections;

/**
 *
 * @author James F.
 */
public class Receptionist implements DBConnections{
    
    private String fName;
    private String sName;
    private String emailAddress;
    private int id;

    
    
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
    public void addGuest() {
        throw new UnsupportedOperationException("Not supported yet."); 
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
