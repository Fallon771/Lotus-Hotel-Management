/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.testers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jim
 */
public class CodeTest {
    
    public static void main(String args[]){
            
        String startDateString = "06/27/2007";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
        Date startDate;
        try {
            startDate = df.parse(startDateString);
            String newDateString = df.format(startDate);
            System.out.println(newDateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}
