JdbcTemplateEjemplo
===================

Ejemplo del uso del jdbcTemplate de Spring


El driver de mariadb para java no se encuentra en el 
repositorio de maven, se debe descargar el jar de la pagina
e instalar en el repositorio local

mvn install:install-file -Dfile=mariadb-java-client-1.1.3.jar -DgroupId=org.mariadb.jdbc -DartifactId=mariadb-java-client -Dversion=1.1.3 -Dpackaging=jar

Como ide para mariadb se puede usar el  workbench de mysql o sqldeveloper 

http://ubuntulife.wordpress.com/2008/07/23/usando-sql-developer-para-conectar-con-mysql/
