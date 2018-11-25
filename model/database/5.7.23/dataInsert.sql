
drop procedure if exists doWhile;
DELIMITER //  
CREATE PROCEDURE doWhile()   
BEGIN
DECLARE ano INT DEFAULT 2000; 
DECLARE mes INT DEFAULT 1; 
DECLARE dia INT DEFAULT 2;
DECLARE id INT DEFAULT 2;
WHILE (ano <= 2030) DO 
	WHILE (mes <= 12) DO 
		WHILE (dia <= 31) DO
		INSERT INTO data (idData, idDia, idMes, idAno) values (id, dia, mes, ano);
		SET dia = dia+1, id = id+1;
		END WHILE;
        SET mes = mes+1, dia = 1;
	END WHILE;
SET ano = ano+1, mes = 1;
END WHILE;
END;
// 

UPDATE data
SET idDia = 1, idMes = 1, idAno = 2000
WHERE idData = 1;




call doWhile() ;
