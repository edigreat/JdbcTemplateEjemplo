package com.mx.inttec.jdbcejemplo.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.AmbulanciasService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class AmbulanciasServiceImplTestCase {
	
	@Autowired
	AmbulanciasService ambulanciaService;
	/*
	@Test
	public void registraLlegadaAmbulancia(){
		RegistroAmbulanciaDto registroAmbulanciaDto = new RegistroAmbulanciaDto();
		registroAmbulanciaDto.setClaveLlegada(1); 
		registroAmbulanciaDto.setClaveIngreso(1) ;
		registroAmbulanciaDto.setClaveSolicitud(1) ;
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setPlacas("546-433");
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setComentario("comentario");
		ambulanciaService.insertarLlegada("12", registroAmbulanciaDto);
	}

	

	@Test(expected=RuntimeException.class)
	public void registraLlegadaAmbulanciaException(){
		RegistroAmbulanciaDto registroAmbulanciaDto = new RegistroAmbulanciaDto();
		registroAmbulanciaDto.setClaveLlegada(1); 
		registroAmbulanciaDto.setClaveIngreso(0) ;
		registroAmbulanciaDto.setClaveSolicitud(1) ;
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setPlacas("546-433");
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setComentario("comentario");
		ambulanciaService.insertarLlegada("0", registroAmbulanciaDto);
	}
	*/
	
	@Test//(expected=RuntimeException.class)
	public void registraListaLLegadaAmbulancia(){
		RegistroAmbulanciaDto registroAmbulanciaDto = new RegistroAmbulanciaDto();
		registroAmbulanciaDto.setClaveLlegada(1); 
		registroAmbulanciaDto.setClaveIngreso(1) ;
		registroAmbulanciaDto.setClaveSolicitud(1) ;
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setPlacas("546-433");
		registroAmbulanciaDto.setDestino("dest");
		registroAmbulanciaDto.setComentario("comentario _ 01");

		RegistroAmbulanciaDto registroAmbulanciaDto_02 = new RegistroAmbulanciaDto();

		registroAmbulanciaDto_02.setClaveLlegada(1); 
		registroAmbulanciaDto_02.setClaveIngreso(1) ;
		registroAmbulanciaDto_02.setClaveSolicitud(1) ;
		registroAmbulanciaDto_02.setDestino("dest");
		registroAmbulanciaDto_02.setPlacas("546-433");
		registroAmbulanciaDto_02.setDestino("dest");
		registroAmbulanciaDto_02.setComentario("comentario _ 02");
		
		List<RegistroAmbulanciaDto> registroAmbulanciaDtoList = new ArrayList<RegistroAmbulanciaDto>();
		registroAmbulanciaDtoList.add(registroAmbulanciaDto);
		registroAmbulanciaDtoList.add(registroAmbulanciaDto_02);
		
		ambulanciaService.insertarLlegadaLista("0", registroAmbulanciaDtoList);

	}
	
	

}
