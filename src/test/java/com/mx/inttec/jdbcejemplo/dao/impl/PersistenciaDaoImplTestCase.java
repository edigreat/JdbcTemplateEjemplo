package com.mx.inttec.jdbcejemplo.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mx.inttec.jdbcejemplo.dao.PersistenciaDao;
import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/dao/dao-context.xml")
public class PersistenciaDaoImplTestCase {

	@Autowired
	PersistenciaDao persistenciaDao;
	
	@Test
	public void testFindAll(){
		List<EntidadPersistente> entidadPersistenteList = persistenciaDao.findAll();
		assertNotNull(entidadPersistenteList);
		assertTrue(entidadPersistenteList.size() > 0);
	}
	
}

