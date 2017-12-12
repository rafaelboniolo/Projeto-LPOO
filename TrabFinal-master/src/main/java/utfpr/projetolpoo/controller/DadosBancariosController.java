/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.DadosBancarios;

/**
 *
 * @author ALUNO
 */
public class DadosBancariosController {
    private GenericDAO<DadosBancarios> genericDao;
    
    public DadosBancariosController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(DadosBancarios dado) {
        return genericDao.insert(dado);
    }
    
    public boolean remover (DadosBancarios dado) {
        return genericDao.remove(dado);
    }
    
    public boolean atualizar(DadosBancarios dado){
        return genericDao.update(dado);
    }
    
    public List buscarTodos()
    {
        List<DadosBancarios> dadosBancs = genericDao.listAll(DadosBancarios.class);
        
        return dadosBancs;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<DadosBancarios> dadosBancs = genericDao.listAll(DadosBancarios.class, first, max);
        
        return dadosBancs;
    }
    
    public DadosBancarios buscarUm(long id){
        DadosBancarios dadosBancs = genericDao.findOne(id, DadosBancarios.class);
        
        return dadosBancs;
    }
    
    /*public List listarConformeCampo(String string){
        List<DadosBancarios> dadosBancs = genericDao.refreshDinamico(DadosBancarios.class, string);
        
        return dadosBancs;
    }*/
}
