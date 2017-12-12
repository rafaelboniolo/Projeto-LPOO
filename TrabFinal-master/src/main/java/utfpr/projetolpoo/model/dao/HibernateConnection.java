/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author ALUNO
 */
public class HibernateConnection {
    
    private static EntityManagerFactory factory;
    
    //public static Connection connection = null; // manages connection
 
    private HibernateConnection(){
        
    }

    public static EntityManager getEntityManager(){
        if(factory == null || !factory.isOpen()){
            factory = Persistence.createEntityManagerFactory("ClinicaMedica");
        } 
        return factory.createEntityManager();
    }
    
    public static void close(){
        factory.close();
    }
}
