package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.RegistroAmbulanciaDao;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;

public class RegistroAmbulanciaDaoImpl extends JdbcDaoSupport implements RegistroAmbulanciaDao {

	@Override
	public void create(RegistroAmbulanciaDto newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override 	
	public void update(RegistroAmbulanciaDto newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistroAmbulanciaDto read(Long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(RegistroAmbulanciaDto newInstancie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RegistroAmbulanciaDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<RegistroAmbulanciaDto> consultarPorPeriodoFecha(
			String claveUnidad, Date fechaInicio, Date fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroAmbulanciaDto consultarPorID(Integer clave) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
