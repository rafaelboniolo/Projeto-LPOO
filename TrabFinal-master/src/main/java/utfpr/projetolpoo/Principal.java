/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo;

import javax.persistence.EntityManager;
import utfpr.projetolpoo.controller.EnfermeiroController;
import utfpr.projetolpoo.controller.PacienteController;
import utfpr.projetolpoo.controller.SistemaController;
import utfpr.projetolpoo.model.dao.HibernateConnection;
import utfpr.projetolpoo.model.vo.Enfermeiro;
import utfpr.projetolpoo.model.vo.Paciente;
import utfpr.projetolpoo.view.loginInicio.InicioView;
import utfpr.projetolpoo.view.loginInicio.LoginView;

/**
 *
 * @author ALUNO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateConnection.getEntityManager();
        new LoginView().setVisible(true);

    }
    
}
