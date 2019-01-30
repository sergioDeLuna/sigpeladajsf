package com.futebol.sigpeladajsf.beans;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.futebol.sigpeladajsf.dominio.Time;
import com.futebol.sigpeladajsf.service.TimeService;


@Named
@Scope("session")
public class TimeBean {

	private Time time;
	private List<Time> times;
	
	@Inject
	private TimeService timeService;

	public void iniciarBean() {
		times = timeService.recuperar();
	}

	public void novotime() {
		time = new Time();
	}

	public void salvar() {
		timeService.salvar(time);
		times = timeService.recuperar();
		time = null;
	}

	public void editar(Time time) {
		this.time = time;
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
