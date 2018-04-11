package ie.lyit.hotel;
/**
 *
 * @author James Fallon
 */
public class Bill {
    
    private float amount;
    private Date date;
    private double totalBill;
    // Fixed prices 
    private double cancelFee;
    private double singleR;
    private double doubleR;
    private double bridal;
    private double executive;
    
    public Bill(){
        
        cancelFee = 50;
        singleR = 80.00;
        doubleR = 130.00;
        bridal = 250.00;
        executive = 195.00;
        totalBill = 0.00;
    }
    public Bill(float amount,Date date){
        this.amount = amount;
        this.date = date;
    }    
    
    // Getter's & Setter's
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    // roomPrice,fixedTotal,extraText
           // discountTotal,** nightsStay
    public void setTotalBill(double roomPrice,double fixedTotal,double extras,int discount,int nightsStay){
        //totalBill = (((roomPrice+fixedTotal+extras) * (discountTotal/100)) * nightsStay);  
//        if(discount < 0){
//        discount = discount * -1;
//        }
        totalBill = (roomPrice * nightsStay);
        double discountTotal = (double)discount/100;
        if(discountTotal != 0){
        totalBill = (totalBill * discountTotal)+totalBill;
        }
        
        System.out.println("RoomPrice:"+roomPrice); 
        System.out.println("Nights:"+nightsStay);
        System.out.println("Discont:"+discountTotal); 
        System.out.println("Extras:"+extras); 
        System.out.println("FixedTotal:"+fixedTotal); 
        System.out.println("Total Bill:"+totalBill);
    }
    public double getTotalBill(){
        return totalBill;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public String toString(){
        return "Bill Total: " + amount + "Date: " + date.getDay() + "/" 
                + date.getMonth() + "/" + date.getYear();
    }
    
    public String toFormattedString(){
        return "Bill Total: " + amount + "Date: " + date.getDay() + "/" 
                + date.getMonth() + "/" + date.getYear();
    }
    
    public String getFormattedBillDate(){
        return "Date: " + date.getDay() + "/" 
                + date.getMonth() + "/" + date.getYear();
    }
    
    public String getFormattedBillAmount(){
        return "Bill Total: " + amount;
    }
    
    public double getSingleR() {
        return singleR;
    }

    public double getDoubleR() {
        return doubleR;
    }

    public double getBridal() {
        return bridal;
    }

    public double getExecutive() {
        return executive;
    }
    
}
