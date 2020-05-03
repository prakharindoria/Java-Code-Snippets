/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockappletmultithreading;

import java.util.Date;

/**
 *
 * @author wweeeeeee
 */
public class MyClockThread implements Runnable {
    
    Thread t;
    MyClockApplet ma;
    MyClockThread(MyClockApplet ma){
    this.ma=ma;
    t=new Thread(this);
    }

    @Override
    public void run() {
        while(true)
        {
        ma.d=new Date();
        ma.repaint();
        try{
        Thread.sleep(1000);
       }
        catch(InterruptedException e)
        {System.out.println("Invalid");}
        
        }//To change body of generated methods, choose Tools | Templates.
    }
    
}
