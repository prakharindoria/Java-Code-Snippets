/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockappletmultithreading;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Date;
import javafx.event.ActionEvent;

   


public class MyClockApplet extends Applet implements ActionListener {

    /**
     * @param args the command line arguments
     */
    MyClockThread m;
    Date d;
    
    public void start()
    {
        m=new MyClockThread(this);
        m.t.start();
        
    }
   
    public void paint(Graphics g)
    {Date today =new Date();
   Font f =new Font ("SansSerif",Font.BOLD,24);
    g.setFont(f);
    g.drawString(today.toString(),10,100);}
    
    
    public void init() {
		b1 = new Button("Start");
		add(b1);
		b1.addActionListener(this);

		b2 = new Button("Stop");
		add(b2);
		b2.addActionListener(this);
	}

	

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == b2) 
			m.t.stop();
        else if(e.getSource() == b1)
			m.t.start();
        else
            System.out.println("Invalid Button");
	}
    
    
    Button b1,b2;

}
