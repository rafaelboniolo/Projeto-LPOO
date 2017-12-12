/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Enfermeiro;

/**
 *
 * @author ALUNO
 */
public class EnfermeiroController {
    private GenericDAO<Enfermeiro> genericDao;
    
    public EnfermeiroController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Enfermeiro enf) {
        return genericDao.insert(enf);
    }
    
    public boolean remover (Enfermeiro enf) {
        return genericDao.remove(enf);
    }
    
    public boolean atualizar(Enfermeiro enf){
        return genericDao.update(enf);
    }
    
    public List buscarTodos()
    {
        List<Enfermeiro> enfermeiros = genericDao.listAll(Enfermeiro.class);
        
        return enfermeiros;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Enfermeiro> enfermeiros = genericDao.listAll(Enfermeiro.class, first, max);
        
        return enfermeiros;
    }
    
    public Enfermeiro buscarUm(long id){
        Enfermeiro enfermeiro = genericDao.findOne(id, Enfermeiro.class);
        
        return enfermeiro;
    }
    
    public List listarConformeCampo(String atriNome, String atriCPF, String valorNome, String valorCPF){
        List<Enfermeiro> enfermeiros = genericDao.refreshDinamico(Enfermeiro.class, atriNome, atriCPF, valorNome, valorCPF);
        
        return enfermeiros;
    }
}
