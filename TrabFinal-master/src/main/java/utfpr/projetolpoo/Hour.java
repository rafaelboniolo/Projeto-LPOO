/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Boniolo
 */
public class Hour {
    public void initHour(JLabel Hora){
        new Thread(new Runnable() {
            @Override
            public void run() {
                
                while(true){
                    Date d = new Date();
                    if(d.getMinutes()< 10 && d.getHours() < 10 && d.getSeconds() < 10)
                        Hora.setText(String.valueOf("0"+d.getHours())+":0"+d.getMinutes()+":0"+d.getSeconds());
                    else if(d.getMinutes()< 10 && d.getHours() < 10)
                        Hora.setText(String.valueOf("0"+d.getHours())+":0"+d.getMinutes()+":"+d.getSeconds());
                    else if(d.getMinutes()< 10)
                        Hora.setText(String.valueOf(d.getHours())+":0"+d.getMinutes()+":"+d.getSeconds());
                    else if(d.getHours() < 10)
                        Hora.setText(String.valueOf("0"+d.getHours())+":"+d.getMinutes()+":"+d.getSeconds());
                    else if(d.getSeconds() < 10)
                        Hora.setText(String.valueOf(d.getHours())+":"+d.getMinutes()+":0"+d.getSeconds());
                    else
                        Hora.setText(String.valueOf(d.getHours())+":"+d.getMinutes()+":"+d.getSeconds());
                    
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hour.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        }).start();
    }
    
    
    public void initDate(JLabel data){
        Date d = new Date(); 
        if(d.getDate()<10)
            data.setText(String.valueOf("0"+d.getDate()+"/"+d.getMonth()));
        else if (d.getMonth() < 10)
            data.setText(String.valueOf(d.getDate()+"/0"+d.getMonth()));
    }
}
