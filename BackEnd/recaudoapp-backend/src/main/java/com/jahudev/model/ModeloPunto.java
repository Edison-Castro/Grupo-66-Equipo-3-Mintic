package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModeloPunto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idModelo;
	
	@Column(name = "modelo", nullable = false, length = 50)
	private String modelo;

	public Integer getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
