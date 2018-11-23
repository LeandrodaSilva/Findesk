-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `findesk` ;

-- -----------------------------------------------------
-- Schema findesk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `findesk` DEFAULT CHARACTER SET latin1 ;
USE `findesk` ;

-- -----------------------------------------------------
-- Table `findesk`.`administrador`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`administrador` ;

CREATE TABLE IF NOT EXISTS `findesk`.`administrador` (
  `idAdm` INT(11) NOT NULL,
  PRIMARY KEY (`idAdm`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`categoria` ;

CREATE TABLE IF NOT EXISTS `findesk`.`categoria` (
  `idCategoria` CHAR(1) NOT NULL,
  `nomeCat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`),
  UNIQUE INDEX `nomeCat_UNIQUE` (`nomeCat` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`admConfig`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`admConfig` ;

CREATE TABLE IF NOT EXISTS `findesk`.`admConfig` (
  `idAdmConfig` INT NOT NULL,
  `idAdm` INT(11) NOT NULL,
  `ipAdmConfig` VARCHAR(20) NULL,
  `portAdmConfig` INT NULL,
  PRIMARY KEY (`idAdmConfig`),
  INDEX `fk_admConfig_administrador1_idx` (`idAdm` ASC) ,
  CONSTRAINT `fk_admConfig_administrador1`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`administrador` (`idAdm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`cor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`cor` ;

CREATE TABLE IF NOT EXISTS `findesk`.`cor` (
  `idCor` VARCHAR(7) NOT NULL COMMENT 'contÃªm o valor hexadecimal da cor referenciada',
  `nomeCor` VARCHAR(45) NOT NULL COMMENT 'contÃªm o nome da cor',
  PRIMARY KEY (`idCor`),
  UNIQUE INDEX `idCor_UNIQUE` (`idCor` ASC) ,
  UNIQUE INDEX `nomeCor_UNIQUE` (`nomeCor` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`nomeItem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`nomeItem` ;

CREATE TABLE IF NOT EXISTS `findesk`.`nomeItem` (
  `idNome` CHAR(10) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `idCategoria` CHAR(1) NOT NULL,
  PRIMARY KEY (`idNome`),
  INDEX `fk_Nome_Categoria1_idx` (`idCategoria` ASC) ,
  CONSTRAINT `fk_idCategoria`
    FOREIGN KEY (`idCategoria`)
    REFERENCES `findesk`.`categoria` (`idCategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`ano`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`ano` ;

CREATE TABLE IF NOT EXISTS `findesk`.`ano` (
  `idAno` INT NOT NULL,
  PRIMARY KEY (`idAno`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dia` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dia` (
  `idDia` INT NOT NULL,
  PRIMARY KEY (`idDia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`mes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`mes` ;

CREATE TABLE IF NOT EXISTS `findesk`.`mes` (
  `idMes` INT NOT NULL,
  PRIMARY KEY (`idMes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`data`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`data` ;

CREATE TABLE IF NOT EXISTS `findesk`.`data` (
  `idData` INT NOT NULL,
  `idDia` INT NOT NULL,
  `idMes` INT NOT NULL,
  `idAno` INT NOT NULL,
  PRIMARY KEY (`idData`),
  INDEX `fk_data_ano1_idx` (`idAno` ASC) ,
  INDEX `fk_data_dia1_idx` (`idDia` ASC) ,
  INDEX `fk_data_mes1_idx` (`idMes` ASC) ,
  CONSTRAINT `fk_data_ano1`
    FOREIGN KEY (`idAno`)
    REFERENCES `findesk`.`ano` (`idAno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_data_dia1`
    FOREIGN KEY (`idDia`)
    REFERENCES `findesk`.`dia` (`idDia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_data_mes1`
    FOREIGN KEY (`idMes`)
    REFERENCES `findesk`.`mes` (`idMes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dataEntrada`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dataEntrada` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dataEntrada` (
  `idDataEntrada` INT NOT NULL AUTO_INCREMENT,
  `idData` INT NOT NULL,
  PRIMARY KEY (`idDataEntrada`),
  INDEX `fk_dataEntrada_data1_idx` (`idData` ASC) ,
  CONSTRAINT `fk_dataEntrada_data1`
    FOREIGN KEY (`idData`)
    REFERENCES `findesk`.`data` (`idData`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`dataSaida`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`dataSaida` ;

CREATE TABLE IF NOT EXISTS `findesk`.`dataSaida` (
  `idDataSaida` INT NOT NULL AUTO_INCREMENT,
  `idData` INT NOT NULL,
  PRIMARY KEY (`idDataSaida`),
  INDEX `fk_dataSaida_data1_idx` (`idData` ASC) ,
  CONSTRAINT `fk_dataSaida_data1`
    FOREIGN KEY (`idData`)
    REFERENCES `findesk`.`data` (`idData`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`documento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`documento` ;

CREATE TABLE IF NOT EXISTS `findesk`.`documento` (
  `idDoc` INT NOT NULL,
  `nomeDoc` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDoc`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`item`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`item` ;

CREATE TABLE IF NOT EXISTS `findesk`.`item` (
  `idItem` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'Valor de idÃªntificaÃ§Ã£o do item',
  `idCor` VARCHAR(7) NULL,
  `idDoc` INT NULL,
  `idNome` CHAR(10) NOT NULL,
  `idAdm` INT(11) NOT NULL,
  `idDataEntrada` INT NOT NULL,
  `idDataSaida` INT NOT NULL,
  `retiradoItem` TINYINT(4) NOT NULL DEFAULT '0' COMMENT 'Valor valendo 1 = foi retirado ou 0 = nÃ£o foi retirado',
  `fotoItem` BLOB NULL DEFAULT NULL COMMENT 'Atributo referente ao arquivo de imagem do item',
  `descricaoItem` VARCHAR(200) NULL DEFAULT NULL COMMENT 'descriÃ§Ã£o escrita pelo administrador no momento do cadastro',
  PRIMARY KEY (`idItem`),
  INDEX `fk_idItemCor` (`idCor` ASC) ,
  INDEX `fk_Item_Nome1_idx` (`idNome` ASC) ,
  INDEX `fk_Item_Administrador1_idx` (`idAdm` ASC) ,
  INDEX `fk_item_dataEntrada1_idx` (`idDataEntrada` ASC) ,
  INDEX `fk_item_dataSaida1_idx` (`idDataSaida` ASC) ,
  INDEX `fk_item_docuemnto1_idx` (`idDoc` ASC) ,
  CONSTRAINT `fk_idAdm`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`administrador` (`idAdm`),
  CONSTRAINT `fk_idItemCor`
    FOREIGN KEY (`idCor`)
    REFERENCES `findesk`.`cor` (`idCor`),
  CONSTRAINT `fk_idNome`
    FOREIGN KEY (`idNome`)
    REFERENCES `findesk`.`nomeItem` (`idNome`),
  CONSTRAINT `fk_item_dataEntrada1`
    FOREIGN KEY (`idDataEntrada`)
    REFERENCES `findesk`.`dataEntrada` (`idDataEntrada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_dataSaida1`
    FOREIGN KEY (`idDataSaida`)
    REFERENCES `findesk`.`dataSaida` (`idDataSaida`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_docuemnto1`
    FOREIGN KEY (`idDoc`)
    REFERENCES `findesk`.`documento` (`idDoc`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`usuario` ;

CREATE TABLE IF NOT EXISTS `findesk`.`usuario` (
  `idUsuario` INT(11) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `findesk`.`userConfig`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`userConfig` ;

CREATE TABLE IF NOT EXISTS `findesk`.`userConfig` (
  `idUserConfig` INT NOT NULL,
  `ipUserConfig` VARCHAR(45) NULL,
  `portUserConfig` INT NULL,
  `idUsuario` INT(11) NOT NULL,
  PRIMARY KEY (`idUserConfig`),
  INDEX `fk_userConfig_usuario1_idx` (`idUsuario` ASC) ,
  CONSTRAINT `fk_userConfig_usuario1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `findesk`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `findesk`.`socket`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `findesk`.`socket` ;

CREATE TABLE IF NOT EXISTS `findesk`.`socket` (
  `idSocket` INT NOT NULL,
  `logSocket` VARCHAR(45) NULL,
  `idAdm` INT(11) NOT NULL,
  `idUsuario` INT(11) NOT NULL,
  PRIMARY KEY (`idSocket`),
  INDEX `fk_socket_administrador1_idx` (`idAdm` ASC) ,
  INDEX `fk_socket_usuario1_idx` (`idUsuario` ASC) ,
  CONSTRAINT `fk_socket_administrador1`
    FOREIGN KEY (`idAdm`)
    REFERENCES `findesk`.`administrador` (`idAdm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_socket_usuario1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `findesk`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `findesk`.`administrador`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`administrador` (`idAdm`) VALUES (1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`categoria`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('a', 'Eletrônicos');
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('b', 'Vestuários');
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('c', 'Materiais');
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('d', 'Recipientes');
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('e', 'Documentos');
INSERT INTO `findesk`.`categoria` (`idCategoria`, `nomeCat`) VALUES ('f', 'Outros');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`admConfig`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`admConfig` (`idAdmConfig`, `idAdm`, `ipAdmConfig`, `portAdmConfig`) VALUES (1, 1, '127.0.0.1', 8087);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`cor`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`cor` (`idCor`, `nomeCor`) VALUES ('#000000', 'Preto');
INSERT INTO `findesk`.`cor` (`idCor`, `nomeCor`) VALUES ('#FFFFFF', 'Branco');
INSERT INTO `findesk`.`cor` (`idCor`, `nomeCor`) VALUES ('#FF0000', 'Vermelho');
INSERT INTO `findesk`.`cor` (`idCor`, `nomeCor`) VALUES ('#00FF00', 'Verde');
INSERT INTO `findesk`.`cor` (`idCor`, `nomeCor`) VALUES ('#0000FF', 'Azul');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`nomeItem`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('1', 'Pendrive', 'a');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('2', 'Notebook', 'a');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('3', 'Camiseta', 'b');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('4', 'Caderno', 'c');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('5', 'Caneta', 'c');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('6', 'Garrafa', 'd');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('7', 'Guarda-Chuva', 'f');
INSERT INTO `findesk`.`nomeItem` (`idNome`, `nome`, `idCategoria`) VALUES ('8', 'RA', 'e');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`ano`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2018);
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2019);
INSERT INTO `findesk`.`ano` (`idAno`) VALUES (2020);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dia`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (1);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (2);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (3);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (4);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (5);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (6);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (7);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (8);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (9);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (10);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (11);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (12);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (13);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (14);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (15);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (16);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (17);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (18);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (19);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (20);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (21);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (22);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (23);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (24);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (25);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (26);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (27);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (28);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (29);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (30);
INSERT INTO `findesk`.`dia` (`idDia`) VALUES (31);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`mes`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (1);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (2);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (3);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (4);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (5);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (6);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (7);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (8);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (9);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (10);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (11);
INSERT INTO `findesk`.`mes` (`idMes`) VALUES (12);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`data`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`data` (`idData`, `idDia`, `idMes`, `idAno`) VALUES (1, 1, 1, 2018);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dataEntrada`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dataEntrada` (`idDataEntrada`, `idData`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`dataSaida`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`dataSaida` (`idDataSaida`, `idData`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`documento`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`documento` (`idDoc`, `nomeDoc`) VALUES (1914413, 'Victor Batisttete Dias');
INSERT INTO `findesk`.`documento` (`idDoc`, `nomeDoc`) VALUES (461773698, 'Antonio Neto');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`item`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (1, '#000000', NULL, '1', 1, 1, 1, 1, NULL, 'Lindo pendrive ');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (2, '#000000', NULL, '2', 1, 2, 2, 0, NULL, 'Lindo notebook');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (3, '#FFFFFF', NULL, '3', 1, 1, 1, 0, NULL, 'Camisa G via lance');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (4, '#0000FF', NULL, '4', 1, 1, 1, 0, NULL, 'Caderno 10 matérias da Moranguinho');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (5, '#0000FF', NULL, '5', 1, 1, 1, 0, NULL, 'Caneta BIC ');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (6, '#00FF00', NULL, '6', 1, 1, 1, 1, NULL, 'Garrafa de aluminio');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (8, '#000000', 1914413, '7', 1, 1, 1, 0, NULL, 'RA');
INSERT INTO `findesk`.`item` (`idItem`, `idCor`, `idDoc`, `idNome`, `idAdm`, `idDataEntrada`, `idDataSaida`, `retiradoItem`, `fotoItem`, `descricaoItem`) VALUES (7, '#000000', NULL, '8', 1, 1, 1, 1, NULL, 'Guarda chuva grande');

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`usuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`usuario` (`idUsuario`) VALUES (1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`userConfig`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`userConfig` (`idUserConfig`, `ipUserConfig`, `portUserConfig`, `idUsuario`) VALUES (1, '127.0.0.1', 8087, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `findesk`.`socket`
-- -----------------------------------------------------
START TRANSACTION;
USE `findesk`;
INSERT INTO `findesk`.`socket` (`idSocket`, `logSocket`, `idAdm`, `idUsuario`) VALUES (1, 'teste', 1, 1);

COMMIT;

