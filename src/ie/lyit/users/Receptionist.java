/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.users;

/**
 *
 * @author James F.
 */
public class Receptionist {
    
    private String fName;
    private String sName;
    private int id;
    
    public Receptionist(String fName,String sName,int id){
    
        this.fName = fName;
        this.sName = sName;
        this.id = id;
        
    }
    // Action Methods
    public void checkRoom(){
    
    }
    public void checkInGuest(){
    
    }
    public void checkOutGuest(){
    
    }
    public  void generateBill(){
    
    }
    public void bookRoom(){
    
    }
    public void feedBack(){
    
    }

    @Override
    public String toString() {
        return "Receptionist{" + "fName=" + fName + ", sName=" + sName + ", id=" + id + '}';
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
