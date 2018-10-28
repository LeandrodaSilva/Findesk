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
-- Table `findesk`.`Categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Categoria` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Categoria` (
  `idCategoria` INT NOT NULL,
  `nomeCat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `nomeCat_UNIQUE` (`nomeCat` ASC) VISIBLE)
ENGINE = InnoDB;


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
  PRIMARY KEY (`idAdm`),
  INDEX `fk_Administrador_Config1_idx` (`idConfig` ASC) VISIBLE,
  CONSTRAINT `idAdmConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`Config` (`idConfig`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`Item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`Item` ;

CREATE TABLE IF NOT EXISTS `findesk`.`Item` (
  `idItem` INT NOT NULL COMMENT 'Valor de idêntificação do item',
  `idAdm` INT NOT NULL,
  `idCategoria` INT NOT NULL,
  `idCor` VARCHAR(7) NOT NULL,
  `dataEntradaItem` DATETIME NOT NULL COMMENT 'Data referente ao momento de cadastro do item',
  `dataSaidaItem` DATETIME NULL COMMENT 'Data referente a retirada do item',
  `retiradoItem` TINYINT NOT NULL DEFAULT 0 COMMENT 'Valor valendo 1 = foi retirado ou 0 = não foi retirado',
  `fotoItem` VARCHAR(100) NULL COMMENT 'Atributo referente ao arquivo de imagem do item',
  `descricaoItem` VARCHAR(200) NULL COMMENT 'descrição escrita pelo administrador no momento do cadastro',
  PRIMARY KEY (`idItem`),
  INDEX `idItemCategoria` (`idCategoria` ASC) VISIBLE,
  INDEX `idItemCor` (`idCor` ASC) VISIBLE,
  INDEX `fk_Item_Administrador1_idx` (`idAdm` ASC) VISIBLE,
  CONSTRAINT `idItemCategoria`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `findesk`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idItemCor`
    FOREIGN KEY (`idCor`)
    REFERENCES `findesk`.`Cor` (`idCor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idItemAdm`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`Administrador` (`idAdm`)
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
-- Data for table `findesk`.`Categoria`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES (1, 'Eletrônicos');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES (2, 'Documentos');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES (3, 'Vestíveis');
INSERT INTO `findesk`.`Categoria` (`idCategoria`, `nomeCat`) VALUES (4, 'Outros');

COMMIT;


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
INSERT INTO `findesk`.`Administrador` (`idAdm`, `idConfig`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`Usuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`Usuario` (`idUsuario`, `idConfig`) VALUES (1, 1);

COMMIT;

