CREATE TABLE CARS (
  id int4 NOT NULL AUTO_INCREMENT,
  brand varchar(100) NOT NULL,
  model varchar(50) NOT NULL,
  color varchar(50) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_brand (brand)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;