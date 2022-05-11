-- sample car manufacturers
CREATE SCHEMA testqrk;
SET SCHEMA testqrk;

CREATE TABLE testqrk.car_manufacturer (
    code varchar(255),
    name varchar(255)
);

CREATE TABLE testqrk.car_model (
    code varchar(255),
    name varchar(255)
);

CREATE TABLE testqrk.car_manufacturer_car_model (
    carmanufacturerentity_code varchar(255),
    models_code varchar(255)
);

INSERT INTO testqrk.car_manufacturer (code,name)
	VALUES ('FCA','FIAT-Crysler');
INSERT INTO testqrk.car_manufacturer (code,name)
	VALUES ('SEAT','SEAT');
INSERT INTO testqrk.car_manufacturer (code,name)
	VALUES ('FORD','Ford');
INSERT INTO testqrk.car_manufacturer (code,name)
	VALUES ('NISSAN','Nissan');
INSERT INTO testqrk.car_manufacturer (code,name)
	VALUES ('ALFA','Alfa-Romeo');

-- sample car models
INSERT INTO testqrk.car_model (code,name)
	VALUES ('IBIZA','SEAT Ibiza');
INSERT INTO testqrk.car_model (code,name)
	VALUES ('LEON','SEAT Leon');

INSERT INTO testqrk.car_model (code,name)
	VALUES ('FIESTA','FORD Fiesta');

INSERT INTO testqrk.car_manufacturer_car_model (carmanufacturerentity_code,models_code)
	VALUES ('SEAT','IBIZA');
INSERT INTO testqrk.car_manufacturer_car_model (carmanufacturerentity_code,models_code)
	VALUES ('SEAT','LEON');

INSERT INTO testqrk.car_manufacturer_car_model (carmanufacturerentity_code,models_code)
	VALUES ('FORD','FIESTA');

