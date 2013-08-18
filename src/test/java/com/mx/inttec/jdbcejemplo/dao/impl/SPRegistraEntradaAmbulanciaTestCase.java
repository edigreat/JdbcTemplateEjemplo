package com.mx.inttec.jdbcejemplo.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class SPRegistraEntradaAmbulanciaTestCase {
	
	@Autowired
	SPRegistraEntradaAmbulancia spRegistraEntradaAmbulancia;
	
	@Test
	public void spRegistraAmbulanciaTest(){

		RegistroAmbulanciaDto registroAmbulanciaDto = new RegistroAmbulanciaDto();
		registroAmbulanciaDto.setClaveLlegada(1); 
		registroAmbulanciaDto.setClaveIngreso(1) ;
		registroAmbulanciaDto.setClaveSolicitud(1) ;
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setPlacas("546-433");
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setComentario("comentario");
		spRegistraEntradaAmbulancia.spRegistraAmbulancia(registroAmbulanciaDto, 1, "2", "2");
		
		
	}
	
	
}
