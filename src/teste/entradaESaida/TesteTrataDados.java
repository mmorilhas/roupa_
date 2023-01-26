package teste.entradaESaida;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.EntradaESaida.TrataDados;


public class TesteTrataDados {

	@Test
	@DisplayName("Se Nome errado corta o for")
	void nome(){
		
		String s = "Outra,40,mascULINO,CORPO INTEIRO,outro,nao,bot,desfiada,,plissado,n,sim,nao,n ,nao,n,baggy,nao,nao,plano,poliester,outr,sem,longa simples,gola alta,justa,nao,nao,null,null,null,null,null,null,null,n,n,n,baixa\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[31].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[37].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[38].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se tamanho errado corta o for")
	void tamanho() {
		String s = "camisa,120,mascULINO,CORPO INTEIRO,outro,nao,bot,desfiada,plissad,n,sim,nao,n,nao,n,baggy,nao,nao,plano,poliester,outr,sem,longa,simples,gola alta,justa,nao,nao,nul,null,null,null,null,null, null null,null,null,n,n,n,baixa";
	
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se genero errado corta o for")
	void genero(){
		
		String s = "camisa,40,mascULINUO,CORPO INTEIRO,outro,nao,bot,desfiada,plissad,n,sim,nao,n,nao,n,baggy,nao,nao,plano,poliester,outr,sem,longa,simples,gola alta,justa,nao,nao,nul,null,null,null,null,null,null,null,n,n,n,baixa";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se cor errada corta o for")
	void cores(){
		
		String s = "Calça,38,feminino,CIMA,verde claro,sim,ziper frontal,invisivel,sim,sem,sim,nao,nao,nao,nao,sim,justo,nao,nao,malha,algodao,poliamida,sem,TRES QUARTOS ,v,sem,sim,nao,null,null,null,null,quadrilCasac,null,null,null,pantacourt,sem punho,justo,alta";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se booleans errados cortam o for")
	void booleans(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,siRm,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\r\n"
				+ "";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se tipoFechamento errado corta o for")
	void tipoFechamento(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,boRtao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\r\n"
				+ "";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se barra errado corta o for")
	void barra(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisiRvel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se pregas errado corta o for")
	void pregas(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,nãRo possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se silhueta errado corta o for")
	void silhueta(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reRta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se manga errado corta o for")
	void manga(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,reRgata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se decote errado corta o for")
	void decote(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,coRlarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se cava errado corta o for")
	void cava(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sRem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se compBlusa errado corta o for")
	void compBlusa(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadRril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se compBustie errado corta o for")
	void compBustie(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,sem,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se compPoncho errado corta o for")
	void compPoncho(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,t,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se compCasaco errado corta o for")
	void compCasaco(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,t,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se bodytipos errado corta o for")
	void bodyTipos(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,t,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se calcolaTipo errado corta o for")
	void calcolaTipo(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,t,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se compsaia errado corta o for")
	void compsaia(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,t,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se compCalca errado corta o for")
	void compCala(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,t,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se punhoCalca errado corta o for")
	void punhoCalca(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,t,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se ganchoCalca errado corta o for")
	void ganchoCalca(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,t,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se cintura errado corta o for")
	void cintura(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,t\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se construcaoTecido errado corta o for")
	void construcaoTecido(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tRnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se construcaoTecido e TipoFechamento errado corta o for")
	void construcaoTecido_e_TipoFechamento(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,nao possui,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se fibras errado corta o for")
	void nomeFibras(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algDodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se tipoRoupa errado corta o for")
	void tipoRoupa(){
		
		String s = "camisa,12,masculino,cRima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se tipoRoupa e nome errado corta o for")
	void nome_e_tipoRoupa(){
		
		String s = "camisa,12,masculino,baixo,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se !manga em parte de cima errado corta o for")
	void manga_em_parte_de_cima(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,null,colarinho curto,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se !manga em roupas corpoInteiro errado corta o for")
	void manga_em_corpoInteiro_(){
		
		String s = "macacao,33,feminino,CORPO iNTEIRO,rosa,sim,botao lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,acetato,linho,sem,null,gola alta,baixa,sim,null,null,null,null,null,null,null,pantacourt,sem punho,justo,null\r\n";
		
		
		String[] vect = s.split(",");
		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se lapela em peça sem lapela errado corta o for")
	void lapela_em_parteDeCimaSemLapela(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,lapela xale,sem,nao,sim,quadril,null,null,lapela_xale,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se tomara que caia e interdependencias errado corta o for")
	void tomaraQueCaia_e_Interdependencias(){
		
		String s = "jaqueta,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,tomara_que_caia,sem,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se tomara que caia e interdependencias errado corta o for")
	void tomaraQueCaia_e_Interdependencias_(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,tomara_que_caia,baixa,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_gancho(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,null,null,null,null,justo,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_cintura(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,null,null,null,null,null,alta\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_punho(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,null,null,null,sem,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_compCalca(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,null,null,pantacour,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_compSaia(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,null,micro,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_calcolaTipo(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,null,slip,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se parte de cima e contem partes de baixo  corta o for")
	void parteDeCima_e_tem_partesDeBaixo_bodyTipo(){
		
		String s = "blusa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,v,baixa,nao,sim,quadril,null,null,null,null,sem,null,null,null,null,null,null\\r\\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se nao contem manga em parteDeCimaComLapela  corta o for")
	void manga_em_PartesCimaComLapela(){
		
		String s = "casaco,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,sem,quadrado,baixa,nao,nao,null,null,null,LAPELA_XALE,quadril,null,null,null,null,null,null,null\r\n"
				+ "";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String temCapa = vect[27].toLowerCase().trim();
		String comprimentoBlusa = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[30].toLowerCase().trim().replace(" ", "_");
		String lapela = vect[31].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[32].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[33].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[34].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[35].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[37].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[38].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[39].toLowerCase().trim().replace(" ", "_");
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se lapela e capuz em parteDeCimaComLapela  corta o for")
	void lapela_e_capuz_em_PartesCimaComLapela(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,lapela xale,sem,sim,quadril,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se colarinho e capuz em parteDeCimaComLapela  corta o for")
	void colarinho_e_capuz_em_PartesCimaComLapela(){
		
		String s = "camisa,12,masculino,cima,rosa,nao,botao lateral,invisivel,nao,não possui,nao,nao,nao,nao,sim,nao,reta,nao,sim,tnt,algodao,poliester,linho,regata raglan,colarinho curto,sem,sim,quadril,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se top e interdependencias corta o for")
	void top_e_interdependencias_compBlusa(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,cintura,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	
	@Test
	@DisplayName("Se top e interdependencias corta o for")
	void top_e_interdependencias_semCompBustie(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se top e interdependencias corta o for")
	void top_e_interdependencias_compPoncho(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,null,cintura,quadril,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se top e interdependencias corta o for")
	void top_e_interdependencias_compCasaco(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,null,cintura,null,quadril,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se top e interdependencias corta o for")
	void top_e_interdependencias_edecoteLapela(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,lapela xale,justa,nao,null,cintura,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se blusa e interdependencias corta o for")
	void blusa_e_interdependencias_compTop(){
		
		String s = "blusa,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,cintura,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se blusa e interdependencias corta o for")
	void blusa_e_interdependencias_compPoncho(){
		
		String s = "blusa,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,null,quadril,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");
	
		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se blusa e interdependencias corta o for")
	void blusa_e_interdependencias_compCasaco(){
		
		String s = "camiseta, 14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,null,null,quadril,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se camisa se sem colarinho corta o for")
	void camisa_sem_colarinho(){
		
		String s = "camisa,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se colete e tem manga corta o for")
	void colete_e_com_manga(){
		
		String s = "colete,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,curta vazada,gola alta,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se colete e gola alta corta o for")
	void colete_e_decote_golaAlta(){
		
		String s = "colete,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se colete e gola alta corta o for")
	void colete_e_decote_colarinho(){
		
		String s = "colete,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,colarinho italiano ,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null\r\n";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se poncho e interdependencias corta o for")
	void poncho_manga (){
		
		String s = "poncho,35,masculino,cima,rosa,sim,ziper_frente,invisivel,nao,nao possui,nao,nao,nao,nao,nao,nao,reta,nao,nao,plano,algodao,poliester,sem,regata,v,sem,nao,null,null,quadril,null,null,null,null,null,null,null,null";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se poncho e interdependencias corta o for")
	void poncho_cava(){
		
		String s = "poncho,35,masculino,cima,rosa,sim,ziper_frente,invisivel,nao,nao possui,nao,nao,nao,nao,nao,nao,reta,nao,nao,plano,algodao,poliester,sem,sem manga,v,justa,nao,null,null,quadril,null,null,null,null,null,null,null,null";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se casaco e interdependencias corta o for")
	void casaco_compTop(){
		
		String s = "casaco,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,curta tulipa,quadrado,baixa,nao,null,cintura,null,quadril,null,null,null,null,null,null,null";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se casaco e interdependencias corta o for")
	void casaco_compBlusa(){
		
		String s = "casaco,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,curta tulipa,quadrado,baixa,nao,cropped,null,null,quadril,null,null,null,null,null,null,null";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se casaco e interdependencias corta o for")
	void casaco_compPoncho(){
		
		String s = "casaco,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,curta tulipa,quadrado,baixa,nao,null,null,quadril,quadril,null,null,null,null,null,null,null";
		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se casaco e interdependencias corta o for")
	void blazer_sem_lapela(){
		
		String s = "blazer,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,curta tulipa,v,baixa,nao,null,null,null,quadril,null,null,null,null,null,null,null";

		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_semCompSaia(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,null,null,null,null,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_CalcolaTipo(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,null,null,slip,midi,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_bodyTipo(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,null,sem,null,micro,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_compCasaco(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,quadril,null,null,micro,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_compPoncho(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,quadril,null,null,null,micro,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_compTop(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,cintura,null,null,null,null,micro,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias_compBlusa(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,quadril,null,null,null,null,null,null,null,null,null,null ";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void vestido_e_interdependencias__(){
		
		String s = "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,null,null,null,null,null,null,null,null";
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	 @Test
	@DisplayName("Se vestido e interdependencias corta o for")
	void  vestido_e_interdependencias_todosErrados(){
	  
	  String s =
	  "vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,cropped,cintura,quadril,quadril,sem,slip,null,pantacourt,sem,justo,alta"
	  ;
	  
	  
	  String[] vect = s.split(",");
	  
	  String nome = vect[0].toLowerCase().trim(); String tamanho = vect[1].trim();
	  String genero = vect[2].toLowerCase().trim(); String tipoRoupa =
	  vect[3].toLowerCase().trim().replace(" ", "_"); String cor =
	  vect[4].toLowerCase().trim(); String temBolso = vect[5].toLowerCase().trim();
	  String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
	  String barra = vect[7].toLowerCase().trim().replace(" ", "_"); String temPala
	  = vect[8].toLowerCase().trim(); String pregas =
	  vect[9].toLowerCase().trim().replace(" ", "_"); String temPence =
	  vect[10].toLowerCase().trim(); String temFenda =
	  vect[11].toLowerCase().trim(); String temForro =
	  vect[12].toLowerCase().trim(); String temBabado =
	  vect[13].toLowerCase().trim(); String temCinto =
	  vect[14].toLowerCase().trim(); String temPassantes =
	  vect[15].toLowerCase().trim(); String silhueta =
	  vect[16].toLowerCase().trim(); String temEstampa =
	  vect[17].toLowerCase().trim(); String temBordado =
	  vect[18].toLowerCase().trim(); String construcaoTecido =
	  vect[19].toLowerCase().trim(); String nomeFibra1 =
	  vect[20].toLowerCase().trim(); String nomeFibra2 =
	  vect[21].toLowerCase().trim(); String nomeFibra3 =
	  vect[22].toLowerCase().trim(); String manga =
	  vect[23].toLowerCase().trim().replace(" ", "_"); String decote =
	  vect[24].toLowerCase().trim().replace(" ", "_"); String cava =
	  vect[25].toLowerCase().trim().replace(" ", "_"); String temCapuz =
	  vect[26].toLowerCase().trim(); String comprimentoBlusa =
	  vect[27].toLowerCase().trim().replace(" ", "_"); String comprimentoTop =
	  vect[28].toLowerCase().trim().replace(" ", "_"); String comprimentoPoncho =
	  vect[29].toLowerCase().trim().replace(" ", "_"); String comprimentoCasaco =
	  vect[30].toLowerCase().trim().replace(" ", "_"); String bodyTipo =
	  vect[31].toLowerCase().trim().replace(" ", "_"); String calcolaTipo =
	  vect[32].toLowerCase().trim().replace(" ", "_"); String comprimentoSaia =
	  vect[33].toLowerCase().trim().replace(" ", "_"); String comprimentoCalca =
	  vect[34].toLowerCase().trim().replace(" ", "_"); String punhoCalca =
	  vect[35].toLowerCase().trim().replace(" ", "_"); String ganchoTipo =
	  vect[36].toLowerCase().trim().replace(" ", "_"); String cintura =
	  vect[37].toLowerCase().trim().replace(" ", "_");
	  
	  
	  TrataDados td = new TrataDados(); td.populaListas();
	  
	  td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero,
	  cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda,
	  temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento,
	  barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2,
	  nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop,
	  comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia,
	  comprimentoCalca, punhoCalca, ganchoTipo, cintura);
	  
	  assertFalse(td.getSaida().isEmpty()); }
	 
	@Test
	@DisplayName("Se body e interdependencias corta o for")
	void body_e_interdependencias(){
		
		String s = "body,33,feminino,CORPO iNTEIRO,rosa,sim,colchete lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,jacquard,modal,poliamida,sem,curta bufante punho elastico,careca,baixa,nao,cropped,cintura,quadril,quadril,sem,slip,micro,pantacourt,sem,justo,alta";

		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se body e interdependencias corta o for")
	void body_e_interdependencias_(){
		
		String s = "body,33,feminino,CORPO iNTEIRO,rosa,sim,colchete lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,jacquard,modal,poliamida,sem,curta bufante punho elastico,careca,baixa,nao,cropped,cintura,null,null,com botao,slip,null,null,null,null,null";

		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se macacao e interdependencias corta o for")
	void macacao_e_interdependencias_(){
		
		String s = "macacao,33,feminino,CORPO iNTEIRO,rosa,sim,botao lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,acetato,linho,sem,curta bufante punho elástico,gola alta,baixa,sim,cropped,null,null,null,null,null,null,null,sem,justo,alta";


		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}


	@Test
	@DisplayName("Se partes de Baixo e interdependencias corta o for")
	void pBaixo_e_interdependencias_(){
		
		String s = "Calca,44,feminino,BAIXO,azul,sim,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,sim,justa,nao,nao,malha,seda,linho,sem,curta vazada,quadrado,null,nao,null,null,null,null,null,null,null,pantacourt,sem punho,justo,alta";


		
		
		String[] vect = s.split(",");

		String nome = vect[0].toLowerCase().trim();
		String tamanho = vect[1].trim();
		String genero = vect[2].toLowerCase().trim();
		String tipoRoupa = vect[3].toLowerCase().trim().replace(" ", "_");
		String cor = vect[4].toLowerCase().trim();
		String temBolso = vect[5].toLowerCase().trim();
		String tipoFechamento = vect[6].toLowerCase().trim().replace(" ", "_");
		String barra = vect[7].toLowerCase().trim().replace(" ", "_");
		String temPala = vect[8].toLowerCase().trim();
		String pregas = vect[9].toLowerCase().trim().replace(" ", "_");
		String temPence = vect[10].toLowerCase().trim();
		String temFenda = vect[11].toLowerCase().trim();
		String temForro = vect[12].toLowerCase().trim();
		String temBabado = vect[13].toLowerCase().trim();
		String temCinto = vect[14].toLowerCase().trim();
		String temPassantes = vect[15].toLowerCase().trim();
		String silhueta = vect[16].toLowerCase().trim();
		String temEstampa = vect[17].toLowerCase().trim();
		String temBordado = vect[18].toLowerCase().trim();
		String construcaoTecido = vect[19].toLowerCase().trim();
		String nomeFibra1 = vect[20].toLowerCase().trim();
		String nomeFibra2 = vect[21].toLowerCase().trim();
		String nomeFibra3 = vect[22].toLowerCase().trim();
		String manga = vect[23].toLowerCase().trim().replace(" ", "_");
		String decote = vect[24].toLowerCase().trim().replace(" ", "_");
		String cava = vect[25].toLowerCase().trim().replace(" ", "_");
		String temCapuz = vect[26].toLowerCase().trim();
		String comprimentoBlusa = vect[27].toLowerCase().trim().replace(" ", "_");
		String comprimentoTop = vect[28].toLowerCase().trim().replace(" ", "_");
		String comprimentoPoncho = vect[29].toLowerCase().trim().replace(" ", "_");
		String comprimentoCasaco = vect[30].toLowerCase().trim().replace(" ", "_");
		String bodyTipo = vect[31].toLowerCase().trim().replace(" ", "_");
		String calcolaTipo = vect[32].toLowerCase().trim().replace(" ", "_");
		String comprimentoSaia = vect[33].toLowerCase().trim().replace(" ", "_");
		String comprimentoCalca = vect[34].toLowerCase().trim().replace(" ", "_");
		String punhoCalca = vect[35].toLowerCase().trim().replace(" ", "_");
		String ganchoTipo = vect[36].toLowerCase().trim().replace(" ", "_");
		String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
		
		
		TrataDados td = new TrataDados();
		td.populaListas();
		
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,  temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3,  manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		assertFalse(td.getSaida().isEmpty());
	}


	void testaContagemErros() {
		TrataDados td = new TrataDados();
		assertEquals(td.getContagemErros(), 0);
	}

}
