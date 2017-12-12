/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo.abstrato;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import utfpr.projetolpoo.model.vo.Endereco;

/**
 *
 * @author ALUNO
 */

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private long codPessoa;
    
    //@Column(nullable=false)
    private String nome;
    
    //@Column(nullable=false, length = 3)
    private int idade;
    
    //@Column(nullable=false, unique=true, length = 13)
    private String tel;
    
    //@Column(nullable=false, unique=true, length = 14)
    private String cel;
    
    //@Column(nullable=false, unique=true, length = 14)
    private String cpf;
    
    //@Column(nullable=false, unique=true, length = 12)
    private String rg;
    
    //@Column(nullable=false, length = 10)
    //@Temporal(TemporalType.DATE)
    private Date nascimento;
    
    //@Column(nullable = false)
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Endereco endereco;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tel = tel;
        this.cel = cel;
        this.cpf = cpf;
        this.rg = rg;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
