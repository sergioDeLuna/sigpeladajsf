package com.futebol.sigpeladajsf.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.futebol.sigpeladajsf.dominio.Time;

/**
 * Classe Dao de Time
 * @author sergioluna
 *
 */
@Repository
public class TimeDao {
	
	/**
	 * Gerencia a dependencia de um Ententy Manager
	 */
    //@PersistenceContext
    //private EntityManager em;

    private List<Time> listaTimes = new ArrayList<Time>();
    
    /**
     * Salva elemento
     * @param time
     */
    public void salvar(Time time) {
        //em.persist(time);
    	
    		
    	if(listaTimes.isEmpty())
    		listaTimes.add(time);
    	else if(!listaTimes.contains(time)){
    		time.setId((listaTimes.size() - 1) + 1);
    		listaTimes.add(time);
    	} else {
    		//Atualizar
    		listaTimes.get(time.getId()).setNome(time.getNome());
    		listaTimes.get(time.getId()).setUniforme(time.getUniforme());
    	}
    	
    }
    
    /**
     * Recupera lista de elementos cadastrados
     * @return
     */
    public List<Time> recuperar() {
        //return em.createQuery("select t from Time t", Time.class).getResultList();
    	return listaTimes;
    }
    
    /**
     * Recupera elemento por Id
     * @param id
     * @return
     */
    public Time recuperarPorID(int id) {
        //return em.find(Time.class, id);
    	Time time = listaTimes.get(id);
    	return time;
    }
    
    /**
     * Atualiza elemento
     * @param time
     */
    public void atualizar(Time time) {
        //em.merge(time);
    	listaTimes.remove(time.getId());
    	listaTimes.add(time);
    	
    }
    
    /**
     * Exclui elemento
     * @param id
     */
    public void excluir(int id) {
        //em.remove(em.getReference(Time.class, id));
    	listaTimes.remove(id);
    	int aux = 0;
    	
        for(Time t : listaTimes) {
        	t.setId(aux);
        	aux++;
        }
    }
 
}

