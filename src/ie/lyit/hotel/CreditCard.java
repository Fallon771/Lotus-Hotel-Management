/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.hotel;

/**
 *
 * @author James Fallon
 * Credit card class
 */
public class CreditCard {
    
    private long cardNum;
    private int cvc;
    private int id;
    
    private String expiry;
    private String fName;
    private String sName;
    private String type;
    
    public CreditCard(){
        
    }
    public CreditCard(int id,String fName,String sName,long cardNum,String expiry,int cvc,String type){
        
        this.id = id;
        this.fName = fName;
        this.sName = sName;
        this.cardNum = cardNum;
        this.expiry = expiry;
        this.cvc = cvc;
        this.type = type;
    }
    public void addCard(){
    
    }
    public void removeCard(){
    
    }
    // Getters & Setter's
    public long getCardNum() {
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
    
    public String getType(){
        return type;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getfName() {
        return fName;
    }
    
    public int getId(){
        return id;
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
