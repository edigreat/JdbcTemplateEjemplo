package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao;

import java.util.Date;
import java.util.List;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.dao.DaoGenerico;


public interface RegistroAmbulanciaDao extends DaoGenerico<RegistroAmbulanciaDto,Long> {


	public List<RegistroAmbulanciaDto> consultarPorPeriodoFecha
				(String claveUnidad,Date fechaInicio, Date fechaFin);
	
	public RegistroAmbulanciaDto consultarPorID(Integer clave);

}
