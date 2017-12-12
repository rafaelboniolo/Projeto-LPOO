/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Report;

/**
 *
 * @author User
 */
public class ReportController extends GenericDAO<Report>{
    GenericDAO<Report> genericDao;
    
    public ReportController() {
        this.genericDao = new GenericDAO<>();
    }
    
    public boolean gravar(Report r){
        return this.genericDao.insert(r);
    }
}
