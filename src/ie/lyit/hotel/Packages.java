package ie.lyit.hotel;

/**
 *
 * @author James Fallon
 * Class for the custom packages and deals
 */
public class Packages {
    
    private String name;
    private String comments;
    private int totalBill;
    private double fixIncrease;
    private double fixDecrease;
    private double extras;
    
    
    public Packages(String name,int totalBill,double inc,double dec, double extras,String comments){
       
        this.name = name;
        this.totalBill = totalBill;
        this.fixIncrease = inc;
        this.fixDecrease = dec;
        this.extras = extras;
        this.comments = comments;
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

    @Override
    public String toString() {
        return "Package:\n" + "Names:" + name + ", \nComments:" + comments + ", \nBill Multiplier:" + totalBill 
                + ", \nFixed Increase:" + fixIncrease 
                + ", \nFixed Decrease:" + fixDecrease 
                + ", \nExtras:" + extras + '}';
    } 
}
