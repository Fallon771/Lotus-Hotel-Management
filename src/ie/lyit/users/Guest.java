/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;
import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Bill;
import java.util.Date;

/**
 *
 * @author Jim
 */
public class Guest {
    
    private static int guestNumber = 1;
    private int roomNumber;
    private String phoneNo;
    
    private String fName;
    private int id;
    private int row;
    private String title;
    private String sName;
    private String address;
    private String emailAddress;
    private Date checkin;
    private Date checkout;
    private CreditCard card;
    private Bill bill;
   
    public Guest(){
         
    }
    
    // Constructor for email check
    public Guest(String title,String fName,String sName,String address,String phone,String email){
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.title = title;
        this.emailAddress = email;
        this.phoneNo = phone;
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

    public Guest(String title,String fName,String sName,String address,String phone,String email,int roomNo,Date checkin,Date checkout){

        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.title = title;
        this.emailAddress = email;
        this.phoneNo = phone;
        this.checkin = checkin;
        this.checkout = checkout;
        
       // this.roomNumber = room;
    }
    
    //Getter's & Setter's
    public static int getGuestNumber() {
        return guestNumber;
    }

    public static void setGuestNumber(int guestNumber) {
        Guest.guestNumber = guestNumber;
    }

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
