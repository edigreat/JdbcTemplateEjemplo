package com.mx.inttec.jdbcejemplo.dao;

import java.util.List;

import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;

public interface PersistenciaDao extends DaoGenerico<EntidadPersistente,Long>{
	
	List<EntidadPersistente> findByName(String name);

}
