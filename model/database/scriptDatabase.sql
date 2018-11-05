-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `findesk` ;

-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `findesk` DEFAULT CHARACTER SET utf8 ;
USE `findesk` ;

-- -----------------------------------------------------
-- Table `findesk`.`Cor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Cor` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Cor` (
  `idCor` VARCHAR(7) NOT NULL COMMENT 'contêm o valor hexadecimal da cor referenciada',
  `nomeCor` VARCHAR(45) NOT NULL COMMENT 'contêm o nome da cor',
  PRIMARY KEY (`idCor`),
  UNIQUE INDEX `idCor_UNIQUE` (`idCor` ASC) VISIBLE,
  UNIQUE INDEX `nomeCor_UNIQUE` (`nomeCor` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Categoria` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Categoria` (
  `idCategoria` CHAR(1) NOT NULL,
  `nomeCat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `nomeCat_UNIQUE` (`nomeCat` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Nome`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Nome` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Nome` (
  `idNome` CHAR(10) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `idCategoria` CHAR(1) NOT NULL,
  PRIMARY KEY (`idNome`),
  INDEX `fk_Nome_Categoria1_idx` (`idCategoria` ASC) VISIBLE,
  CONSTRAINT `fk_Nome_Categoria1`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `findesk`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Item` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Item` (
  `idItem` INT NOT NULL COMMENT 'Valor de idêntificação do item',
  `idCor` VARCHAR(7) NOT NULL,
  `idNome` CHAR(10) NOT NULL,
  `dataEntradaItem` DATETIME NOT NULL COMMENT 'Data referente ao momento de cadastro do item',
  `dataSaidaItem` DATETIME NULL COMMENT 'Data referente a retirada do item',
  `retiradoItem` TINYINT NOT NULL DEFAULT 0 COMMENT 'Valor valendo 1 = foi retirado ou 0 = não foi retirado',
  `fotoItem` VARCHAR(100) NULL COMMENT 'Atributo referente ao arquivo de imagem do item',
  `descricaoItem` VARCHAR(200) NULL COMMENT 'descrição escrita pelo administrador no momento do cadastro',
  PRIMARY KEY (`idItem`),
  INDEX `idItemCor` (`idCor` ASC) VISIBLE,
  INDEX `fk_Item_Nome1_idx` (`idNome` ASC) VISIBLE,
  CONSTRAINT `idItemCor`
    FOREIGN KEY (`idCor`)
    REFERENCES `findesk`.`Cor` (`idCor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Item_Nome1`
    FOREIGN KEY (`idNome`)
    REFERENCES `findesk`.`Nome` (`idNome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Config`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Config` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Config` (
  `idConfig` INT NOT NULL,
  `admIpConfig` VARCHAR(15) NOT NULL,
  `userIpConfig` VARCHAR(15) NOT NULL,
  `portaConfig` INT NOT NULL,
  `bufferSizeConfig` INT NOT NULL,
  PRIMARY KEY (`idConfig`),
  UNIQUE INDEX `idConfig_UNIQUE` (`idConfig` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Administrador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Administrador` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Administrador` (
  `idAdm` INT NOT NULL,
  `idConfig` INT NOT NULL,
  `idItem` INT NOT NULL,
  PRIMARY KEY (`idAdm`),
  INDEX `fk_Administrador_Config1_idx` (`idConfig` ASC) VISIBLE,
  INDEX `fk_Administrador_Item1_idx` (`idItem` ASC) VISIBLE,
  CONSTRAINT `idAdmConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`Config` (`idConfig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Administrador_Item1`
    FOREIGN KEY (`idItem`)
    REFERENCES `findesk`.`Item` (`idItem`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Usuario` (
  `idUsuario` INT NOT NULL,
  `idConfig` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Config1_idx` (`idConfig` ASC) VISIBLE,
  CONSTRAINT `idUsuConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`Config` (`idConfig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `findesk`.`Cor`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#FFFF00', 'Amarelo');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#0000FF', 'Azul');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#000000', 'Preto');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#FFFFFF', 'Branco');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#FF0000', 'Vermelho');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#008000', 'Verde');
INSERT INTO `findesk`.`Cor` (`idCor`, `nomeCor`) VALUES ('#FFA500', 'Laranja');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Categoria`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('a', 'Eletrônicos');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('b', 'Documentos');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('c', 'Vestíveis');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('f', 'Outros');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('d', 'Recipientes');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES ('e', 'Materiais');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Nome`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('1', 'Pendrive', 'a');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('2', 'Notebook', 'a');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('3', 'RG', 'b');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('4', 'RA', 'b');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('5', 'Blusa', 'c');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('6', 'Relógio', 'c');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('7', 'Garrafa', 'd');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('8', 'Copo', 'd');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('9', 'Caderno', 'e');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('10', 'Caneta', 'e');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('11', 'Guarda-Chuva', 'f');
INSERT INTO `findesk`.`Nome` (`idNome`, `nome`, `idCategoria`) VALUES ('', DEFAULT, DEFAULT);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Config`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Config` (`idConfig`, `admIpConfig`, `userIpConfig`, `portaConfig`, `bufferSizeConfig`) VALUES (1, '127.0.0.1', '127.0.0.1', 3307, 1024);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Administrador`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Administrador` (`idAdm`, `idConfig`, `idItem`) VALUES (1, 1, DEFAULT);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Usuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Usuario` (`idUsuario`, `idConfig`) VALUES (1, 1);

COMMIT;

