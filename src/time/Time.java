/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Time {

    private int minute;
    private int m;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    private static void delaySecond() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error delay: ");
        }

    }

    public void timer() {

         System.out.println("TIEMPO");
        for (int i = minute; i >= 0; i--) {

            for (int second =60; second >= 0; second --) {

                System.out.println(i-1 + " : " + second);
                delaySecond();

            }
           // System.out.println(i);
        }

        System.out.println("RINGGG!! Ya han transcurrido " + m + " minutos");

    }

    private String InciarCrono;
    
    public String getInciarCrono() {
        return InciarCrono;
    }
    public void setInciarCrono(String InciarCrono) {
        this.InciarCrono = InciarCrono;
    }
    
    public static void DelayCronometro(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crono(){
        Scanner sc = new Scanner(System.in);
        
        if(getInciarCrono().equalsIgnoreCase("i")){
            int minutos = 0;
            int segundos = 0;
            for (int i = minutos; i <= 60; i++) {
                for (int j = segundos; j <= 60; j++) {
                    segundos++;
                    if(segundos == 60){
                        segundos = 0;
                        minutos++;
                    }
                    System.out.println(minutos + ":" + segundos);
                    DelayCronometro();
                }  
            }
        }
    }
    
    
    
    
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
