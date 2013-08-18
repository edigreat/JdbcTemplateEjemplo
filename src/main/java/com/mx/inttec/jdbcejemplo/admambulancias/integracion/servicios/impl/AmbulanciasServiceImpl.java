package com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.impl.SPRegistraEntradaAmbulancia;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMAdmAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.VMRegSalidaAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.AmbulanciasService;

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
		spRegistraEntradaAmbulancia.spRegistraAmbulancia(registroAmbulancia,1, claveUnidad, "2");
	}

	@Override
	public VMAdmAmbulanciaDto consultarAltasRegAmbulancia(String claveUnidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void insertarLlegadaLista(String claveUnidad,
			List<RegistroAmbulanciaDto> registroAmbulanciaList) {

		for(RegistroAmbulanciaDto registroAmbulancia:registroAmbulanciaList){
			
			spRegistraEntradaAmbulancia.spRegistraAmbulancia(registroAmbulancia,1, claveUnidad, "2");
		}
	}

}
