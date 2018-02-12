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
    private int number;
    private int roomNumber;
    private String phoneNo;
    
    private String fName;
    private String title;
    private String sName;
    private String address;
    private String emailAddress;
    private Date checkin;
    private Date checkout;
    private CreditCard card;
    private Bill bill;
    
    String sql= " String sql = \"INSERT INTO `guest` \"\n" +
"                + \"(`id`, `fname`, `surname`, `address`, `title`, `checkin`, `checkout`) \"\n" +
"                + \"VALUES (NULL, 'Tony', 'Waters', 'No 4 Sandy Row', 'Mr', '2018-02-08', '2018-02-15');\";";
    
    public Guest(){
         
    }
    public Guest(String title,String fName,String sName,String address,String phone,String email,Date checkin,Date checkout){
        
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        return "Guest{" + "roomNumber=" + roomNumber + ", phoneNo=" + phoneNo + ", fName=" + fName + ", sName=" + sName + ", address=" + address + '}';
    }
    
}
