/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Produto;

/**
 *
 * @author ALUNO
 */
public class ProdutoController {
    private GenericDAO<Produto> genericDao;
    
    public ProdutoController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Produto produto) {
        return genericDao.insert(produto);
    }
    
    public void remover (Produto produto) {
        genericDao.remove(produto);
    }
    
    public void atualizar(Produto produto){
        genericDao.update(produto);
    }
    
    public List buscarTodos()
    {
        List<Produto> produtos = genericDao.listAll(Produto.class);
        
        return produtos;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Produto> produtos = genericDao.listAll(Produto.class, first, max);
        
        return produtos;
    }
    
    public Produto buscarUm(long id){
        Produto produtos = genericDao.findOne(id, Produto.class);
        
        return produtos;
    }
    
    public List listarConformeCampo(String atriNome, String atriCod, String valorNome, String valorCod){
        List<Produto> produtos = genericDao.refreshDinamico(Produto.class, atriNome, atriCod, valorNome, valorCod);
        
        return produtos;
    }
    
}
