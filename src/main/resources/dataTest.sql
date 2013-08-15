CREATE TABLE IF NOT EXISTS TablaEntidad (
    idTabla int(5) NOT NULL AUTO_INCREMENT,
    nombre varchar(20) DEFAULT NULL,
    precio decimal(4,0) DEFAULT NULL,
    PRIMARY KEY(idTabla)
    );
