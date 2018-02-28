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
        System.out.print("[Thread 3:]Price Check Started... :)\n");
        while(running){
            try{
            sleep(300);
                packageCost = MainFrame.getPackageCost();
                roomCost = MainFrame.getRoomCost();
                double pack = Double.parseDouble(packageCost);
                double room = Double.parseDouble(roomCost);   
                total = pack+room;
                if(MainFrame.getDeal10().isSelected()){
                    MainFrame.setTotal((total*0.90));
                }
                else if(MainFrame.getBankR().isSelected()){
                    MainFrame.setTotal((total*1.50));
                }
                else if(MainFrame.getValR().isSelected()){
                    MainFrame.setTotal((total*1.25));
                }
                else if(MainFrame.getSummerR().isSelected()){
                    MainFrame.setTotal((total*0.85));
                }
                else if(MainFrame.getDeal20().isSelected()){
                    MainFrame.setTotal((total*0.80));
                }  
                else{
                    MainFrame.setTotal(total);
                }
            }
            catch(Exception e){
            
            }
            
        }
    }
}
