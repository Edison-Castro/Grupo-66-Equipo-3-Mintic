package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PuntosRecaudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPuntoRecaudo;
	
	@Column(name = "nombrePuntoRecaudo", nullable = false, length = 150)
	private String nombrePuntoRecaudo;

	public Integer getIdPuntoRecaudo() {
		return idPuntoRecaudo;
	}

	public void setIdPuntoRecaudo(Integer idPuntoRecaudo) {
		this.idPuntoRecaudo = idPuntoRecaudo;
	}

	public String getNombrePuntoRecaudo() {
		return nombrePuntoRecaudo;
	}

	public void setNombrePuntoRecaudo(String nombrePuntoRecaudo) {
		this.nombrePuntoRecaudo = nombrePuntoRecaudo;
	}
	
	

}
