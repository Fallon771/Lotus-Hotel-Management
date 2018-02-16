/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;
import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Bill;
import java.util.Date;
import ie.lyit.hotel.Rooms;

/**
 *
 * @author Jim
 */
public class Guest {
    
    // Intergers
    private int roomNumber;
    private int id;
    private int roomNo;
    private int children;
    private int adults;
    
    // Strings
    private String phoneNo;
    private String fName;
    private String title;
    private String sName;
    private String address;
    private String emailAddress;
    
    // Objects
    private Date checkin;
    private Date checkout;
    private CreditCard card;
    private Bill bill;
    private Rooms room;
   
    public Guest(){
         
    }
    
    // Constructor for JTables
    public Guest(int id,String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout){
       
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.title = title;
        this.id = id;
        this.emailAddress = email;
        this.checkin = checkin;
        this.checkout = checkout;
        this.phoneNo = phone;
        
    }
    // Constructor for adding guest
    public Guest(String title,String fName,String sName,String address,String phone,String email,int children,int adults,int roomNo,Date checkin,Date checkout){
        
        this.room = new Rooms(id,children,adults,"Single");
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.title = title;
        this.roomNo = roomNo;
        this.emailAddress = email;
        this.phoneNo = phone;
        this.checkin = checkin;
        this.checkout = checkout;
        
       // this.roomNumber = room;
    }
    
    //Getter's & Setter's

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public Date getCheckIn(){
        
        return checkin;
    }
    public Date getCheckOut(){
        return checkout;
    }
    public String getTitle(){
        return title;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
     
    
    
    @Override
    public String toString() {
        return "Id:"+id +"\nFirst Name:"+fName+"\nSurname:"+sName
                +"\nAddress:"+address+"\nPhone:"+phoneNo
                +"\nEmail:"+emailAddress+"\nCheck-In:"
                +checkin+"\nCheck-Out:"+checkout;
    }
    
}
