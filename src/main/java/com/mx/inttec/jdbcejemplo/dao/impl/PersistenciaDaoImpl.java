package com.mx.inttec.jdbcejemplo.dao.impl;

import java.sql.Types;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.dao.PersistenciaDao;
import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;


@Repository("persistenciaDao")
public class PersistenciaDaoImpl extends JdbcDaoSupport  implements PersistenciaDao {

	private static Logger log = Logger.getLogger(PersistenciaDaoImpl.class);

	private static String insertEntidadPersistente = 
			"INSERT INTO TablaEntidad (idTabla, precio, nombre) values"
			+ " (?, ?, ?)";

	public void create(EntidadPersistente newInstance) {
	log.info("Entrando a metodo create" + ToStringBuilder.reflectionToString(newInstance));
	this.getJdbcTemplate().update(
			insertEntidadPersistente,
			new Object[] { 
					newInstance.getId(),
					newInstance.getPrecio(), 
					newInstance.getNombre() },
			new int[] { Types.INTEGER, Types.DOUBLE, Types.VARCHAR });
		
	}

	public void update(EntidadPersistente newInstance) {
		// TODO Auto-generated method stub
		
	}

	public void read(Long pk) {
		// TODO Auto-generated method stub
		
	}

	public void delete(EntidadPersistente newInstancie) {
		// TODO Auto-generated method stub
		
	}

	public List<EntidadPersistente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntidadPersistente findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
