/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.hotel;

/**
 *
 * @author jim
 */
public class CreditCard {
    
    private int cardNum;
    private int cvc;
    
    private String expiry;
    private String fName;
    private String sName;
    
    public CreditCard(){
        
    }
    public CreditCard(int id,String fName,String sName,int cardNum,String expiry,int cvc){
        this.fName = fName;
        this.sName = sName;
        this.cardNum = cardNum;
        this.expiry = expiry;
        this.cvc = cvc;
    }
    public void addCard(){
    
    }
    public void removeCard(){
    
    }
    // Getters & Setter's
    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
}
