package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto;

import java.util.Date;

public class SolicitudAltaReqAmbulanciaDto {

	private Integer claveCama;
	private Integer claveConfCama;
	private Integer claveIngreso;
	private Integer claveSolicitud;
	private Integer claveTipoSolicitud;
	private String  desEspecialidad;
	private Date    fechaSolicitud;
	private String  nombrePaciente;
	private String  poblacion;
	public Integer getClaveCama() {
		return claveCama;
	}
	public void setClaveCama(Integer claveCama) {
		this.claveCama = claveCama;
	}
	public Integer getClaveConfCama() {
		return claveConfCama;
	}
	public void setClaveConfCama(Integer claveConfCama) {
		this.claveConfCama = claveConfCama;
	}
	public Integer getClaveIngreso() {
		return claveIngreso;
	}
	public void setClaveIngreso(Integer claveIngreso) {
		this.claveIngreso = claveIngreso;
	}
	public Integer getClaveSolicitud() {
		return claveSolicitud;
	}
	public void setClaveSolicitud(Integer claveSolicitud) {
		this.claveSolicitud = claveSolicitud;
	}
	public Integer getClaveTipoSolicitud() {
		return claveTipoSolicitud;
	}
	public void setClaveTipoSolicitud(Integer claveTipoSolicitud) {
		this.claveTipoSolicitud = claveTipoSolicitud;
	}
	public String getDesEspecialidad() {
		return desEspecialidad;
	}
	public void setDesEspecialidad(String desEspecialidad) {
		this.desEspecialidad = desEspecialidad;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	
	
	
	
}
