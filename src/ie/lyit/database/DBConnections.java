/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;
import ie.lyit.users.Guest;
import ie.lyit.hotel.Rooms;
/**
 *
 * @author james fallon
 */
public interface DBConnections {
    
    
    public void addGuest(Guest guest);
    public void removeGuest();
    public void displayGuests();
    public void displayRooms();
}
