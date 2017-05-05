/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Time {
    
    
    public static void deley(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error delay: " + e);
        }
        
    }
    
    public void alarma(){
    
        Scanner sc = new Scanner (System.in);
        
             
        System.out.println("-------ALARMA-------");
        System.out.print("En cuantas horas desea que te despierte: ");
        int hora = sc.nextInt();

        for (int i = 0; i < hora; i++) {
            
           
                            
            for (int j = 0; j < 60; j++) {
              
                for (int k = 0; k < 60; k++) {
                    
                
                 System.out.println(i+ ":" + j + ":" + k );
                 Time.deley();
                  
                 
                }
            }
            }
        
        System.out.println("!!Despierta!!");
            
        }
       
}   
