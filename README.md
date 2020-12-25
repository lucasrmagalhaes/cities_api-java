# API REST de Consulta de Cidades do Brasil

##### Framework do Projeto
- [Spring Initializr](https://start.spring.io/ "Spring Initializr")
- **Project:** Gradle Project
- **Language:** Java
- **Spring Boot:** 2.4.1

##### Project Metadata
- **Group:** com.github.lucasrmagalhaes
- **Artifact:** cities-api
- **Name:** cities-api
- **Description:** Demo Project for Spring Boot
- **Package name:** com.github.lucasrmagalhaes.cities-api
- **Packaging:** Jar
- **Java:** 8

##### Dependencies
- Spring Web
- Spring Data JPA
- PostgreSQL Driver

##### DataBase
- [Postgres Docker Hub](https://hub.docker.com/_/postgres "Postgres Docker Hub")
- docker pull postgres
- docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

##### Properties
- [Spring](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html "Spring")
- [JDBC](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases "JDBC")

##### Populate
- [Data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL "Data")

<pre>
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
</pre>

- [PostgreSQL: earthdistance](https://www.postgresql.org/docs/current/earthdistance.html "PostgreSQL: earthdistance")
