/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import javax.persistence.EntityManager;
import utfpr.projetolpoo.model.dao.HibernateConnection;

/**
 *
 * @author ALUNO
 */
public class SistemaController {
    
    public void end(){
        HibernateConnection.close();
    }
}
