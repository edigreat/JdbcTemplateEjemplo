package com.mx.inttec.jdbcejemplo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.dao.PersistenciaDao;
import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;


@Repository("persistenciaDao")
public class PersistenciaDaoImpl extends JdbcDaoSupport  implements PersistenciaDao {

	private static Logger log = Logger.getLogger(PersistenciaDaoImpl.class);

	@Autowired
	public void setTheJdbcTemplate(JdbcTemplate jdbcTemplate){
		super.setJdbcTemplate(jdbcTemplate);
	}

	private static String selectEntidadPersistente = "SELECT idTabla, precio, nombre FROM TablaEntidad ";

	private static String updateEntidadPersistente = "UPDATE  TablaEntidad set precio=?, nombre=? WHERE idTabla=?  ";

	private static String insertEntidadPersistente = 
			"INSERT INTO TablaEntidad (precio, nombre) values"
			+ " (?, ?)";

	private static String deleteSql = "DELETE from TablaEntidad where idTabla = ?";

	
	public void create(EntidadPersistente newInstance) {
	log.info("Entrando a metodo create" + ToStringBuilder.reflectionToString(newInstance));
	this.getJdbcTemplate().update(
			insertEntidadPersistente,
			new Object[] { 
					newInstance.getPrecio(), 
					newInstance.getNombre() },
			new int[] { Types.DOUBLE, Types.VARCHAR });
		
	}

	public void update(EntidadPersistente newInstance) {
		log.info("Entrando a metodo update" + ToStringBuilder.reflectionToString(newInstance));
		this.getJdbcTemplate().update(
				updateEntidadPersistente,
				new Object[] { 
						newInstance.getPrecio(), 
						newInstance.getNombre(),
						newInstance.getId()},
				new int[] { Types.DOUBLE, Types.VARCHAR,Types.INTEGER });	
	}

	public EntidadPersistente read(Long pk) {
		return this.getJdbcTemplate().queryForObject
				(selectEntidadPersistente + " WHERE idTabla="+pk,
						new EntidadPersistenteRowMapper());

	}

	public void delete(EntidadPersistente newInstancie) {
		throw new RuntimeException("operacion no permitida");
		
	}

	public List<EntidadPersistente> findAll() {
		return this.getJdbcTemplate().query(selectEntidadPersistente, new EntidadPersistenteRowMapper());

	}

	public List<EntidadPersistente> findByName(String name) {
		return this.getJdbcTemplate().query
				(selectEntidadPersistente + " WHERE NOMBRE LIKE '%"+name+"%'", 
						new EntidadPersistenteRowMapper());

	}

	public class EntidadPersistenteRowMapper implements RowMapper<EntidadPersistente> {
		@Override
		public EntidadPersistente mapRow(ResultSet rs, int rowNum) throws SQLException {
			EntidadPersistente newInstance = new EntidadPersistente();
			newInstance.setId(rs.getLong("idTabla"));
			newInstance.setNombre(rs.getString("nombre"));
			newInstance.setPrecio(rs.getDouble("precio"));
			return newInstance;
		}

	}
	
}
