package com.jahudev.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="planilla")
public class PlanillaRecaudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nroPlanilla;
	
	@Column(name = "base", nullable = false, length = 150)
	private Integer base;
	
	@Column(name = "f_recoleccion", nullable = false)
	private LocalDateTime fechaRecoleccion;
	
	@Column(name = "f_sobre", nullable = false)
	private LocalDateTime fechaSobre;
	
	@Column(name = "numSobre", nullable = false, length = 150)
	private String numSobre;
	
	@Column(name = "observaciones", nullable = false, length = 150)
	private String observaciones;
	
	@Column(name = "valorRecaudo", nullable = false, length = 150)
	private Integer valorRecaudo;
	
	//relaciones con las demas tablas
	
	@ManyToOne
	@JoinColumn(name="fk_id_dispositivo", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_Dispositivo"))
	private Dispositivos dispositivo;
	
	@ManyToOne
	@JoinColumn(name="fk_id_estado", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_Estado"))
	private Estados estado;
	
	@ManyToOne
	@JoinColumn(name="fk_id_modeloPunto", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_ModeloPunto"))
	private ModeloPunto modeloPunto;
	
	@ManyToOne
	@JoinColumn(name="fk_id_puntoRecaudo", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_PuntoRecaudo"))
	private PuntosRecaudo puntoRecaudo;
		
	@ManyToOne
	@JoinColumn(name="fk_id_representate", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_Representante"))
	private Representante representate;
	
	@ManyToOne
	@JoinColumn(name="fk_id_tipoSobre", nullable = false, foreignKey = @ForeignKey(name= "FK_Planilla_TipoSobre"))
	private TipoSobre tipoSobre;

	//gettter and setters
	
	public Integer getNroPlanilla() {
		return nroPlanilla;
	}

	public void setNroPlanilla(Integer nroPlanilla) {
		this.nroPlanilla = nroPlanilla;
	}

	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	public LocalDateTime getFechaRecoleccion() {
		return fechaRecoleccion;
	}

	public void setFechaRecoleccion(LocalDateTime fechaRecoleccion) {
		this.fechaRecoleccion = fechaRecoleccion;
	}

	public LocalDateTime getFechaSobre() {
		return fechaSobre;
	}

	public void setFechaSobre(LocalDateTime fechaSobre) {
		this.fechaSobre = fechaSobre;
	}

	public String getNumSobre() {
		return numSobre;
	}

	public void setNumSobre(String numSobre) {
		this.numSobre = numSobre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getValorRecaudo() {
		return valorRecaudo;
	}

	public void setValorRecaudo(Integer valorRecaudo) {
		this.valorRecaudo = valorRecaudo;
	}

	public Dispositivos getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivos dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public ModeloPunto getModeloPunto() {
		return modeloPunto;
	}

	public void setModeloPunto(ModeloPunto modeloPunto) {
		this.modeloPunto = modeloPunto;
	}

	public PuntosRecaudo getPuntoRecaudo() {
		return puntoRecaudo;
	}

	public void setPuntoRecaudo(PuntosRecaudo puntoRecaudo) {
		this.puntoRecaudo = puntoRecaudo;
	}

	public Representante getRepresentate() {
		return representate;
	}

	public void setRepresentate(Representante representate) {
		this.representate = representate;
	}

	public TipoSobre getTipoSobre() {
		return tipoSobre;
	}

	public void setTipoSobre(TipoSobre tipoSobre) {
		this.tipoSobre = tipoSobre;
	}
	

	
	
}
