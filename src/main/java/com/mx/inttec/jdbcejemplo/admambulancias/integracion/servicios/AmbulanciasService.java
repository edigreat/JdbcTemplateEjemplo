package com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMAdmAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMRegSalidaAmbulanciaDto;

public interface AmbulanciasService {

	public void consultarVMRegSalidaAmbulancia(Integer claveLlegada, VMRegSalidaAmbulanciaDto vmRegistroSalida);

	public  void insertarSalida(String claveUnidad, RegistroAmbulanciaDto registroAmbulancia);
	
	public void insertarLlegada(String claveUnidad, RegistroAmbulanciaDto registroAmbulancia);

	/**
	 * El metodo devuelve los registros de ambulancia, las altas con requerimientos de ambulancia, 
	 * las altas y las pre altas. En la capa de servicios 
	 * se puede separar las altas de las prealtas y altas con ambulancia requerida de acuerdo con el
	 * @param claveUnidad
	 * @return consulta de altas registradas ambulancias
	 */
	public VMAdmAmbulanciaDto consultarAltasRegAmbulancia(String claveUnidad);
}
