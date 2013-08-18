package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto;

public class VMRegSalidaAmbulanciaDto {

	private RegistroAmbulanciaDto registroLlegada;
	private SolicitudAltaReqAmbulanciaDto camas;
	
	public RegistroAmbulanciaDto getRegistroLlegada() {
		return registroLlegada;
	}
	public void setRegistroLlegada(RegistroAmbulanciaDto registroLlegada) {
		this.registroLlegada = registroLlegada;
	}
	public SolicitudAltaReqAmbulanciaDto getCamas() {
		return camas;
	}
	public void setCamas(SolicitudAltaReqAmbulanciaDto camas) {
		this.camas = camas;
	}
	
}
