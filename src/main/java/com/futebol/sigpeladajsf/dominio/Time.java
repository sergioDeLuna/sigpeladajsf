package com.futebol.sigpeladajsf.dominio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Classe domínio para Time
 * @author sergioluna
 *
 */
@Entity
@Table(name = "times")
public class Time {
	/**
	 * Id
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    /**
     * Nome do Time
     */
    @Column(nullable = false, length = 60)
    private String nome;
    
    /**
     * Uniforme do Time
     */
    @Column(nullable = false)
    private String uniforme;
    

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the uniforme
	 */
	public String getUniforme() {
		return uniforme;
	}

	/**
	 * @param uniforme the uniforme to set
	 */
	public void setUniforme(String uniforme) {
		this.uniforme = uniforme;
	}

    
 
}

