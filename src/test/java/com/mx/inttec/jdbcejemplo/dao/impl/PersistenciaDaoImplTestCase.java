package com.mx.inttec.jdbcejemplo.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.dao.PersistenciaDao;
import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/application-context.xml")
public class PersistenciaDaoImplTestCase {

	@Autowired
	PersistenciaDao persistenciaDao;
	
	@Test
	public void testCreate(){
		EntidadPersistente entidadPersistente = new EntidadPersistente();
		entidadPersistente.setNombre("Test create");
		entidadPersistente.setPrecio(10.00);
		persistenciaDao.create(entidadPersistente);
	}
	
	@Test
	public void testFindAll(){
		List<EntidadPersistente> entidadPersistenteList = persistenciaDao.findAll();
		assertNotNull(entidadPersistenteList);
		assertTrue(entidadPersistenteList.size() > 0);
	}
	
	@Test
	public void testFindByName(){
		List<EntidadPersistente> entidadPersistenteList  = persistenciaDao.findByName("Test create");
		assertNotNull(entidadPersistenteList);
				}
	
	@Test
	public void testFindByPk(){
		EntidadPersistente entidadPersistente= persistenciaDao.read(new Long(1));
		assertNotNull(entidadPersistente);
	}
	

	@Test
	public void testUpdate(){
		EntidadPersistente entidadPersistente = new EntidadPersistente();
		entidadPersistente.setId(new Long(1));
		entidadPersistente.setNombre("Test update");
		entidadPersistente.setPrecio(20.00);
		persistenciaDao.update(entidadPersistente);
	}
	
	@Test(expected=RuntimeException.class)
	public void testDelete(){
		EntidadPersistente entidadPersistente = new EntidadPersistente();
			persistenciaDao.delete(entidadPersistente);
	}
	
}

