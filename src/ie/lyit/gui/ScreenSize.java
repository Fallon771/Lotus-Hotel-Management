/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.gui;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jim
 */
public class ScreenSize {
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
    private double xScreen;
    private double yScreen;
    
    public ScreenSize(){
       
        xScreen = screenSize.getWidth();
        yScreen = screenSize.getHeight();   
    }
   
    public double getScreenWidth(){
        return xScreen;
    }
    public double getScreenHeight(){
        return yScreen;
    }  
}
