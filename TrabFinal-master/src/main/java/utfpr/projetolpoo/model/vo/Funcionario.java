/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import utfpr.projetolpoo.model.vo.Cargo;
import utfpr.projetolpoo.model.vo.Cargo;
import utfpr.projetolpoo.model.vo.Endereco;
import utfpr.projetolpoo.model.vo.Endereco;
import utfpr.projetolpoo.model.vo.Gerente;
import utfpr.projetolpoo.model.vo.Gerente;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;

/**
 *
 * @author ALUNO
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario extends Pessoa{
    //@Column(nullable=false, unique=true)
    private double salario;
    
    //@Column(nullable=false, unique=true)
    private int pis;
    
    //@Column(nullable=false, unique=true)
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Gerente gerente;
    
    //@Column(nullable=false, unique=true)
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Cargo cargo;

    public Funcionario() {
    }
    
    public Funcionario(double salario, int pis, Gerente gerente, Cargo cargo, String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        super(nome, idade, tel, cel, cpf, rg, nascimento, endereco);
        this.salario = salario;
        this.pis = pis;
        this.gerente = gerente;
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
}
