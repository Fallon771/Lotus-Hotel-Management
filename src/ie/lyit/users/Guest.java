/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;

/**
 *
 * @author Jim
 */
public class Guest {
    
    private static int guestNumber = 1;
    private int number;
    private int roomNumber;
    private int phoneNo;
    
    private String fName;
    private String sName;
    private String address;
    private String emailAddress;
    
    public Guest(){
        
        emailAddress = null;
        number = guestNumber++;
    }
    public Guest(String fName,String sName,String address,String email,int phone,int room){
        this.fName = fName;
        this.sName = sName;
        this.address = address;
        this.emailAddress = email;
        this.phoneNo = phone;
        this.roomNumber = room;
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

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
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
