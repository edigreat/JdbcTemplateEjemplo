package com.mx.inttec.jdbcejemplo.admambulancias.integracion.servicios.impl;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Repository;

//@Repository("AuditorAdvice")
public class AuditorAdvice {

	private static Logger log = Logger.getLogger(AuditorAdvice.class);
	
	public AuditorAdvice(){
		
	}
	
	
	/**
	 * Realiza el bitacoreado de cada metodo, en caso de que
	 * ocurra una excepcion se transforma una BusinessException
	 * @param pjp
	 * @return object objeto regresado por cada metodo
	 * @throws Throwable
	 */
	public Object bitacora(ProceedingJoinPoint pjp) throws Throwable 
	 {
		 log.debug("---> Ejecutando el metodo " +pjp.getTarget()+"."+pjp.getSignature().getName());
		 long tiempoinicial = System.currentTimeMillis();
		
		 Object obj= null;
		 try{
		     obj = pjp.proceed();
		 }
		
		catch(Exception e)
		{
			log.warn("Excepcion " + e.toString());
			 for(Object paramobj:pjp.getArgs()){
				 log.debug(ToStringBuilder.reflectionToString(paramobj));
					
			 }
			 
			throw new RuntimeException("Error General: ", e);
		}

		 long tiempofinal = System.currentTimeMillis();
		 long tiempoTotal =   tiempofinal -tiempoinicial;
		 log.debug("<-----Resultado Bitacora [" + tiempoTotal + "] ms");
		 return obj;
	 }

	
}
