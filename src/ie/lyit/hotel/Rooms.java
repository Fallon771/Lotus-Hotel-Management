/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.hotel;

/**
 *
 * @author James F.
 */
public class Rooms {
    
    private int adults;
    private int children;
    private String roomType;
    private int roomNum;
    
    private boolean booked;
    private boolean available;
    private int id;
    
    public Rooms(){
    
    }
    public Rooms(int id,boolean booked,int roomNum,int adults,int children){
        
        this.roomNum = roomNum;
        this.adults = adults;
        this.children = children;
        this.roomNum = roomNum;
        this.booked = booked;
        this.id = id;
    }

    // Getter's & Setter's
    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }
    public boolean getBooked(){
    return booked;
    }
    public int getRoomNo(){
    return roomNum;
    }
    
    public int getId(){
    return id;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }  
}
