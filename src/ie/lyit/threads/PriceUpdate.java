/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.threads;
import ie.lyit.gui.MainFrame;
/**
 *
 * @author jim
 */
public class PriceUpdate extends Thread{
    
    MainFrame frame;
    private String roomCost;
    private String packageCost;
    private double total;
    
    public PriceUpdate(){
    
    }
    
    @Override
    public void run(){
    
        boolean running = true;
        
        while(running){
            try{
            sleep(2000);
                packageCost = MainFrame.getPackageCost();
                roomCost = MainFrame.getRoomCost();
                double pack = Double.parseDouble(packageCost);
                double room = Double.parseDouble(roomCost);   
                total = pack+room;
                MainFrame.setTotal(total);
            }
            catch(Exception e){
            
            }
            
        }
    }
}
