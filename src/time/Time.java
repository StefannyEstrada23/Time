/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author APRENDIZ
 */
public class Time {
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
    
    
    
}
