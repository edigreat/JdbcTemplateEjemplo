package com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMAdmAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMRegSalidaAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.AmbulanciasService;
import com.mx.inttec.jdbcejemplo.dao.impl.SPRegistraEntradaAmbulancia;

@Repository("ambulanciaService")
public class AmbulanciasServiceImpl implements AmbulanciasService {

	@Autowired
	SPRegistraEntradaAmbulancia spRegistraEntradaAmbulancia;
	
	
	@Override
	public void consultarVMRegSalidaAmbulancia(Integer claveLlegada,
			VMRegSalidaAmbulanciaDto vmRegistroSalida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarSalida(String claveUnidad,
			RegistroAmbulanciaDto registroAmbulancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertarLlegada(String claveUnidad,
			RegistroAmbulanciaDto registroAmbulancia) {
		spRegistraEntradaAmbulancia.spRegistraAmbulancia(registroAmbulancia, 0, "2", "2");
	}

	@Override
	public VMAdmAmbulanciaDto consultarAltasRegAmbulancia(String claveUnidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
