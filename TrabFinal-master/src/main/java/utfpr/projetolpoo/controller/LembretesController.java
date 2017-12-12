/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.Date;
import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Lembretes;

/**
 *
 * @author User
 */
public class LembretesController extends GenericDAO<Lembretes>{
    
    GenericDAO<Lembretes> genericDAO;

    public LembretesController() {
        this.genericDAO = new GenericDAO<>();
    }
    
    public boolean gravar(Lembretes l){
        return this.insert(l);
    }
    public List buscar(){
        return this.listAll(Lembretes.class);
    }
    public boolean alarme(Date date){
        System.out.println(new Date().compareTo(date));
        return false;
    }
    
    
}
