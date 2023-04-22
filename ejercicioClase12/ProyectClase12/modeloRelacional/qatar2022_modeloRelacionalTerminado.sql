create database Qatar2022;
show databases;
use Qatar2022;
show tables;

create table Empleado(	idEMpleado int not null
						,DNI int not null
                        ,nombre varchar(65)
                        ,apellido varchar(65)
                        ,depto varchar(45)
                        );

ALTER TABLE Empleado
ADD COLUMN nacionalidad varchar(45);

alter table Empleado
drop column nacionalidad;

ALTER TABLE Empleado
ADD COLUMN nacionalidad varchar(45) AFTER apellido;

alter table Empleado add primary key (idEmpleado);
alter table Empleado modify idEmpleado int auto_increment;

desc Empleado;

-- 4 Inserto empleados nuevos
INSERT INTO Empleado (DNI,nombre,apellido,nacionalidad,depto)
VALUES(12345678,'Jose','Perez','Argentino','sistemas');

INSERT INTO Empleado (DNI,nombre,apellido,nacionalidad,depto)
VALUES(12345679,'Samuel','Thomas','Argentino','logistica');

INSERT INTO Empleado (DNI,nombre,apellido,nacionalidad,depto)
VALUES(12345670,'Lupe','Pilar','Argentino','compras');

select * from Empleado;

-- 5 modificando nacionalidad de un empleado
UPDATE Empleado Set nacionalidad = 'Brasilero'
where idEmpleado = 1;

select * from Empleado;

INSERT INTO Empleado (DNI,nombre,apellido,nacionalidad,depto)
VALUES(12345672,'Paula','Belen','Argentino','mantenimiento');

select * from Empleado;

-- 6 elimino un departamento
SET SQL_SAFE_UPDATES = 0;
delete from Empleado where depto ="mantenimiento";

select * from Empleado;

UPDATE Empleado Set depto = 'logistica'
where idEmpleado = 1;

-- 7 conociendo los empleados que trabajan en logistica
select * from empleado where depto = 'logistica'; 

-- 8 muestro ordenado alfabeticamente
select * from Empleado order by depto;




