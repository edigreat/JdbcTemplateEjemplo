package com.mx.inttec.jdbcejemplo.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.RegistroAmbulanciaDao;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class RegistroAmbulanciaDaoTestCase {
	
	@Autowired
	RegistroAmbulanciaDao registroAmbulanciaDao;
	
	@Test
	public void getAmbulanciasByRegister(){
		
		 List<RegistroAmbulanciaDto> registroAmbulanciaDtoList=registroAmbulanciaDao.findAll();
		 
		 assertTrue(registroAmbulanciaDtoList.size()>0);
	
		 for(RegistroAmbulanciaDto registroAmbulanciaDto:registroAmbulanciaDtoList )
		 {
			 System.out.println(ToStringBuilder.reflectionToString(registroAmbulanciaDto));
		 }
	}

}
