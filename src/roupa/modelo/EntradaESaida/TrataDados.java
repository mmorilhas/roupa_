package roupa.modelo.EntradaESaida;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import roupa.modelo.Roupa;
import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.pBaixo.comPernas.Calca.CalcaBuilder;
import roupa.modelo.pBaixo.enumerators.BodyTipos;
import roupa.modelo.pBaixo.enumerators.CalcolaTipos;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.pBaixo.enumerators.GanchoTipos;
import roupa.modelo.pBaixo.enumerators.PunhoCalca;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.pBaixo.semPernas.Saias.SaiasBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Blusa.BlusaBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Bustie.BustieBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Poncho.PonchoBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Body.BodyBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Casacos.CasacosBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Macacao.MacacaoBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Vestido.VestidoBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBlusa;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBustie;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoCasaco;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoPoncho;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;

public class TrataDados {
	final List<String> todasRoupas = new ArrayList<>();
	final List<String> partesDeCimaSemLapela = new ArrayList<>();
	final List<String> partesDeCimaLapela = new ArrayList<>();
	final List<String> deCorpoInteiro = new ArrayList<>();
	final List<String> partesDeBaixoComPernas = new ArrayList<>();
	final List<String> partesDeBaixoSemPernas = new ArrayList<>();
	final List<String> cores = new ArrayList<>();
	final List<String> booleans = new ArrayList<>();
	static List<Object> saida = new ArrayList<>();

	// CONTAGEM LINHA / ERRO / ROUPA CRIADA
	static Integer contagemLinha = 2;
	static Integer contagemErros = 0;
	static Integer contagemRoupasCriadas =0;

	public void populaListas() {
		String[] roupas1 = { "calça", "calca", "bermuda", "shorts", "saia", "body", "macacao", "macacão", "vestido",
				"calcinha", "tanga", "cueca", "sunga", "blusa", "camiseta", "camisa", "poncho", "colete", "top",
				"casaco", "blazer", "jaqueta" };
		for (int i = 0; i < roupas1.length; i++) {
			todasRoupas.add(roupas1[i]);
		}

		// PARTES DE CIMA SEM LAPELA
		partesDeCimaSemLapela.add("camiseta");partesDeCimaSemLapela.add("blusa");partesDeCimaSemLapela.add("camisa");
		partesDeCimaSemLapela.add("top");	partesDeCimaSemLapela.add("poncho"); partesDeCimaSemLapela.add("colete") ;

		// PARTES DE CIMA COM LAPELA
		partesDeCimaLapela.add("jaqueta");partesDeCimaLapela.add("casaco");partesDeCimaLapela.add("blazer");

		// PARTES DE CIMA CORPOINTEIRO
		deCorpoInteiro.add("body");	deCorpoInteiro.add("macacao");deCorpoInteiro.add("macacão");deCorpoInteiro.add("vestido");

		// PARTES DE BAIXO COM PERNAS
		partesDeBaixoComPernas.add("calca");partesDeBaixoComPernas.add("calça");partesDeBaixoComPernas.add("bermuda");
		partesDeBaixoComPernas.add("shorts");

		// PARTES DE BAIXO SEM PERNAS
		partesDeBaixoSemPernas.add("tanga");partesDeBaixoSemPernas.add("calcinha");	partesDeBaixoSemPernas.add("saia");
		partesDeBaixoSemPernas.add("cueca");

		// LISTA DE CORES ACEITAS
		cores.add("azul");	cores.add("amarelo");cores.add("vermelho");	cores.add("rosa");	cores.add("laranja");
		cores.add("verde");	cores.add("preto");	cores.add("branco"); cores.add("nude");	cores.add("marrom");

		// LISTA VALORES ACEITOS TRUE OR FALSE
		booleans.add("sim");booleans.add("true");booleans.add("nao");booleans.add("não");booleans.add("false");

	}

	// MSG DE ERRO ENTRADA INCORRETA
	static String msgErro(String entrada, Integer linha) {
		return "\n\nNão foi possível instanciar o objeto. Este campo não aceita este valor ->  " + entrada + "  Linha: "
				+ linha;
	}
	// MSG DE ERRO ENTRADA BOOLEAN INCORRETA
	static String msgErro(Integer linha) {
		return "\n\nNão foi possível instanciar o objeto. Este campo é booleano e não aceita este valor. Verifique os seguintes campos: bolso - pence - fenda - forro - babado - cinto - passantes - pala - estampa - bordado - capuz e capa.  Linha: "
				+ linha;
	}
	// MSG ERRO ERRO FIBRAS
	static String msgErro(String entrada, String entrada2, String entrada3, Integer linha) {
		return "\n\nNão foi possível instanciar o objeto. Verifique os campos: " + entrada + " - " + entrada2 + " - "
				+ entrada3 + "    Linha: " + linha;
	}
	// MSG ERRO ERRO INTERDEPENDENCIAS
	static String msgErro(String entrada, String entrada2, String entrada3, String entrada4, Integer linha) {
		return "\n\nNão foi possível instanciar o objeto. Verifique os campos:" + entrada + " - " + entrada2 + " - "
				+ entrada3 + " - " + entrada4 + " Linha: " + linha;
	}

	static String msgErro(String entrada, String entrada2, Integer linha) {
		return "\n\nNão foi possível instanciar o objeto. Estes campos não podem ter esses valores simultaneamente: "
				+ entrada + " - " + entrada2 + "  Linha: " + linha;
	}

	
	// Transforma entradas (sim, não) em Boolean
	static Boolean entradaToBoolean(String valor) {
		if (valor.equals("true") || valor.equals("sim")) {
			return true;
		}
		return false;
	}
	

	public void confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(String nome, String tamanho, 
			String genero, 
			String cor, 
			String tipoRoupa, 
			String temBolso, 
			String temPala, 
			String temPence, String temForro, String temBabado, String temFenda, String temCinto, String temPassantes, String temEstampa, String temCapuz, String temBordado, 
			String tipoFechamento, 
			String barra,
			String pregas, 
			String silhueta, 
			String construcaoTecido,
			String nomeFibra1, String nomeFibra2, String nomeFibra3, 
			String manga, 
			String decote,
			String cava, 
			String comprimentoBlusa, 
			String comprimentoTop,
			String comprimentoPoncho,
			String comprimentoCasaco,
			String bodyTipo, 
			String calcolaTipo, String comprimentoSaia, String comprimentoCalca, String punhoCalca, String ganchoTipo, String cintura) {
		

		for (int teste = 0; teste < 1; teste++) {
//   -------------------  Verificando NOME    ------------------- 
			if (!this.getRoupas().contains(nome)) {
				saida.add(msgErro("nome", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//    -------------------  Verificando TAMANHO  ------------------- 
			if (!(tamanho.matches("^[0-9]+$") && Integer.parseInt(tamanho) > 0
					&& Integer.parseInt(tamanho) < 90)) {
				saida.add(msgErro("tamanho", contagemLinha));

				contagemLinha++;
				contagemErros++;
				break;
			}

//   -------------------  Verificando GENERO  ------------------- 
			if (!Genero.existeNoEnum(genero)) {
				saida.add(msgErro("genero", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	-------------------  Verificando COR  ------------------- 
			if (!this.getCores().contains(cor)) {
				saida.add(msgErro("cor", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	 -------------------  Verificando Booleans  ------------------- 
			if (!this.getBooleans().contains(temBolso) || !this.getBooleans().contains(temPala) || !this.getBooleans().contains(temPence)
					|| !this.getBooleans().contains(temFenda) || !this.getBooleans().contains(temForro)
					|| !this.getBooleans().contains(temBabado) || !this.getBooleans().contains(temCinto)
					|| !this.getBooleans().contains(temPassantes) || !this.getBooleans().contains(temPala)
					|| !this.getBooleans().contains(temEstampa) || !this.getBooleans().contains(temBordado)
					|| !this.getBooleans().contains(temCapuz) ) {
				saida.add(msgErro(contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	-------------------  VerificandoTIPO FECHAMENTO  ------------------- 
			if (!TipoFechamento.existeNoEnum(tipoFechamento)) {
				saida.add(msgErro("tipoFechamento", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	-------------------  Verificando BARRA  ------------------- 
			if (!Barra.existeNoEnum(barra)) {
				saida.add(msgErro("barra", contagemLinha));
				
				contagemLinha++;
				contagemErros++;
				break;
			}

//  -------------------  Verificando Pregas  ------------------- 
			if (!Pregas.existeNoEnum(pregas)) {
				saida.add(msgErro("pregas", contagemLinha));

				contagemLinha++;
				contagemErros++;
				break;
			}

//   -------------------  Verificando SILHUETA  ------------------- 
			if (!Silhueta.existeNoEnum(silhueta)) {
				saida.add(msgErro("silhueta", contagemLinha));

				contagemLinha++;
				contagemErros++;
				break;
			}


// -------------------  Verificando MANGA ------------------- 
			if (!(Manga.existeNoEnum(manga) || manga.contains("null"))) {
				saida.add(msgErro("manga", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//  -------------------  Verificando DECOTE ------------------- 
			if (!(Decote.existeNoEnum(decote) || decote.contains("null"))) {
				saida.add(msgErro("decote", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//   -------------------  Verificando CAVA ------------------- 
			if (!(Cava.existeNoEnum(cava) || cava.contains("null"))) {
				saida.add(msgErro("cava", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//  ------------------  Verificando COMP BLUSA ------------------- 
			if (!(ComprimentoBlusa.existeNoEnum(comprimentoBlusa) || comprimentoBlusa.contains("null"))) {
				saida.add(msgErro("Comprimento Blusa", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	  -------------------  Verificando COMP TOP ------------------- 
			if (!(ComprimentoBustie.existeNoEnum(comprimentoTop) || comprimentoTop.contains("null"))) {
				saida.add(msgErro("Comprimento Bustie", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
				
			}
//	 -------------------  Verificando COMP PONCHO ------------------- 
			if (!(ComprimentoPoncho.existeNoEnum(comprimentoPoncho) || comprimentoPoncho.contains("null"))) {
				saida.add(msgErro("Comprimento Poncho", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	 -------------------  Verificando COMP CASACO ------------------- 
			if (!(ComprimentoCasaco.existeNoEnum(comprimentoCasaco) || comprimentoCasaco.contains("null"))) {
				saida.add(msgErro("Comprimento Casaco", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	 -------------------  Verificando BODY TIPO ------------------- 
			if (!(BodyTipos.existeNoEnum(bodyTipo) || bodyTipo.contains("null"))) {
				saida.add(msgErro("Body Tipo", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	 -------------------  Verificando CALCOLA TIPO ------------------- 
			if (!(CalcolaTipos.existeNoEnum(calcolaTipo) || calcolaTipo.contains("null"))) {
				saida.add(msgErro("Calçola Tipo", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	-------------------  Verificando COMP SAIA ------------------- 
			if (!(ComprimentoDeSaia.existeNoEnum(comprimentoSaia) || comprimentoSaia.contains("null"))) {
				saida.add(msgErro("comprimento Saia", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	 -------------------  Verificando COMP CALCA------------------- 
			if (!(ComprimentoDeCalca.existeNoEnum(comprimentoCalca) || comprimentoCalca.contains("null"))) {
				saida.add(msgErro("comprimento Calça", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//	-------------------  Verificando PUNHO CALCA TIPO ------------------- 
			if (!(!PunhoCalca.existeNoEnum(punhoCalca) || punhoCalca.contains("null"))) {
				saida.add(msgErro("punho Calça", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	 -------------------  Verificando GANCHO  ------------------- 
			if (!(!GanchoTipos.existeNoEnum(ganchoTipo) || ganchoTipo.contains("null"))) {
				saida.add(msgErro("gancho", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
//	-------------------  Verificando CINTURA  ------------------- 
			if (!(Cintura.existeNoEnum(cintura) || cintura.contains("null"))) {
				saida.add(msgErro("cintura", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

//    -------------------  Verificando CONSTRUÇÃO   ------------------- 
			if (!Construcao.existeNoEnum(construcaoTecido)) {
				saida.add(msgErro("construcaoTecido", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			// Se não for malha, Fechamento precisa ser diferente de "não possui"
		
			if((tipoFechamento.equals("não_possui") || tipoFechamento.equals("nao_possui")) && !(construcaoTecido.equals("malha") || silhueta.equalsIgnoreCase("baggy"))){
					saida.add(msgErro("construcaoTecido", "tipoFechamento", "silhueta", contagemLinha));
					contagemLinha++;
					contagemErros++;
					break;
			}
				
		
				

//   -------------------  Verificando FIBRAS   ------------------- 
			if (!(NomeFibra.existeNoEnum(nomeFibra1) && NomeFibra.existeNoEnum(nomeFibra2)
					&& NomeFibra.existeNoEnum(nomeFibra3) || nomeFibra3.equals("sem"))) {
				saida.add(msgErro("nomeFibra1", "nomeFibra2", "nomeFibra3", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;

			}
			

//-------------------  Verificando Tipo De Roupa  -------------------  
			if (!TipoDeRoupa.existeNoEnum(tipoRoupa)) {
				saida.add(msgErro("tipoRoupa", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			// Tipo De Roupa e interdependencias
			if (!(this.getPartesDeCimaSemLapela().contains(nome) && tipoRoupa.contains("cima"))
					&& !(this.getPartesDeBaixoComPernas().contains(nome) && tipoRoupa.contains("baixo"))
					&& !(this.getPartesDeBaixoSemPernas().contains(nome) && tipoRoupa.contains("baixo"))
					&& !(this.getPartesDeCimaLapela().contains(nome) && tipoRoupa.contains("cima"))
					&& !(this.getDeCorpoInteiro().contains(nome) && tipoRoupa.contains("inteiro"))) {
				saida.add(msgErro("name", "tipoRoupa", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
			
			
//=======================================================================
			
			
//		     -------------------  Verificando Partes De Cima  ------------------- 

			// parte de cima precisa ter manga e decote definido
			if ((this.getPartesDeCimaSemLapela().contains(nome) || this.getPartesDeCimaLapela().contains(nome)
					|| this.getDeCorpoInteiro().contains(nome))
					&& !(Manga.existeNoEnum(manga) && Decote.existeNoEnum(decote) && Cava.existeNoEnum(cava))) {
				saida.add(msgErro("nome", "manga", "decote", "cava", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			// se lapela em peça que não tem
			if (decote.contains("lapela_") && this.getPartesDeCimaSemLapela().contains(nome)) {
				saida.add(msgErro("lapela", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			// se tomara que caia -> sem cava e sem ser casaco
			if ((decote.equals("tomara_que_caia") && !cava.contains("sem"))
					|| decote.equals("tomara_que_caia") && this.getPartesDeCimaLapela().contains(nome)) {
				saida.add(msgErro("decote", "manga", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;

			}

			// se tem parte de baixo em peça de cima

			if (this.getPartesDeCimaSemLapela().contains(nome) || this.getPartesDeCimaLapela().contains(nome)) {
				if (!(comprimentoCalca.equals("null") && bodyTipo.equals("null") && calcolaTipo.equals("null")
						&& comprimentoSaia.equals("null") && punhoCalca.equals("null") && cintura.equals("null")
						&& ganchoTipo.equals("null"))) {
					saida.add(
							msgErro("nome", "campos de parte baixo também estão preenchidos", contagemLinha));
					contagemLinha++;
					contagemErros++;
					break;
				}
			}

			// se sem manga em peças que precisam ter
			if ((this.getPartesDeCimaLapela().contains(nome) || nome.contains("camisa") || nome.contains("blusa")
					|| nome.contains("camiseta")) && manga.contains("sem")) {
				saida.add(msgErro("nome", "manga", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
			
			if(manga.contains("regata") && cava.contains("sem")) {
				saida.add(msgErro("nome", "manga", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			// se colarinho ou lapela -> sem capuz
			
			if ((decote.contains("colarinho") || decote.contains("lapela"))	&& entradaToBoolean(temCapuz).equals(true)) {
				saida.add(msgErro("decote", "capuz", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			
			//==================== Se TOP
			if (nome.contains("top") 
					&& (!comprimentoBlusa.equals("null")
							|| !comprimentoPoncho.equals("null") 
							|| !comprimentoCasaco.equals("null") 
							|| decote.contains("lapela"))){
				if(!ComprimentoBustie.existeNoEnum(comprimentoTop)) {
					msgErro("nome", "comprimento Bustie", "comprimento de outras peças", contagemLinha);
					contagemLinha++;
					contagemErros++;
					break;
				}
				msgErro("nome", "comprimento de outras peças", contagemLinha);
				contagemLinha++;
				contagemErros++;
				break;
			}



			//==================== Se BLUSA / CAMISETA

			if ((nome.contains("blusa") || nome.contains("camiseta") ||  nome.contains("camisa") ||  nome.contains("colete"))
					&& ComprimentoBlusa.existeNoEnum(comprimentoBlusa) && !decote.contains("lapela")
							&& (!comprimentoPoncho.equals("null")
							|| !comprimentoCasaco.equals("null") 
							|| !comprimentoTop.equals("null"))) {
				saida.add(
						msgErro("nome, comprimento Blusa", "comprimento de outras peças", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			//==================== Se CAMISA
			if (nome.contains("camisa") && !decote.contains("colarinho")) {
				saida.add(msgErro("nome", "comprimento Blusa", "decote", "comprimento de outras peças",
						contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
			
			//==================== Se COLETE
			if (nome.contains("colete") && (!manga.contains("regata") || (decote.contains("colarinho") || decote.contains("gola alta")))) {
				saida.add(msgErro("nome", "manga", "decote",
						contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}


			//==================== Se PONCHO
			if (nome.contains("poncho") && !(manga.contains("sem") 
					&& cava.equals("sem") && ComprimentoPoncho.existeNoEnum(comprimentoPoncho))) {
				saida.add(msgErro("nome", "comprimento poncho", "capa", "manga, cava", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			//==================== Se CASACO
			if ((nome.contains("casaco") || nome.contains("jaqueta") || nome.contains("blazer")) 
					&& (!ComprimentoCasaco.existeNoEnum(comprimentoCasaco) 
					|| !comprimentoPoncho.equals("null")
					|| !comprimentoTop.equals("null") 
					|| !comprimentoBlusa.equals("null"))) {
				saida.add(msgErro("nome", "lapela", "comprimento casaco", "comprimento de outras peças",
						contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;

			}
			
			if((nome.contains("casaco") || nome.contains("jaqueta") || nome.contains("blazer")) && tipoFechamento.contains("costas") ) {
				saida.add(msgErro("nome", "tipo fechamento",
						contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}
			
			if(nome.contains("blazer") && !decote.contains("lapela")) {
				saida.add(msgErro("nome", "lapela", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			
//		     -------------------  Verificando Partes CorpoInteiro ------------------- 

			//==================== Se BODY
			if (nome.contains("body") && (!BodyTipos.existeNoEnum(bodyTipo)
					|| !CalcolaTipos.existeNoEnum(calcolaTipo) || !silhueta.contains("justa")
					|| !comprimentoCalca.equals("null") || !comprimentoSaia.equals("null")
					|| !punhoCalca.equals("null") || !cintura.equals("null") && !ganchoTipo.equals("null") || !comprimentoBlusa.equals("null") || !comprimentoCasaco.equals("null") || !comprimentoPoncho.equals("null")
					|| !comprimentoTop.equals("null"))) {
				saida.add(msgErro("nome", "body tipo", "calçola tipo ",
						"comprimento/partes de outras peças", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			//==================== Se VESTIDO
			if (nome.contains("vestido") && (comprimentoSaia.equals("null") || !bodyTipo.equals("null")
					|| !calcolaTipo.equals("null") || !comprimentoCalca.equals("null")
					|| !punhoCalca.equals("null") || !cintura.equals("null") || !ganchoTipo.equals("null") || !comprimentoBlusa.equals("null") || !comprimentoCasaco.equals("null") || !comprimentoPoncho.equals("null")
					|| !comprimentoTop.equals("null"))) {
				saida.add(msgErro("nome", "comprimento saia",
						"comprimento/partes de outras peças", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			//==================== Se MACACAO
			if (nome.contains("maca") && (comprimentoCalca.equals("null") || punhoCalca.equals("null")
					|| ganchoTipo.equals("null") || !bodyTipo.equals("null") || !calcolaTipo.equals("null")
					|| !cintura.equals("null") || !comprimentoBlusa.equals("null") || !comprimentoCasaco.equals("null") || !comprimentoPoncho.equals("null")
					|| !comprimentoTop.equals("null"))) {
				saida.add(msgErro("nome", "comprimento calça",
						"comprimento/partes de outras peças", contagemLinha));

				contagemLinha++;
				contagemErros++;
				break;
			}
			


//	        -------------------  Verificando Partes De Baixo ------------------- 
			if (this.getPartesDeBaixoComPernas().contains(nome) || this.getPartesDeBaixoSemPernas().contains(nome)) {
				if (!(decote.equals("null") && manga.equals("null") && cava.equals("null")
						&& comprimentoBlusa.equals("null")
						&& comprimentoTop.equals("null") && comprimentoPoncho.equals("null")
						&& comprimentoCasaco.equals("null") && bodyTipo.equals("null")
						&& entradaToBoolean(temCapuz).equals(false))) {
					saida.add(msgErro("nome", "comprimento/partes de outras peças", contagemLinha));
					contagemLinha++;
					contagemErros++;
					break;
				}

			}
			
			//==================== Se CALÇA

			if (nome.contains("calça") || nome.contains("calca") || nome.contains("bermuda")
					|| nome.contains("shorts")) {
				if (ganchoTipo.equals("null") || cintura.equals("null") || punhoCalca.equals("null")
						|| comprimentoCalca.equals("null") || !calcolaTipo.equals("null")
						|| !comprimentoSaia.equals("null")) {
					saida.add(msgErro("nome", "comprimento calça - cintura - gancho - punho",
							"comprimento/partes de outras peças", contagemLinha));
					contagemLinha++;
					contagemErros++;
					break;
				}
			}

			if (((nome.contains("calça") || nome.contains("calca"))
					&& ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 3)
					|| (nome.contains("bermuda") && ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 2)
					|| (nome.contains("shorts") && ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 1)) {
				saida.add(msgErro("nome", "comprimento calça", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}


			//==================== Se CALÇOLA
			if (nome.contains("calcinha") || nome.contains("tanga") || nome.contains("cueca")) {
				if (calcolaTipo.equals("null") || silhueta.contains("baggy") || !ganchoTipo.equals("null")
						|| !punhoCalca.equals("null") || !comprimentoCalca.equals("null")
						|| !comprimentoSaia.equals("null") || cintura.equals("null")) {
					saida.add(msgErro("nome", "calçola tipo", "silhueta -  cintura",
							"comprimento e/ou partes de outras peças", contagemLinha));

					contagemLinha++;
					contagemErros++;
					break;
				}
			}

			if ((nome.contains("calcinha") && genero.contains("masculino"))
					|| (nome.contains("cueca") && genero.contains("feminino"))) {
				saida.add(msgErro("nome", "genero", contagemLinha));
				contagemLinha++;
				contagemErros++;
				break;
			}

			//==================== Se SAIA
			if (nome.contains("saia")) {
				if (cintura.equals("null") || comprimentoSaia.equals("null") || !ganchoTipo.equals("null")
						|| !punhoCalca.equals("null") || !comprimentoCalca.equals("null")
						|| !calcolaTipo.equals("null")) {
					saida.add(msgErro("nome", "cintura", "comprimento saia",
							"comprimento e/ou partes de outras peças", contagemLinha));
					contagemLinha++;
					contagemErros++;
					break;
				}
			}

			
			criaRoupas(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz, temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
		}
		

	}
	
	
	void criaRoupas(String nome, String tamanho, 
			String genero, 
			String cor, 
			String tipoRoupa, 
			String temBolso, 
			String temPala, 
			String temPence, String temForro, String temBabado, String temFenda, String temCinto, String temPassantes, String temEstampa, String temCapuz, String temBordado, 
			String tipoFechamento, 
			String barra,
			String pregas, 
			String silhueta, 
			String construcaoTecido,
			String nomeFibra1, String nomeFibra2, String nomeFibra3, 
			String manga, 
			String decote,
			String cava, 
			String comprimentoBlusa, 
			String comprimentoTop,
			String comprimentoPoncho,
			String comprimentoCasaco,
			String bodyTipo, 
			String calcolaTipo, String comprimentoSaia, String comprimentoCalca, String punhoCalca, String ganchoTipo, String cintura) {
		
		TrataFibraETecidoEModelagem tFibras = new TrataFibraETecidoEModelagem();
		tFibras.devolveCollectionFibra(nomeFibra1, nomeFibra2, nomeFibra3);
		
		HashSet<Fibra> fibras = (HashSet<Fibra>) tFibras.devolveCollectionFibra(nomeFibra1, nomeFibra2, nomeFibra3);
		
		
		Modelagem modelagem = tFibras.devolveModelagem(temBolso, tipoFechamento, barra, temPala, pregas, temPence, temFenda, temForro, temBabado, temCinto, temPassantes, silhueta);
		
		
		Tecido tecido = tFibras.devolveTecido(fibras, construcaoTecido);;
		
		
		
		
		if (nome.contains("top")) {
			Roupa top = new BustieBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote)).cava(Cava.pegaEnum(cava))
					.capuz(entradaToBoolean(temCapuz))
					.comprimentoBustie(ComprimentoBustie.pegaEnum(comprimentoTop)).build();

			saida.add(top);
			contagemLinha++;
			contagemRoupasCriadas++;
			
		}
		
		  if (nome.contains("blusa") || nome.contains("camiseta") ||  nome.contains("camisa") ||  nome.contains("colete")) { 
			  Roupa camisa = new BlusaBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					  .genero(Genero.pegaEnum(genero)).cor(cor).modelagem(null).tecido(null)
					  .temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					  .manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote)).cava(Cava
					  .pegaEnum(cava))
					  .capuz(entradaToBoolean(temCapuz))
					  .comprimentoBlusa(ComprimentoBlusa.pegaEnum(comprimentoBlusa)).build();
							  
			 saida.add(camisa); 
			 contagemLinha++;contagemRoupasCriadas++; 
		  }
		
		if (nome.contains("poncho")) {
			Roupa poncho = new PonchoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.decote(Decote.pegaEnum(decote)).capuz(entradaToBoolean(temCapuz))
					
					.comprimentoPoncho(ComprimentoPoncho.pegaEnum(comprimentoPoncho)).build();
			saida.add(poncho);
			contagemLinha++;contagemRoupasCriadas++;
	
		}

		
		//CASACO

		if (nome.contains("casaco") || nome.contains("jaqueta") || nome.contains("blazer")) {

			Roupa casaco = new CasacosBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
					.cava(Cava.pegaEnum(cava))
					.capuz(entradaToBoolean(temCapuz))
					.comprimentoCasaco(ComprimentoCasaco.pegaEnum(comprimentoCasaco)).build();
			saida.add(casaco);
			contagemLinha++;contagemRoupasCriadas++;
			

		}
				
				
		if (nome.contains("body")) {
			Roupa body = new BodyBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
					.cava(Cava.pegaEnum(cava))
					.capuz(entradaToBoolean(temCapuz))
					.bodyTipo(BodyTipos.pegaEnum(bodyTipo))
					.bodyCalcolaTipo(CalcolaTipos.pegaEnum(calcolaTipo)).build();
			saida.add(body);
			contagemLinha++;contagemRoupasCriadas++;
			
		}

		if (nome.contains("vestido")) {
			Roupa vestido = new VestidoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
					.cava(Cava.pegaEnum(cava))
					.capuz(entradaToBoolean(temCapuz))
					.comprimentoVestido(ComprimentoDeSaia.pegaEnum(comprimentoSaia)).build();
			saida.add(vestido);
			contagemLinha++;contagemRoupasCriadas++;
			
		}

		if (nome.contains("maca")) {
			Roupa macacao = new MacacaoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
					.cava(Cava.pegaEnum(cava))
					.capuz(entradaToBoolean(temCapuz))
					.comprimentoMacacao(ComprimentoDeCalca.pegaEnum(comprimentoCalca))
					.punhoCalca(PunhoCalca.pegaEnum(punhoCalca))
					.ganchoTipo(GanchoTipos.pegaEnum(ganchoTipo)).build();
			
			saida.add(macacao);
			contagemLinha++;contagemRoupasCriadas++;
			
		}
		
		if (nome.contains("calca") || nome.contains("calça") || nome.contains("bermuda")
				|| nome.contains("shorts")) {
			Roupa calca = new CalcaBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.cintura(Cintura.pegaEnum(cintura)).punhoCalca(PunhoCalca.pegaEnum(punhoCalca))
					.gancho(GanchoTipos.pegaEnum(ganchoTipo))
					.comprimentoCalca(ComprimentoDeCalca.pegaEnum(comprimentoCalca)).build();
			
			saida.add(calca);
			contagemLinha++;contagemRoupasCriadas++;
			
		}
		
		
		if (nome.contains("calcinha") || nome.contains("cueca") || nome.contains("tanga")) {
			Roupa calcola = new CalcolasBuilder()

					.nome(nome).tamanho(Integer.parseInt(tamanho)).genero(Genero.pegaEnum(genero)).cor(cor)
					.modelagem(modelagem).tecidos(tecido).temEstampa(entradaToBoolean(temEstampa))
					.temBordado(entradaToBoolean(temBordado)).cintura(Cintura.pegaEnum(cintura))
					.calcolaTipo(CalcolaTipos.pegaEnum(calcolaTipo)).build();
			saida.add(calcola);
			contagemLinha++;contagemRoupasCriadas++;
		}

		if (nome.contains("saia")) {
			Roupa saia = new SaiasBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
					.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
					.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
					.cintura(Cintura.pegaEnum(cintura))
					.comprimentoDeSaia(ComprimentoDeSaia.pegaEnum(comprimentoSaia)).build();
			saida.add(saia);
			contagemLinha++;contagemRoupasCriadas++;
		}
	}
	
	

	
	public List<String> getRoupas() {
		return todasRoupas;
	}

	public List<String> getPartesDeCimaSemLapela() {
		return partesDeCimaSemLapela;
	}

	public List<String> getPartesDeCimaLapela() {
		return partesDeCimaLapela;
	}

	public List<String> getDeCorpoInteiro() {
		return deCorpoInteiro;
	}

	public List<String> getPartesDeBaixoComPernas() {
		return partesDeBaixoComPernas;
	}

	public List<String> getPartesDeBaixoSemPernas() {
		return partesDeBaixoSemPernas;
	}

	public List<String> getCores() {
		return cores;
	}

	public List<String> getBooleans() {
		return booleans;
	}

	public Integer getContagemLinha() {
		return contagemLinha;
	}

	
	public Integer getContagemErros() {
		return contagemErros;
	}

	public List<Object> getSaida() {
		return saida;
	}

	
	public Integer getContagemRoupasCriadas() {
		return contagemRoupasCriadas;
	}

	
}
