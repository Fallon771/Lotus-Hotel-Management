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
    
    private String adults;
    private String children;
    private String roomType;
    
    private int roomNum;
    
    private boolean booked;
    private boolean available;
    
    public Rooms(int roomNum,String adults,String children,String roomType){
        
        this.roomNum = roomNum;
        this.adults = adults;
        this.children = children;
        this.roomType = roomType;
    }

    // Getter's & Setter's
    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
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
