/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Funcionario;

/**
 *
 * @author ALUNO
 */
public class FuncionarioController {
    private GenericDAO<Funcionario> genericDao;
    
    public FuncionarioController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Funcionario func) {
        return genericDao.insert(func);
    }
    
    public boolean remover (Funcionario func) {
        return genericDao.remove(func);
    }
    
    public boolean atualizar(Funcionario func){
        return genericDao.update(func);
    }
    
    public List buscarTodos()
    {
        List<Funcionario> funcionarios = genericDao.listAll(Funcionario.class);
        
        return funcionarios;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Funcionario> funcionarios = genericDao.listAll(Funcionario.class, first, max);
        
        return funcionarios;
    }
    
    public Funcionario buscarUm(long id){
        Funcionario funcionarios = genericDao.findOne(id, Funcionario.class);
        
        return funcionarios;
    }
    
    public List listarConformeCampo(String atriNome, String atriCPF, String valorNome, String valorCPF){
        List<Funcionario> funcionarios = genericDao.refreshDinamico(Funcionario.class, atriNome, atriCPF, valorNome, valorCPF);
        
        return funcionarios;
    }
}
