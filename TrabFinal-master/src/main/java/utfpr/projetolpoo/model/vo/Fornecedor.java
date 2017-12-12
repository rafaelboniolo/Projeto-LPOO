/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;

/**
 *
 * @author NataN
 */
@Entity
public class Fornecedor extends Pessoa{
    //@Column(nullable=false, unique=true)
    @ManyToOne
    private Estoque estoque;
    
    //@Column(nullable=false, unique=true)
    @OneToOne(mappedBy = "fornecedor", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private DadosBancarios dadosBancarios;
    
    //@Column(nullable=false, unique=true)
    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

    public Fornecedor() {
    }
    
    public Fornecedor(Estoque estoque, DadosBancarios dadosBancarios, List<Produto> produtos, String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        super(nome, idade, tel, cel, cpf, rg, nascimento, endereco);
        this.estoque = estoque;
        this.dadosBancarios = dadosBancarios;
        this.produtos = produtos;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
    
    
}
