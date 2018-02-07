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
    
    private int amount;
    private Date date;
    

public Bill(int amount,Date date){
    this.amount = amount;
    this.date = date;
    }    
    
    // Getter's & Setter's
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
