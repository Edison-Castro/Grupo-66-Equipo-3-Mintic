package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Representante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRepresentante;
	
	@Column(name = "nombreRepresentante", nullable = false, length = 150)
	private String nombreRepresentante;
	
	public Integer getIdRepresentante() {
		return idRepresentante;
	}
	
	public String getNombreRepresentante() {
		return nombreRepresentante;
	}
	
	public void setIdRepresentante(Integer idRepresentante) {
		this.idRepresentante = idRepresentante;
	}
	
	public void setNombreRepresentante(String nombreRepresentante) {
		this.nombreRepresentante = nombreRepresentante;
	}
	
}
