/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author NataN
 */
@Entity
public class Cargo {
    @Id
    @GeneratedValue
    private int codCargo;
    //@Column(nullable=false)
    private String descricaoCargo;
    
    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;

    public Cargo() {
    }
    
    public Cargo(String descricaoCargo, List<Funcionario> funcionarios) {
        this.descricaoCargo = descricaoCargo;
        this.funcionarios = funcionarios;
    }
    
    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
