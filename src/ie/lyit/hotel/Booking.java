package ie.lyit.hotel;

/**
 *
 * @author James Fallon
 */
public class Booking {
    
    Date checkout,checkin;
    int id,adults,children;
    
    
    public Booking(int id,Date checkin,Date checkout,int children,int adults){
        
        this.id = id;
        this.checkin =checkin;
        this.checkout = checkout;
        this.children =children;
        this.adults = adults;
        
    }  
    
    public Date getCheckIn(){
        
        return checkin;
    }
    public Date getCheckOut(){
        return checkout;
    }
}
