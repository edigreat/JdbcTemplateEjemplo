package com.mx.inttec.jdbcejemplo.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class SPGuardaEntidadPersistenteTestCase {
	
	@Autowired
	SPGuardaEntidadPersistente spGuardaEntidadPersistente;
	
	@Test
	public void spRegistraEntidadtest(){
		EntidadPersistente entidadPersistente =  new  EntidadPersistente();
		entidadPersistente.setNombre("NombreSP");
		spGuardaEntidadPersistente.spRegistraEntidad(entidadPersistente);
		
		
	}

}
