package com.mx.inttec.jdbcejemplo.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;

@Repository("SPGuardaEntidadPersistente")
public class SPGuardaEntidadPersistente extends StoredProcedure {

    private static final String QryRegistraEntidad="guardaEntidadPersistente";

	@Autowired
	public SPGuardaEntidadPersistente(DataSource ds){
		super(ds,QryRegistraEntidad);
	    declareParameter(new SqlParameter("in_nombre",Types.VARCHAR));
		compile();	
	}

	public void spRegistraEntidad(EntidadPersistente entidadPersistente){
		 Map<String, Object> params = new HashMap<String, Object>();
	     params.put("in_nombre", entidadPersistente.getNombre());
	     execute(params);
	}
	
}
