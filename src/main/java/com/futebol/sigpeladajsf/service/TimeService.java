package com.futebol.sigpeladajsf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.futebol.sigpeladajsf.dao.TimeDao;
import com.futebol.sigpeladajsf.dominio.Time;

/**
 * Service de Time
 * @author sergioluna
 *
 */
@Service
//@Transactional
public class TimeService {
	
	/**
	 * TimeDao
	 */
    private TimeDao timeDao = new TimeDao();
    
    /**
     * Salvar time
     * @param time
     */
    public void salvar(Time time) {
    	timeDao.salvar(time);
    }
    
    /**
     * Recuperar times
     * @return
     */
    //@Transactional(readOnly = true)
    public List<Time> recuperar() {
        return timeDao.recuperar();
    }
    
    /**
     * Recuperar um time passando id
     * @param id
     * @return
     */
    //@Transactional(readOnly = true)
    public Time recuperarPorId(int id) {
        return timeDao.recuperarPorID(id);
    }
    
    /**
     * Atualizar time
     * @param time
     */
    public void atualizar(Time time) {
        timeDao.atualizar(time);
    }
    
    /**
     * Excluir time
     * @param id
     */
    public void excluir(int id) {
        timeDao.excluir(id);
        
    }
 
}

