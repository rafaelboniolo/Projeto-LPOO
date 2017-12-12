/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.Date;
import utfpr.projetolpoo.model.vo.interfaces.iPagamento;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author NataN
 */

@Entity
public class Gerente extends Funcionario{
    
    @Transient
    private iPagamento pagamento;

    public Gerente() {
    }
    
    public Gerente(iPagamento pagamento, double salario, int pis, Gerente gerente, Cargo cargo, String nome, int idade, String tel, String cel, String cpf, String rg, Date nascimento, Endereco endereco) {
        super(salario, pis, gerente, cargo, nome, idade, tel, cel, cpf, rg, nascimento, endereco);
        this.pagamento = pagamento;
    }
    
    public iPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(iPagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
}
