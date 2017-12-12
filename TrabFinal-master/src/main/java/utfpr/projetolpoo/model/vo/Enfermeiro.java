/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author ALUNO
 */

@Entity
public class Enfermeiro extends Funcionario{
    
    @OneToMany(mappedBy = "enfermeiro")
    private List<Paciente> pacientes;

    public Enfermeiro() {
    }
    
    public Enfermeiro(List<Paciente> pacientes, double salario, int pis, Gerente gerente, Cargo cargo, String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        super(salario, pis, gerente, cargo, nome, idade, tel, cel, cpf, rg, nascimento, endereco);
        this.pacientes = pacientes;
    }
    
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    
    
}
