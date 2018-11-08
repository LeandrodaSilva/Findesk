-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: findesk
-- Source Schemata: findesk
-- Created: Thu Nov  8 16:30:58 2018
-- Workbench Version: 8.0.13
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema findesk
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `findesk` ;
CREATE SCHEMA IF NOT EXISTS `findesk` ;

-- ----------------------------------------------------------------------------
-- Table findesk.administrador
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`administrador` (
  `idAdm` INT(11) NOT NULL,
  `idConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idAdm`),
  INDEX `fk_Administrador_Config1_idx` (`idConfig` ASC),
  CONSTRAINT `fk_idAdmConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`config` (`idConfig`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.categoria
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`categoria` (
  `idCategoria` CHAR(1) NOT NULL,
  `nomeCat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `nomeCat_UNIQUE` (`nomeCat` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.config
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`config` (
  `idConfig` INT(11) NOT NULL,
  `admIpConfig` VARCHAR(15) NOT NULL,
  `userIpConfig` VARCHAR(15) NOT NULL,
  `portaConfig` INT(11) NOT NULL,
  `bufferSizeConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idConfig`),
  UNIQUE INDEX `idConfig_UNIQUE` (`idConfig` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.cor
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`cor` (
  `idCor` VARCHAR(7) NOT NULL COMMENT 'contêm o valor hexadecimal da cor referenciada',
  `nomeCor` VARCHAR(45) NOT NULL COMMENT 'contêm o nome da cor',
  PRIMARY KEY (`idCor`),
  UNIQUE INDEX `idCor_UNIQUE` (`idCor` ASC),
  UNIQUE INDEX `nomeCor_UNIQUE` (`nomeCor` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.item
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`item` (
  `idItem` INT(11) NOT NULL COMMENT 'Valor de idêntificação do item',
  `idCor` VARCHAR(7) NOT NULL,
  `idNome` CHAR(10) NOT NULL,
  `idAdm` INT(11) NOT NULL,
  `dataEntradaItem` DATETIME NOT NULL COMMENT 'Data referente ao momento de cadastro do item',
  `dataSaidaItem` DATETIME NULL DEFAULT NULL COMMENT 'Data referente a retirada do item',
  `retiradoItem` TINYINT(4) NOT NULL DEFAULT '0' COMMENT 'Valor valendo 1 = foi retirado ou 0 = não foi retirado',
  `fotoItem` VARCHAR(100) NULL DEFAULT NULL COMMENT 'Atributo referente ao arquivo de imagem do item',
  `descricaoItem` VARCHAR(200) NULL DEFAULT NULL COMMENT 'descrição escrita pelo administrador no momento do cadastro',
  PRIMARY KEY (`idItem`),
  INDEX `fk_idItemCor` (`idCor` ASC),
  INDEX `fk_Item_Nome1_idx` (`idNome` ASC),
  INDEX `fk_Item_Administrador1_idx` (`idAdm` ASC),
  CONSTRAINT `fk_idAdm`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`administrador` (`idAdm`),
  CONSTRAINT `fk_idItemCor`
    FOREIGN KEY (`idCor`)
    REFERENCES `findesk`.`cor` (`idCor`),
  CONSTRAINT `fk_idNome`
    FOREIGN KEY (`idNome`)
    REFERENCES `findesk`.`nome` (`idNome`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.nome
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`nome` (
  `idNome` CHAR(10) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `idCategoria` CHAR(1) NOT NULL,
  PRIMARY KEY (`idNome`),
  INDEX `fk_Nome_Categoria1_idx` (`idCategoria` ASC),
  CONSTRAINT `fk_idCategoria`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `findesk`.`categoria` (`idCategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- ----------------------------------------------------------------------------
-- Table findesk.usuario
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `findesk`.`usuario` (
  `idUsuario` INT(11) NOT NULL,
  `idConfig` INT(11) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Config1_idx` (`idConfig` ASC),
  CONSTRAINT `fk_idUsuConfig`
    FOREIGN KEY (`idConfig`)
    REFERENCES `findesk`.`config` (`idConfig`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
SET FOREIGN_KEY_CHECKS = 1;
