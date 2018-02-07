/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.database;

/**
 *
 * @author james fallon
 */
public interface DBConnections {
    
    
    public void addGuest();
    public void removeGuest();
    public void displayGuests();
    public void displayRooms();
    public void bookRoom();
}
