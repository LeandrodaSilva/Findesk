
drop procedure if exists deletar;
DELIMITER //  
CREATE PROCEDURE deletar()   
BEGIN
	WHILE (SELECT count(idData) FROM findesk.data where idData > 1) DO 
		
		DELETE FROM data WHERE (idData > 1);

	END WHILE;
END;


call deletar();