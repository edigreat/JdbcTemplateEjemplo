package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto;

import java.util.ArrayList;
import java.util.List;

public class VMAdmAmbulanciaDto {

	private List <RegistroAmbulanciaDto>         registroAmbulanciaList    = null;
	private List <SolicitudAltaReqAmbulanciaDto> altasConReqAmbulanciaList = null;
	private List <SolicitudAltaReqAmbulanciaDto> preAltasList = null ;
	private List <SolicitudAltaReqAmbulanciaDto> altasList    = null ;
	
	/**
	 * @return el valor de registroAmbulanciaList
	 */
	public List<RegistroAmbulanciaDto> getRegistroAmbulanciaList() {
		
		return registroAmbulanciaList == null ? 
				new ArrayList<RegistroAmbulanciaDto>(): registroAmbulanciaList;
	}
	/**
	 * @return el valor de altasConReqAmbulanciaList
	 */
	public List<SolicitudAltaReqAmbulanciaDto> getAltasConReqAmbulanciaList() {
		return altasConReqAmbulanciaList == null ? 
				new ArrayList<SolicitudAltaReqAmbulanciaDto>():
					altasConReqAmbulanciaList;
	}
	
	/**
	 * @return el valor de preAltasList
	 */
	public List<SolicitudAltaReqAmbulanciaDto> getPreAltasList() {
		return preAltasList == null ? 
				new ArrayList<SolicitudAltaReqAmbulanciaDto>():
					preAltasList ;
	}
	
	/**
	 * @return el valor de altasList
	 */
	public List<SolicitudAltaReqAmbulanciaDto> getAltasList() {
		return altasList == null ? 
				new ArrayList<SolicitudAltaReqAmbulanciaDto>():
					altasList;
	}
	/**
	 * @param registroAmbulanciaList establece el valor de registroAmbulanciaList 
	 */
	public void setRegistroAmbulanciaList(
			List<RegistroAmbulanciaDto> registroAmbulanciaList) {
		this.registroAmbulanciaList = registroAmbulanciaList;
	}
	/**
	 * @param altasConReqAmbulanciaList establece el valor de altasConReqAmbulanciaList 
	 */
	public void setAltasConReqAmbulanciaList(
			List<SolicitudAltaReqAmbulanciaDto> altasConReqAmbulanciaList) {
		this.altasConReqAmbulanciaList = altasConReqAmbulanciaList;
	}
	/**
	 * @param preAltasList establece el valor de preAltasList 
	 */
	public void setPreAltasList(List<SolicitudAltaReqAmbulanciaDto> preAltasList) {
		this.preAltasList = preAltasList;
	}
	/**
	 * @param altasList establece el valor de altasList 
	 */
	public void setAltasList(List<SolicitudAltaReqAmbulanciaDto> altasList) {
		this.altasList = altasList;
	}
	
	

}
