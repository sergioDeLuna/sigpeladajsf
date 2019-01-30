package com.futebol.sigpeladajsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.futebol.sigpeladajsf.dominio.Time;
import com.futebol.sigpeladajsf.service.TimeService;

/**
 * Bean de Time
 * @author sergioluna
 *
 */
@ManagedBean(name="timeBean")
@SessionScoped
public class TimeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Time
	 */
	private Time time = new Time();
	
	/**
	 * Lista de Times
	 */
	private List<Time> times = new ArrayList<Time>();
	
	/**
	 * Service de Time
	 */
	private TimeService timeService = new TimeService();
	
	/**
	 * Método para salvar
	 * @param event
	 */
	public void salvar(ActionEvent event) {
		timeService.salvar(time);
		time = new Time();
		times = timeService.recuperar();
		
	}
	
	/**
	 * Método para Editar
	 */
	public void editar() {
		time = timeService.recuperarPorId(time.getId());
	}
	
	/**
	 * Método para Excluir
	 */
	public void excluir() {
		timeService.excluir(time.getId());
		times = timeService.recuperar();
	}
	
	/**
	 * Método para voltar
	 */
	public void voltar() {
		this.time = null;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	/**
	 * @return the times
	 */
	public List<Time> getTimes() {
		return times;
	}

	/**
	 * @param times the times to set
	 */
	public void setTimes(List<Time> times) {
		this.times = times;
	}

}
