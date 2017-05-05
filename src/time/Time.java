/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

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
}
