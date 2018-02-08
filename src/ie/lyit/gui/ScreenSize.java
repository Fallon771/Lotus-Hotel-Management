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
    
    private int xScreen = screenSize.width;
    private int yScreen = screenSize.height;
   
    public int getScreenWidth(){
        return xScreen;
    }
    public int getScreenHeight(){
        return yScreen;
    }  
}
