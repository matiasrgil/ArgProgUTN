-- MySQL Script generated by MySQL Workbench
-- Wed Apr  5 11:56:07 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Qatar2022_modeloRalacional
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Qatar2022_modeloRalacional` ;

-- -----------------------------------------------------
-- Schema Qatar2022_modeloRalacional
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Qatar2022_modeloRalacional` DEFAULT CHARACTER SET utf8 ;
USE `Qatar2022_modeloRalacional` ;

-- -----------------------------------------------------
-- Table `Qatar2022_modeloRalacional`.`Presupuesto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Qatar2022_modeloRalacional`.`Presupuesto` ;

CREATE TABLE IF NOT EXISTS `Qatar2022_modeloRalacional`.`Presupuesto` (
  `idPresupuesto` INT NOT NULL,
  `Cantidad` INT NULL,
  PRIMARY KEY (`idPresupuesto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Qatar2022_modeloRalacional`.`Departamento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Qatar2022_modeloRalacional`.`Departamento` ;

CREATE TABLE IF NOT EXISTS `Qatar2022_modeloRalacional`.`Departamento` (
  `idDepartamento` INT NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  `Presupuesto_idPresupuesto` INT NOT NULL,
  PRIMARY KEY (`idDepartamento`))
ENGINE = InnoDB;

CREATE INDEX `fk_Departamento_Presupuesto1_idx` ON `Qatar2022_modeloRalacional`.`Departamento` (`Presupuesto_idPresupuesto` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `Qatar2022_modeloRalacional`.`Empleado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Qatar2022_modeloRalacional`.`Empleado` ;

CREATE TABLE IF NOT EXISTS `Qatar2022_modeloRalacional`.`Empleado` (
  `idEmpleado` INT NOT NULL,
  `nombre` VARCHAR(65) NULL,
  `apellido` VARCHAR(65) NULL,
  `DNI` INT NOT NULL,
  `depto` VARCHAR(45) NULL,
  `Departamento_idDepartamento` INT NOT NULL,
  PRIMARY KEY (`idEmpleado`))
ENGINE = InnoDB;

CREATE INDEX `fk_Empleado_Departamento_idx` ON `Qatar2022_modeloRalacional`.`Empleado` (`Departamento_idDepartamento` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
