package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.RegistroAmbulanciaDao;
import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;
import com.mx.inttec.jdbcejemplo.dto.EntidadPersistente;

@Repository("RegistroAmbulanciaDao")
public class RegistroAmbulanciaDaoImpl extends JdbcDaoSupport implements RegistroAmbulanciaDao {

	
	@Autowired
	public void setTheJdbcTemplate(JdbcTemplate jdbcTemplate){
		super.setJdbcTemplate(jdbcTemplate);
	}
	
	private static String spRegistrosAmbulancias = "call getRegistrosAmbulancia()";

	@Override
	public void create(RegistroAmbulanciaDto newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override 	
	public void update(RegistroAmbulanciaDto newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistroAmbulanciaDto read(Long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(RegistroAmbulanciaDto newInstancie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RegistroAmbulanciaDto> findAll() {
		return getJdbcTemplate().query(spRegistrosAmbulancias,new RegistroAmbulanciaDtoRowMapper());
	}

	

	@Override
	public List<RegistroAmbulanciaDto> consultarPorPeriodoFecha(
			String claveUnidad, Date fechaInicio, Date fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroAmbulanciaDto consultarPorID(Integer clave) {
		// TODO Auto-generated method stub
		return null;
	}

	public class RegistroAmbulanciaDtoRowMapper implements RowMapper<RegistroAmbulanciaDto> {
		@Override
		public RegistroAmbulanciaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			RegistroAmbulanciaDto newInstance = new RegistroAmbulanciaDto();
			newInstance.setClaveLlegada(rs.getInt("CVE_REGISTRO_LLEGADA"));
			newInstance.setClaveIngreso(rs.getInt("CVE_INGRESO"));
			newInstance.setClaveSolicitud(rs.getInt("CVE_SOLICITUD"));
			newInstance.setClaveUnidad(rs.getString("CVE_PRESUPUESTAL"));
			newInstance.setPlacas	(rs.getString("REF_PLACAS_AMBULANCIA"));
			newInstance.setOrigen	(rs.getString("REF_ORIGEN_DESTINO"));
			newInstance.setComentario	(rs.getString("REF_COMENTARIO"));
			return newInstance;
		}

	}
	
}
