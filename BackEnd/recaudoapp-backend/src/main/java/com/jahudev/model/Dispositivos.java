package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispositivos")
public class Dispositivos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDispositivo;
	
	@Column(name = "consecutivoDispositivo", nullable = false, length = 20, unique = true)
	private String consecutivoDispositivo;

	public Integer getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(Integer idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getConsecutivoDispositivo() {
		return consecutivoDispositivo;
	}

	public void setConsecutivoDispositivo(String consecutivoDispositivo) {
		this.consecutivoDispositivo = consecutivoDispositivo;
	}

}
