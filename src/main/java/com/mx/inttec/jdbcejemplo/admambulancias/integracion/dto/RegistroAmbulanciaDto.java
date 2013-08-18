package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto;

import java.util.Date;

public class RegistroAmbulanciaDto {

	private Integer claveCama;
	private Integer claveIngreso;
	private Integer claveLlegada;
	private Integer claveSalida;
	private Integer claveSolicitud;
	private String claveUnidad;
	private String comentario;
	private Boolean conPaciente;
	private String destino;
	private Date fechaLlegada;
	private Date fechaSalida;
	private String origen;
	private String placas;
	
	public Integer getClaveCama() {
		return claveCama;
	}
	public void setClaveCama(Integer claveCama) {
		this.claveCama = claveCama;
	}
	public Integer getClaveIngreso() {
		return claveIngreso;
	}
	public void setClaveIngreso(Integer claveIngreso) {
		this.claveIngreso = claveIngreso;
	}
	public Integer getClaveLlegada() {
		return claveLlegada;
	}
	public void setClaveLlegada(Integer claveLlegada) {
		this.claveLlegada = claveLlegada;
	}
	public Integer getClaveSalida() {
		return claveSalida;
	}
	public void setClaveSalida(Integer claveSalida) {
		this.claveSalida = claveSalida;
	}
	public Integer getClaveSolicitud() {
		return claveSolicitud;
	}
	public void setClaveSolicitud(Integer claveSolicitud) {
		this.claveSolicitud = claveSolicitud;
	}
	public String getClaveUnidad() {
		return claveUnidad;
	}
	public void setClaveUnidad(String claveUnidad) {
		this.claveUnidad = claveUnidad;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Boolean getConPaciente() {
		return conPaciente;
	}
	public void setConPaciente(Boolean conPaciente) {
		this.conPaciente = conPaciente;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
	
	
}
