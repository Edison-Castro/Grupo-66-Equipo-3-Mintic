package com.jahudev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipoSobre")
public class TipoSobre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoSobre;
	
	@Column(name = "tipoSobre", nullable = false, length = 20)
	private String tipoSobre;

	public Integer getIdTipoSobre() {
		return idTipoSobre;
	}

	public void setIdTipoSobre(Integer idTipoSobre) {
		this.idTipoSobre = idTipoSobre;
	}

	public String getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(String tipoSobre) {
		this.tipoSobre = tipoSobre;
	}
	
	
	

}
