package ie.lyit.hotel;
/**
 *
 * @author James Fallon
 */
public class Bill {
    
    private float amount;
    private Date date;
    
    // Fixed prices 
    private double fuctionPrice = 60.00;
    private double spaPrice = 50.00;
    
    // Discounts & Increase
    private double valentinePrice = 1.25;
    private double bankPrice = 1.50;
    private double summerDeal = 0.75;
    
    private double deal20 = 0.80;
    private double deal10 = 0.90;

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

    public double getFuctionPrice() {
        return fuctionPrice;
    }

    public void setFuctionPrice(double fuctionPrice) {
        this.fuctionPrice = fuctionPrice;
    }

    public double getSpaPrice() {
        return spaPrice;
    }

    public void setSpaPrice(double spaPrice) {
        this.spaPrice = spaPrice;
    }

    public double getValentinePrice() {
        return valentinePrice;
    }

    public void setValentinePrice(double valentinePrice) {
        this.valentinePrice = valentinePrice;
    }

    public double getBankPrice() {
        return bankPrice;
    }

    public void setBankPrice(double bankPrice) {
        this.bankPrice = bankPrice;
    }

    public double getSummerDeal() {
        return summerDeal;
    }

    public void setSummerDeal(double summerDeal) {
        this.summerDeal = summerDeal;
    }

    public double getDeal20() {
        return deal20;
    }

    public void setDeal20(double deal20) {
        this.deal20 = deal20;
    }

    public double getDeal10() {
        return deal10;
    }

    public void setDeal10(double deal10) {
        this.deal10 = deal10;
    }
    
}
