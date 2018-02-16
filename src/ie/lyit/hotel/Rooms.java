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
    
    public Rooms(){
    
    }
    public Rooms(int roomNum,int adults,int children,String roomType){
        
        this.roomNum = roomNum;
        this.adults = adults;
        this.children = children;
        this.roomType = roomType;
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
