/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public interface iGenericDAO<E> {
    
    Boolean insert(E object);
    Boolean update(E object);
    Boolean remove(E object);
    List<E> listAll(Class object);
    List<E> listAll(Class object, final Long first,final Long max);
    E findOne(Long id, Class object);
    List<E> refreshDinamico(Class object, String atriNome, String atriCPF, String valorNome, String valorCPF);
}
