/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.hotel;
/**
 *
 * @author james f
 */
public class Bill {
    
    private float amount;
    private Date date;
    

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
}
