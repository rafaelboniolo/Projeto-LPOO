/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author NataN
 */
@Entity
public class DadosBancarios {
    @Id
    @GeneratedValue
    private long codDadosBancarios;
    
    //@Column(nullable=false, unique=true, length = 9)
    private int conta;
    
    //@Column(nullable=false, unique=true, length = 4)
    private int agenciaSemDV;
    
    //@Column(nullable=false, length = 1)
    private int dv;
    
    //@Column(nullable=false, unique=true)
    private String beneficiario;
    
    //@Column(nullable=false)
    private int op;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Fornecedor fornecedor;
    
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Funcionario funcionario;

    public DadosBancarios() {
    }
    
    public DadosBancarios(int conta, int agenciaSemDV, int dv, String beneficiario, int op, Fornecedor fornecedor, Funcionario funcionario) {
        this.conta = conta;
        this.agenciaSemDV = agenciaSemDV;
        this.dv = dv;
        this.beneficiario = beneficiario;
        this.op = op;
        this.fornecedor = fornecedor;
        this.funcionario = funcionario;
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getAgenciaSemDV() {
        return agenciaSemDV;
    }

    public void setAgenciaSemDV(int agenciaSemDV) {
        this.agenciaSemDV = agenciaSemDV;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }
}
