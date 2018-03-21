package ie.lyit.hotel;

/**
 *
 * @author James Fallon
 * Class for the custom packages and deals
 */
public class Packages {
    
    private String name;
    private int totalBill;
    private double fixIncrease;
    private double fixDecrease;
    private double extras;
    
    
    public Packages(String name,int totalBill,double inc,double dec, double extras){
       
        this.name = name;
        this.totalBill = totalBill;
        this.fixIncrease = inc;
        this.fixDecrease = dec;
        this.extras = extras;
    } 
    
    // Getter's
    public String getName() {
        return name;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public double getFixIncrease() {
        return fixIncrease;
    }

    public double getFixDecrease() {
        return fixDecrease;
    }

    public double getExtras() {
        return extras;
    }  
}
