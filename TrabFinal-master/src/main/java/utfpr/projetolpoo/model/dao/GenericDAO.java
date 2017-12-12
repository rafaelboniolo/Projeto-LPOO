/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ALUNO
 */
public class GenericDAO<E> implements iGenericDAO<E>{

    EntityManager manager;
    
    public void commit()
    {
        manager.getTransaction().commit();
    }

    @Override
    public Boolean insert(E object) {
        manager = HibernateConnection.getEntityManager();
        manager.getTransaction().begin();
            manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " salvo com sucesso!");
        manager.close();
        return true;
    }

    @Override
    public Boolean update(E object) {
        manager = HibernateConnection.getEntityManager();
        manager.getTransaction().begin();
            manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " atualizado som sucesso!");
        manager.close();
        return true;
    }

    @Override
    public Boolean remove(E object) {
        manager = HibernateConnection.getEntityManager();
        manager.getTransaction().begin();
            manager.remove(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " excluído som sucesso!");
        manager.close();
        return true;
    }

    @Override
    public List<E> listAll(Class object) {
        manager = HibernateConnection.getEntityManager();
        String jpql = " SELECT e FROM " + object.getTypeName() + " e";
        Query query = manager.createQuery(jpql);
        List<E> objects = query.getResultList();
        manager.close();
        return objects;
    }

    @Override
    public List<E> listAll(Class object,Long first, Long max) {
        manager = HibernateConnection.getEntityManager();
        //SELECT campos FROM tabela WHERE campo BETWEEN inicio_intervalo AND fim_intervalo;
        String jpql = " SELECT e FROM " + object.getTypeName() + " e WHERE e.id BETWEEN "+ first +" AND " + max;
        Query query = manager.createQuery(jpql);
        List<E> objects = query.getResultList();
        manager.close();
        return objects;
    }

    @Override
    public E findOne(Long id, Class object) {
        manager = HibernateConnection.getEntityManager();
        E obj = (E)manager.find(object , id);
        manager.close();
        return obj;
    }

    //Não está no iGenericDAO
    public List<E> refreshDinamico(Class object, String atriNome, String atriCPF, String valorNome, String valorCPF) {
        manager = HibernateConnection.getEntityManager();
        //"SELECT * FROM tb_cliente c WHERE c.CLI_CPF LIKE ? OR c.CLI_NOME LIKE ?        
        String jpql = "SELECT e FROM " + object.getTypeName() + " WHERE " + atriNome + " LIKE :value OR"
                + atriCPF + " LIKE :value2";
        Query query = manager.createQuery(jpql);
        query.setParameter("value", "%" + valorNome + "%");
        query.setParameter("value2", "%" + valorCPF + "%");
        List<E> objects = query.getResultList();
        manager.close();
        return objects;
    }
    
}
