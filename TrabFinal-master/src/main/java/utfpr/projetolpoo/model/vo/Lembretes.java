/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
@Entity
public class Lembretes {
    @Id
    @GeneratedValue
    Long id;
    
    String data;
    String lembrete;
    String titulo;
   private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Lembretes(JDateChooser jd1, JTextArea lembrete, JTextField titulo) {
        this.data = converteDateToString2(jd1.getDateEditor().getDate());
        
        this.lembrete = lembrete.getText();
        this.titulo = titulo.getText();
    }
    
     public static String converteDateToString2(Date data) {
        try {
            sdf= new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(data);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }
    
    public Lembretes() {
    }

    public Long getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getLembrete() {
        return lembrete;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLembrete(String lembrete) {
        this.lembrete = lembrete;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Lembretes.sdf = sdf;
    }
    
    
}
