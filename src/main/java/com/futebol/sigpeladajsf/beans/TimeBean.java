package com.futebol.sigpeladajsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.futebol.sigpeladajsf.dominio.Time;
import com.futebol.sigpeladajsf.service.TimeService;


@ManagedBean(name="timeBean")
@SessionScoped
public class TimeBean {

	private Time time = new Time();
	private List<Time> times = new ArrayList<Time>();	
	private TimeService timeService = new TimeService();
	
	public void salvar(ActionEvent event) {
		timeService.salvar(time);
		time = new Time();
		times = timeService.recuperar();
		
	}

	public void editar() {
		time = timeService.recuperarPorId(time.getId());
	}
	
	public void excluir() {
		timeService.excluir(time.getId());
		times = timeService.recuperar();
	}

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
