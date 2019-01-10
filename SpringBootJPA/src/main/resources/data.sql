insert into alien values(1,'Alien1','Mercury');
insert into alien values(2,'Alien2','Venus');
insert into alien values(3,'Alien3','Earth');
insert into alien values(4,'Alien4','Mars');
insert into alien values(5,'Alien5','Jupiter');
/* Database Initialization (can be required in case of in-line database like H2)
Spring Boot enables the dataSource initializer by default and loads SQL scripts (schema.sql and data.sql) from the root of the classpath.
everytime our application starts up spring boot will run these 2 .sql files

Schema.sql
Here we create the SQL file that our application will use for the Table schema:

DROP TABLE IF EXISTS system;
CREATE TABLE system (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  lastaudit DATE NOT NULL,
  PRIMARY KEY (id));

*/

-- insert into alien values(2,'Alien2','Mercury');