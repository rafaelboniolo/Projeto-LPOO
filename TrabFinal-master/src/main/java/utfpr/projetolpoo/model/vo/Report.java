/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import com.toedter.components.JSpinField;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
@Entity
public class Report {
    @Id
    @GeneratedValue
    Long id;
    
    String setor;
    int qtd;
    String erro;

    public Report() {
    }

    public Report(JTextField setor,JSpinner qtd,JTextArea erro) {
        this.setor = setor.getText();
        this.qtd = (int) qtd.getValue();
        this.erro = erro.getText();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
