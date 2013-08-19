--TODO:Verificar timestamp para versionamiento
	  --Correspondencias de tipo de dato timestamp y java
	  --Verificar funciones para dar formato a las fechas
	  --Checar cursor como parametro de salida (parece que actualmente no es soportado)
	  --Verificar el limite de los tipos de datos int
	  	


CREATE TABLE IF NOT EXISTS TablaEntidad (
    idTabla int(5) NOT NULL AUTO_INCREMENT,
    nombre varchar(20) DEFAULT NULL,
    precio decimal(4,0) DEFAULT NULL,
    PRIMARY KEY(idTabla)
    );

CREATE TABLE IF NOT EXISTS IGT_REGISTRO_AMBULANCIA
(
CVE_REGISTRO_AMBULANCIA	INT  NOT NULL AUTO_INCREMENT,
CVE_REGISTRO_LLEGADA	INT,
CVE_EVENTO_AMBULANCIA	INT,
CVE_INGRESO	            INT,
CVE_SOLICITUD	        INT,
CVE_PRESUPUESTAL	    VARCHAR(12),
REF_PLACAS_AMBULANCIA	VARCHAR(10 ),
REF_ORIGEN_DESTINO	    VARCHAR(50 ),
REF_COMENTARIO	        VARCHAR(250),
CVE_DELEGACION_IMSS	    VARCHAR(2),
CVE_USUARIO				VARCHAR(10),
FEC_EVENTO	            TIMESTAMP,
PRIMARY KEY(CVE_REGISTRO_AMBULANCIA)

);

-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `guardaRegistroAmbulancia`(
	IN IN_CVE_REGISTRO_LLEGADA	INT,
	IN IN_CVE_EVENTO_AMBULANCIA	INT,
	IN IN_CVE_INGRESO	        INT,
	IN IN_CVE_SOLICITUD	        INT,
	IN IN_CVE_PRESUPUESTAL	    VARCHAR(12),
	IN IN_REF_PLACAS_AMBULANCIA	VARCHAR(10 ),
	IN IN_REF_ORIGEN_DESTINO	VARCHAR(50 ),
	IN IN_REF_COMENTARIO	    VARCHAR(250),
	IN IN_CVE_DELEGACION_IMSS	VARCHAR(2),
	IN IN_CVE_USUARIO			VARCHAR(10)
)
BEGIN

	IF IN_CVE_INGRESO = 0 THEN
	SIGNAL SQLSTATE '45000'
      SET MESSAGE_TEXT = 'Excepcion lanzada desde mariadb';
	END IF;
	INSERT INTO IGT_REGISTRO_AMBULANCIA
	( 
		CVE_REGISTRO_LLEGADA,
		CVE_EVENTO_AMBULANCIA,
		CVE_INGRESO	         ,
		CVE_SOLICITUD	     ,
		CVE_PRESUPUESTAL	 ,
		REF_PLACAS_AMBULANCIA,
		REF_ORIGEN_DESTINO  ,
		REF_COMENTARIO	    ,
		CVE_DELEGACION_IMSS ,
		CVE_USUARIO			,	
		FEC_EVENTO
	)
	VALUES(
		IN_CVE_REGISTRO_LLEGADA ,
		IN_CVE_EVENTO_AMBULANCIA,
		IN_CVE_INGRESO	        ,
		IN_CVE_SOLICITUD	    ,
		IN_CVE_PRESUPUESTAL	    ,
		IN_REF_PLACAS_AMBULANCIA,
		IN_REF_ORIGEN_DESTINO   ,
		IN_REF_COMENTARIO	    ,
		IN_CVE_DELEGACION_IMSS,
		IN_CVE_USUARIO			,
		NOW()
	);
END

-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertEntidadPersistente`(
        IN in_precio DECIMAL,
        IN in_nombre VARCHAR(20)
        )
BEGIN

    INSERT INTO TablaEntidad (precio, nombre) values
    (in_precio,in_nombre);
END
    
    
-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost` PROCEDURE `guardaEntidadPersistente`(
        IN in_nombre VARCHAR(20)
        )
BEGIN

    INSERT INTO TablaEntidad (precio, nombre) values
    (0.0,in_nombre);
END


-- --------------------------------------------------------------------------------
-- Routine DDL
-- Note: comments before and after the routine body will not be stored by the server
-- --------------------------------------------------------------------------------
DELIMITER $$

CREATE DEFINER=`root`@`localhost`
 PROCEDURE `getRegistrosAmbulancia`()
BEGIN

SELECT 

CVE_REGISTRO_LLEGADA,
		CVE_EVENTO_AMBULANCIA,
		CVE_INGRESO	         ,
		CVE_SOLICITUD	     ,
		CVE_PRESUPUESTAL	 ,
		REF_PLACAS_AMBULANCIA,
		REF_ORIGEN_DESTINO  ,
		REF_COMENTARIO	    ,
		CVE_DELEGACION_IMSS ,
		CVE_USUARIO			,	
		FEC_EVENTO

FROM 
		IGT_REGISTRO_AMBULANCIA;
END