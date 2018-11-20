select item.idItem , nome.nome , item.descricaoItem 
from item,nome,cor,categoria, dataentrada , data, dia, mes, ano
where item.idNome = nome.idNome and
		item.retiradoItem = 0 and
		nome.nome like "Pendrive" and 
        categoria.idCategoria = nome.idCategoria and 
        cor.idCor = item.idCor and 
        cor.nomeCor like "Preto" and
        dataentrada.idDataEntrada = item.idDataEntrada and
        data.idData = dataentrada.idData and
        data.idDia = dia.idDia and
        data.idMes = mes.idMes and
        data.idAno = ano.idAno and
        dia.idDia like "1" and
        mes.idMes like "1" and
        ano.idAno like "2018"
        ;