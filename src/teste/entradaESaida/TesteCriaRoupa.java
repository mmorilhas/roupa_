package teste.entradaESaida;

import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.EntradaESaida.TrataDados;

public class TesteCriaRoupa{
	
	@Test
	@DisplayName("Se calca cria certo dentro do metodo CriaRoupa")
	void criaRoupa_calca(){
		
		String s = "Calca,44,feminino,BAIXO,azul,sim,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,sim,justa,nao,nao,malha,seda,linho,sem,null,null,null,nao,null,null,null,null,null,null,null,pantacourt,sem punho,justo,alta";

		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}

	@Test
	@DisplayName("Se top cria certo dentro do metodo CriaRoupa")
	void criaRoupa_top(){
		
		String s = "top,14,feminino,cima,rosa,nao,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,acrilico,poliester,sem,regata,gola alta,justa,nao,null,cintura,null,null,null,null,null,null,null,null,null";

		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se vestido cria certo dentro do metodo CriaRoupa")
	void criaRoupa_vestido(){
		
		String s ="vestido,33,feminino,CORPO iNTEIRO,rosa,sim,fita frente,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,elastano,algodao,sem,longa vazado,em v,baixa,nao,null,null,null,null,null,null,micro,null,null,null,null";

		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se poncho cria certo dentro do metodo CriaRoupa")
	void criaRoupa_poncho(){
		
		String s ="poncho,35,masculino,cima,rosa,sim,ziper_frente,invisivel,nao,nao possui,nao,nao,nao,nao,nao,nao,reta,nao,nao,plano,algodao,poliester,sem,sem manga,v,sem,nao,null,null,quadril,null,null,null,null,null,null,null,null";



		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se casaco cria certo dentro do metodo CriaRoupa")
	void criaRoupa_casaco(){
		
		String s ="casaco,32,feminino,cima,rosa,sim,botao costas,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,baggy,sim,sim,malha,liocel,couro,sem,curta tulipa,quadrado,baixa,nao,null,null,null,quadril,null,null,null,null,null,null,null";


		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se body cria certo dentro do metodo CriaRoupa")
	void criaRoupa_body(){
		
		String s ="body,33,feminino,CORPO iNTEIRO,rosa,sim,colchete lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,jacquard,modal,poliamida,sem,curta bufante punho elastico,careca,baixa,nao,null,null,null,null,com botao,slip,null,null,null,null,null";



		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se calcola cria certo dentro do metodo CriaRoupa")
	void criaRoupa_calcola(){
		
		String s = "Tanga,44,feminino,BAIXO,azul,sim,ziper frente,invisivel,sim,nao possui,sim,nao,nao,nao,nao,sim,justa,nao,nao,malha,lã,la,sem,null,null,null,nao,null,null,null,null,null,slip,null,null,null,null,alta";


		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se macacao cria certo dentro do metodo CriaRoupa")
	void criaRoupa_macacao(){
		
		String s = "macacao,33,feminino,CORPO iNTEIRO,rosa,sim,botao lateral,invisivel,sim,plissado,sim,sim,sim,nao,sim,sim,justa,sim,sim,malha,acetato,linho,sem,curta bufante punho elástico,gola alta,baixa,sim,null,null,null,null,null,null,null,pantacourt,sem punho,justo,null";



		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se saia cria certo dentro do metodo CriaRoupa")
	void criaRoupa_saia(){
		
		String s = "saia,34,feminino,baixo,azul,sim,nao possui,invisivel,sim,nao possui,sim,nao,nao,nao,nao,sim,justa,nao,nao,malha,algodao,poliamida,sem,null,null,null,nao,null,null,null,null,null,null,micro,null,null,null,alta";




		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}
	
	@Test
	@DisplayName("Se blusa cria certo dentro do metodo CriaRoupa")
	void criaRoupa_blusa(){
		
		String s = "camiseta,14,feminino,cima,rosa,nao,ziper costas,invisivel,sim,nao possui,sim,nao,nao,nao,nao,nao,reta,nao,nao,plano,algodao,poliester,acrilico,três quartos godê,gola alta,justa,nao,cropped,null,null,null,null,null,null,null,null,null,null";





		
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
		td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		
		
		assertFalse(td.getSaida().isEmpty());
	}

}
