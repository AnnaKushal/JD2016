CREATE TABLE drachyova.reservations ( id INT(10) NOT NULL AUTO_INCREMENT , checkIn TIMESTAMP NOT NULL , chekOut TIMESTAMP NOT NULL ,
 fk_type INT(10) NOT NULL , fk_user INT(10) NOT NULL , PRIMARY KEY (id)) ENGINE = InnoDB;