package com.mx.inttec.jdbcejemplo.admambulancias.integracion.dao.impl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;

import com.mx.inttec.jdbcejemplo.admambulancias.integracion.dto.RegistroAmbulanciaDto;


@Repository("SPRegistraEntradaAmbulancia")
public class SPRegistraEntradaAmbulancia  extends StoredProcedure{

	 private static final String QryRegistraEntidad="guardaRegistroAmbulancia";

		@Autowired
		public SPRegistraEntradaAmbulancia(DataSource ds){
			super(ds,QryRegistraEntidad);

			declareParameter(new SqlParameter("IN_CVE_REGISTRO_LLEGADA"	,Types.INTEGER));
			declareParameter(new SqlParameter("IN_CVE_EVENTO_AMBULANCIA",Types.INTEGER));
			declareParameter(new SqlParameter("IN_CVE_INGRESO"	        ,Types.INTEGER));
			declareParameter(new SqlParameter("IN_CVE_SOLICITUD"	    ,Types.INTEGER));
			declareParameter(new SqlParameter("IN_CVE_PRESUPUESTAL"	    ,Types.VARCHAR));
			declareParameter(new SqlParameter("IN_REF_PLACAS_AMBULANCIA",Types.VARCHAR));
			declareParameter(new SqlParameter("IN_REF_ORIGEN_DESTINO"	,Types.VARCHAR));
			declareParameter(new SqlParameter("IN_REF_COMENTARIO"	    ,Types.VARCHAR));
      		declareParameter(new SqlParameter("IN_CVE_DELEGACION_IMSS"	,Types.VARCHAR));
			declareParameter(new SqlParameter("IN_CVE_USUARIO"			,Types.VARCHAR));
			compile();	
		}

		public void spRegistraAmbulancia(RegistroAmbulanciaDto registroAmbulanciaDto,
				Integer cveEventoAmbulancia,String cveDelegacion,String cveUsuario){
			 Map<String, Object> params = new HashMap<String, Object>();
			 params.put("IN_CVE_REGISTRO_LLEGADA"      ,registroAmbulanciaDto.getClaveLlegada() );
			 params.put("IN_CVE_EVENTO_AMBULANCIA"     ,cveEventoAmbulancia);
			 params.put("IN_CVE_INGRESO"	           ,registroAmbulanciaDto.getClaveIngreso() );
			 params.put("IN_CVE_SOLICITUD"	           ,registroAmbulanciaDto.getClaveSolicitud() );
			 params.put("IN_CVE_PRESUPUESTAL"	       ,registroAmbulanciaDto.getDestino() );
			 params.put("IN_REF_PLACAS_AMBULANCIA"     ,registroAmbulanciaDto.getPlacas() );
			 params.put("IN_REF_ORIGEN_DESTINO"	       ,registroAmbulanciaDto.getDestino() );
			 params.put("IN_REF_COMENTARIO"	           ,registroAmbulanciaDto.getComentario() );
			 params.put("IN_CVE_DELEGACION_IMSS"	   ,cveDelegacion );
			 params.put("IN_CVE_USUARIO"			   ,cveUsuario);
			 execute(params);
		}
	
	
}
