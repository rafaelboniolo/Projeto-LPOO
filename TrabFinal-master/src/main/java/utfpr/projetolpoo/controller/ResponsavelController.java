/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Responsavel;

/**
 *
 * @author ALUNO
 */
public class ResponsavelController {
    private GenericDAO<Responsavel> genericDao;
    
    public ResponsavelController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Responsavel responsavel) {
        return genericDao.insert(responsavel);
    }
    
    public boolean remover (Responsavel responsavel) {
        return genericDao.remove(responsavel);
    }
    
    public boolean atualizar(Responsavel responsavel){
        return genericDao.update(responsavel);
    }
    
    public List buscarTodos()
    {
        List<Responsavel> responsaveis = genericDao.listAll(Responsavel.class);
        
        return responsaveis;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Responsavel> responsaveis = genericDao.listAll(Responsavel.class, first, max);
        
        return responsaveis;
    }
    
    public Responsavel buscarUm(long id){
        Responsavel responsaveis = genericDao.findOne(id, Responsavel.class);
        
        return responsaveis;
    }
    
    public List listarConformeCampo(String atriNome, String atriCPF, String valorNome, String valorCPF){
        List<Responsavel> responsaveis = genericDao.refreshDinamico(Responsavel.class, atriNome, atriCPF, valorNome, valorCPF);
        
        return responsaveis;
    }
}
