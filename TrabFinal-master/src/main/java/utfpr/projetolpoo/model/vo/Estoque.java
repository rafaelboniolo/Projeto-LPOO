/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author NataN
 */
@Entity
public class Estoque {
    @Id
    @GeneratedValue
    private long codEstoque;
    
    @OneToMany(mappedBy = "estoque")
    private List<Produto> produtos;
            
    @OneToMany(mappedBy = "estoque")
    private List<Fornecedor> fornecedores;

    public Estoque() {
    }
    
    public Estoque(List<Produto> produtos, List<Fornecedor> fornecedores) {
        this.produtos = produtos;
        this.fornecedores = fornecedores;
    }
    
    boolean adicionar(Produto p){
        return false;
    }
    
    boolean remover(Produto p){
        return false;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    
}