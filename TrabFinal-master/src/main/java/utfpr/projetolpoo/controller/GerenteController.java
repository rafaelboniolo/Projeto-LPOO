/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Gerente;

/**
 *
 * @author ALUNO
 */
public class GerenteController {
    private GenericDAO<Gerente> genericDao;
    
    public GerenteController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Gerente gerente) {
        return genericDao.insert(gerente);
    }
    
    public boolean remover (Gerente gerente) {
        return genericDao.remove(gerente);
    }
    
    public boolean atualizar(Gerente gerente){
        return genericDao.update(gerente);
    }
    
    public List buscarTodos()
    {
        List<Gerente> gerentes = genericDao.listAll(Gerente.class);
        
        return gerentes;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Gerente> gerentes = genericDao.listAll(Gerente.class, first, max);
        
        return gerentes;
    }
    
    public Gerente buscarUm(long id){
        Gerente gerentes = genericDao.findOne(id, Gerente.class);
        
        return gerentes;
    }
    
    /*public List listarConformeCampo(String string){
        List<Gerente> gerentes = genericDao.refresh(Gerente.class, string);
        
        return gerentes;
    }*/
}
