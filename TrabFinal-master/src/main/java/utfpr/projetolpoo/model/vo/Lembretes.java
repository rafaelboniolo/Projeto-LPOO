/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Point;
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

    public Lembretes(JDateChooser jd1, JTextArea lembrete, JTextField titulo) {
        this.data = String.valueOf(jd1.getDate().getDay()+"/"+jd1.getDate().getMonth()+"/"+(jd1.getDate().getYear()-100));
        
        this.lembrete = lembrete.getText();
        this.titulo = titulo.getText();
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
    
    
}
