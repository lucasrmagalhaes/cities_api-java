### API REST de Consulta de Cidades do Brasil

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

```
docker pull postgres
```

```
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

##### Properties
- [Spring](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html "Spring")
- [JDBC](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases "JDBC")

##### Populate
- [Data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL "Data")
```
git clone git@github.com:chinnonsantos/sql-paises-estados-cidades.git
```

```
cd sql-paises-estados-cidades/
```

```
cd PostgreSQL/
```

```
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL
```

```
winpty docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
```

##### Windows
```
docker run -it --rm --net=host -v c:\Users\Lucas\Desktop\Workspace\cities_api-java\sql-paises-estados-cidades\PostgreSQL:/tmp postgres /bin/bash
```

```
psql -h localhost -U postgres_user_city cities
```

```
\d pais;
```

```
select * from pais;
```

##### List
```
http://localhost:8080/countries
```

##### Pageable - /countries
```
http://localhost:8080/countries?page=0&size=10&sort=name,asc
```
```
http://localhost:8080/countries?page=0&size=10&sort=name,desc
```
```
http://localhost:8080/countries?page=0&size=50&sort=id,asc
```

##### /countries/id
```
http://localhost:8080/countries/1
```
```
http://localhost:8080/countries/255
```

```
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
```
```
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql
```
```
psql -h localhost -U postgres_user_city cities
```

```
\d cidade;
```
```
select * from cidade;
```
```
select * from estado;
```
```
\d estado;
```
```
http://localhost:8080/states
```
```
\d cidade;
```
```
http://localhost:8080/cities
```

```
CREATE EXTENSION cube; 
```
```
CREATE EXTENSION earthdistance;
```

##### Query Earth Distance

###### Point
```
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```
```
select lat_lon from cidade where id=5254;
```

###### Cube
```
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

```
http://localhost:8080/distances/by-points?from=4929&to=5254
```
```
http://localhost:8080/distances/by-cube?from=4929&to=5254
```

```
heroku create
```
```
git remote -v
```
```
git push heroku master
```
```
heroku addons:create heroku-postgresql
```

```
docker run -it --rm --net=host -v c:\Users\Lucas\Desktop\cities_api-java\sql-paises-estados-cidades\PostgreSQL:/tmp postgres /bin/bash
```

```
psql -h host -U user database -f /tmp/pais.sql
```
```
psql -h host -U user database -f /tmp/estado.sql
```
```
psql -h host -U user database -f /tmp/cidade.sql
```
```
psql -h host -U user database
```

```
CREATE EXTENSION cube; 
```
```
CREATE EXTENSION earthdistance;
```

```
heroku logs --tail
```

```
git push heroku master
```