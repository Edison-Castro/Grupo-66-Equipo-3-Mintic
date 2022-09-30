package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstado;
	
	@Column(name = "estadoPlanilla", nullable = false, length = 20)
	private String estadoPlanilla;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstadoPlanilla() {
		return estadoPlanilla;
	}

	public void setEstadoPlanilla(String estadoPlanilla) {
		this.estadoPlanilla = estadoPlanilla;
	}
	

	
}
