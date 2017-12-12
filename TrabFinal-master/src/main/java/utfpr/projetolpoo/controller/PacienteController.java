/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Paciente;

/**
 *
 * @author ALUNO
 */
public class PacienteController {
    private GenericDAO<Paciente> genericDao;
    
    public PacienteController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Paciente paciente) {
        return genericDao.insert(paciente);
    }
    
    public void remover (Paciente paciente) {
        genericDao.remove(paciente);
    }
    
    public void atualizar(Paciente paciente){
        genericDao.update(paciente);
    }
    
    public List buscarTodos()
    {
        List<Paciente> pacientes = genericDao.listAll(Paciente.class);
        
        return pacientes;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Paciente> pacientes = genericDao.listAll(Paciente.class, first, max);
        
        return pacientes;
    }
    
    public Paciente buscarUm(long id){
        Paciente pacientes = genericDao.findOne(id, Paciente.class);
        
        return pacientes;
    }
    
    public List listarConformeCampo(String atriNome, String atriCPF, String valorNome, String valorCPF){
        List<Paciente> pacientes = genericDao.refreshDinamico(Paciente.class, atriNome, atriCPF, valorNome, valorCPF);
        
        return pacientes;
    }
}
