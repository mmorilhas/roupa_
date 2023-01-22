package roupa.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import roupa.modelo.Genero;
import roupa.modelo.Roupa;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.Silhueta;
import roupa.modelo.modelagem.Modelagem.ModelagemBuilder;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro.enumerators.BodyTipos;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Poncho.PonchoBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela.Body.BodyBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela.Casacos.CasacosBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela.Macacao.MacacaoBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela.Vestido.VestidoBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Blusa.BlusaBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Bustie.BustieBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoBlusa;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoBustie;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoCasaco;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoPoncho;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Lapela;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.parteDeBaixo.ComPernas.Calca.CalcaBuilder;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.ComprimentoDeCalca;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.GanchoTipos;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.PunhoCalca;
import roupa.modelo.parteDeBaixo.SemPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.parteDeBaixo.SemPernas.Saias.SaiasBuilder;
import roupa.modelo.parteDeBaixo.enumerators.CalcolaTipos;
import roupa.modelo.parteDeBaixo.enumerators.Cintura;
import roupa.modelo.parteDeBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.artificial.Liocel;
import roupa.modelo.tecido.fibra.artificial.Modal;
import roupa.modelo.tecido.fibra.artificial.Viscose;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.natural.Couro;
import roupa.modelo.tecido.fibra.natural.La;
import roupa.modelo.tecido.fibra.natural.Linho;
import roupa.modelo.tecido.fibra.natural.Seda;
import roupa.modelo.tecido.fibra.sintetica.Acrilico;
import roupa.modelo.tecido.fibra.sintetica.Elastano;
import roupa.modelo.tecido.fibra.sintetica.Poliamida;
import roupa.modelo.tecido.fibra.sintetica.Poliester;

public class Entrada4 {

	static List<Object> saida = new ArrayList<>();
	
	// MSG DE ERRO ENTRADA INCORRETA
	static String msgErro(String entrada, Integer linha) {
		return "\nNão foi possível instanciar o objeto. Este campo não aceita este valor.   \nCampo de Entrada: "
				+ entrada + "     Linha: " + linha;
	}

	// MSG DE ERRO ENTRADA BOOLEAN INCORRETA
	static String msgErro(Integer linha) {
		return "\nNão foi possível instanciar o objeto. Este campo é booleano e não aceita este valor.  \nVerifique os seguintes campos: bolso, pence, fenda, forro, babado, cinto, passantes, pala, estampa, bordado, capuz e capa."
				+ "\nLinha: " + linha;
	}

	// MSG ERRO ERRO FIBRAS
	static String msgErro(String entrada, String entrada2, String entrada3, Integer linha) {
		return "\nNão foi possível instanciar o objeto. Verifique os campos:   " + "\n" + entrada + ", " + entrada2
				+ " ,  " + entrada3 + "    Linha: " + linha;
	}

	static String msgErro(String entrada, String entrada2, String entrada3, String entrada4, Integer linha) {
		return "\nNão foi possível instanciar o objeto. Verifique os campos:   \n"  + entrada
				+ ", " + entrada2 + ",  " + entrada3 + ",  " + entrada4 + " Linha: " + linha;
	}

	// MSG ERRO ERRO INTERDEPENDENCIAS
	static String msgErro(String entrada, String entrada2, Integer linha) {
		return "\nNão foi possível instanciar o objeto. Estes campos não podem ter esses valores simultaneamente."
				+ "\nCampos de Entrada: " + entrada + ", " + entrada2 + "   Linha: " + linha;
	}

	static Boolean entradaToBoolean(String valor) {
		if (valor.equals("true") || valor.equals("sim")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// LISTA DE ROUPAS PARA VALIDAÇÃO
		String[] roupas1 = { "calça", "calca", "bermuda", "shorts", "saia", "body", "macacao", "macacão", "vestido",
				"calcinha", "tanga", "cueca", "sunga", "blusa", "camiseta", "camisa", "poncho", "colete", "top",
				"casaco" };
		List<String> roupas = new ArrayList<>();
		for (int i = 0; i < roupas1.length; i++) {
			roupas.add(roupas1[i]);
		}

		// PARTES DE CIMA SEM LAPELA
		List<String> partesDeCimaSemLapela = new ArrayList<>();
		partesDeCimaSemLapela.add("camiseta");//
		partesDeCimaSemLapela.add("blusa");//
		partesDeCimaSemLapela.add("camisa");//
		partesDeCimaSemLapela.add("top");
		partesDeCimaSemLapela.add("poncho");//

		// PARTES DE CIMA COM LAPELA
		List<String> partesDeCimaLapela = new ArrayList<>();
		partesDeCimaLapela.add("colete");
		partesDeCimaLapela.add("casaco");

		// PARTES DE CIMA CORPOINTEIRO
		List<String> deCorpoInteiro = new ArrayList<>();
		deCorpoInteiro.add("body");
		deCorpoInteiro.add("macacao");
		deCorpoInteiro.add("macacão");
		deCorpoInteiro.add("vestido");

		// PARTES DE BAIXO COM PERNAS
		List<String> partesDeBaixoComPernas = new ArrayList<>();
		partesDeBaixoComPernas.add("calca");
		partesDeBaixoComPernas.add("calça");
		partesDeBaixoComPernas.add("bermuda");
		partesDeBaixoComPernas.add("shorts");

		// PARTES DE BAIXO SEM PERNAS
		List<String> partesDeBaixoSemPernas = new ArrayList<>();
		partesDeBaixoSemPernas.add("tanga");
		partesDeBaixoSemPernas.add("calcinha");
		partesDeBaixoSemPernas.add("saia");
		partesDeBaixoSemPernas.add("cueca");

		// LISTA DE CORES ACEITAS
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("amarelo");
		cores.add("vermelho");
		cores.add("rosa");
		cores.add("laranja");
		cores.add("verde");
		cores.add("preto");
		cores.add("branco");
		cores.add("nude");
		cores.add("marrom");

		// LISTA VALORES ACEITOS TRUE OR FALSE
		List<String> booleans = new ArrayList<>();
		booleans.add("sim");
		booleans.add("true");
		booleans.add("nao");
		booleans.add("não");
		booleans.add("false");

		// CONTAGEM LINHA E ERRO
		Integer contagemLinha = 1;
		Integer contagemErros = 0;

		String path = "C:\\temp\\Roupa - Página1 (1).csv";

		try (FileInputStream fis = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr)) {

			String line = br.readLine();
			line = br.readLine();

			while (line != null) {
				String[] vect = line.split(",");

				String nome = vect[0].toLowerCase().trim();
				String tamanho = (String)vect[1].trim();
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

				
				//           -------------------  Verificando NOME    ------------------- 
					if (!roupas.contains(nome)) {
						saida.add(msgErro("nome", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					
//		    -------------------  Verificando TAMANHO  ------------------- 
					
					if (!tamanho.matches("^[0-9]+$") ) {
						Integer tamanhoInt = (Integer) Integer.parseInt(tamanho);
						if( tamanhoInt > 0 && tamanhoInt < 90) {
							saida.add(msgErro("tamanho", contagemLinha));

							contagemLinha++;
							contagemErros++;
							continue;
						}
					}
							
			

//		   -------------------  Verificando GENERO  ------------------- 
					if (!Genero.existeNoEnum(genero)) {
						saida.add(msgErro("genero", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			-------------------  Verificando COR  ------------------- 
					if (!cores.contains(cor)) {
						saida.add(msgErro("cor", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			 -------------------  Verificando Booleans  ------------------- 
					if (!booleans.contains(temBolso) || !booleans.contains(temPala) || !booleans.contains(temPence)
							|| !booleans.contains(temFenda) || !booleans.contains(temForro)
							|| !booleans.contains(temBabado) || !booleans.contains(temCinto)
							|| !booleans.contains(temPassantes) || !booleans.contains(temPala)
							|| !booleans.contains(temEstampa) || !booleans.contains(temBordado)
							|| !booleans.contains(temCapuz) || !booleans.contains(temCapa)) {
						saida.add(msgErro(contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			-------------------  VerificandoTIPO FECHAMENTO  ------------------- 
					if (!TipoFechamento.existeNoEnum(tipoFechamento)) {
						saida.add(msgErro("tipoFechamento", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			-------------------  Verificando BARRA  ------------------- 
					if (!Barra.existeNoEnum(barra)) {
						saida.add(msgErro("barra", contagemLinha));
						
						contagemLinha++;
						contagemErros++;
						continue;
					}

//		  -------------------  Verificando Pregas  ------------------- 
					if (!Pregas.existeNoEnum(pregas)) {
						saida.add(msgErro("pregas", contagemLinha));

						contagemLinha++;
						contagemErros++;
						continue;
					}

//		   -------------------  Verificando SILHUETA  ------------------- 
					if (!Silhueta.existeNoEnum(silhueta)) {
						saida.add(msgErro("silhueta", contagemLinha));

						contagemLinha++;
						contagemErros++;
						continue;
					}

//       -------------------  Verificando LAPELA ------------------- 
					if (!(Lapela.existeNoEnum(lapela) || lapela.contains("null"))) {
						saida.add(msgErro("lapela", contagemLinha));

						contagemLinha++;
						contagemErros++;
						continue;
					}
//	     -------------------  Verificando MANGA ------------------- 
					if (!(Manga.existeNoEnum(manga) || manga.contains("null"))) {
						saida.add(msgErro("manga", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//		  -------------------  Verificando DECOTE ------------------- 
					if (!(Decote.existeNoEnum(decote) || decote.contains("null"))) {
						saida.add(msgErro("decote", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//		   -------------------  Verificando CAVA ------------------- 
					if (!(Cava.existeNoEnum(cava) || cava.contains("null"))) {
						saida.add(msgErro("cava", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//		  ------------------  Verificando COMP BLUSA ------------------- 
					if (!(ComprimentoBlusa.existeNoEnum(comprimentoBlusa) || comprimentoBlusa.contains("null"))) {
						saida.add(msgErro("Comprimento Blusa", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			  -------------------  Verificando COMP TOP ------------------- 
					if (!(ComprimentoBustie.existeNoEnum(comprimentoTop) || comprimentoTop.contains("null"))) {
						saida.add(msgErro("Comprimento Bustie", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
						
					}
//			 -------------------  Verificando COMP PONCHO ------------------- 
					if (!(ComprimentoPoncho.existeNoEnum(comprimentoPoncho) || comprimentoPoncho.contains("null"))) {
						saida.add(msgErro("Comprimento Poncho", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			 -------------------  Verificando COMP CASACO ------------------- 
					if (!(ComprimentoCasaco.existeNoEnum(comprimentoCasaco) || comprimentoCasaco.contains("null"))) {
						saida.add(msgErro("Comprimento Casaco", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			 -------------------  Verificando BODY TIPO ------------------- 
					if (!(BodyTipos.existeNoEnum(bodyTipo) || bodyTipo.contains("null"))) {
						saida.add(msgErro("Body Tipo", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			 -------------------  Verificando CALCOLA TIPO ------------------- 
					if (!(CalcolaTipos.existeNoEnum(calcolaTipo) || calcolaTipo.contains("null"))) {
						saida.add(msgErro("Calçola Tipo", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			-------------------  Verificando COMP SAIA ------------------- 
					if (!(ComprimentoDeSaia.existeNoEnum(comprimentoSaia) || comprimentoSaia.contains("null"))) {
						saida.add(msgErro("comprimento Saia", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			 -------------------  Verificando COMP CALCA------------------- 
					if (!(ComprimentoDeCalca.existeNoEnum(comprimentoCalca) || comprimentoCalca.contains("null"))) {
						saida.add(msgErro("comprimento Calça", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//			-------------------  Verificando PUNHO CALCA TIPO ------------------- 
					if (!(PunhoCalca.existeNoEnum(punhoCalca) || punhoCalca.contains("null"))) {
						saida.add(msgErro("punho Calça", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			 -------------------  Verificando GANCHO  ------------------- 
					if (!(GanchoTipos.existeNoEnum(ganchoTipo) || ganchoTipo.contains("null"))) {
						saida.add(msgErro("gancho", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
//			-------------------  Verificando CINTURA  ------------------- 
					if (!(Cintura.existeNoEnum(cintura) || cintura.contains("null"))) {
						saida.add(msgErro("cintura", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

//		    -------------------  Verificando CONSTRUÇÃO   ------------------- 
					if (!Construcao.existeNoEnum(construcaoTecido)) {
						saida.add(msgErro("construcaoTecido", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					// Se não for malha, Fechamento precisa ser diferente de "não possui"
					if (construcaoTecido != "malha"
							&& (tipoFechamento.equals("não_possui") || tipoFechamento.equals("nao_possui"))) {
						saida.add(msgErro("construcaoTecido", "tipoFechamento", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;

					}

//		   -------------------  Verificando FIBRAS   ------------------- 
					if (!(NomeFibra.existeNoEnum(nomeFibra1) && NomeFibra.existeNoEnum(nomeFibra2)
							&& NomeFibra.existeNoEnum(nomeFibra3) || nomeFibra3.equals("sem"))) {
						saida.add(msgErro("nomeFibra1", "nomeFibra2", "nomeFibra3", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;

					}

					Collection<Fibra> fibras = new HashSet<>();
					

					if (NomeFibra.pegaEnum(nomeFibra1) == NomeFibra.ALGODAO
							|| (!nomeFibra2.contains("sem") && NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ALGODAO))
							|| (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ALGODAO))) {
						Fibra f1 = new Algodao();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LINHO)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LINHO) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LINHO))) {
						Fibra f1 = new Linho();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LA)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LA)
							|| (!nomeFibra3.contains("sem") && NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LA))) {
						Fibra f1 = new La();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.SEDA)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.SEDA)
							|| (!nomeFibra3.contains("sem") && NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.SEDA))) {
						Fibra f1 = new Seda();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.COURO)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.COURO) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.COURO))) {
						Fibra f1 = new Couro();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.VISCOSE)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.VISCOSE) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.VISCOSE))) {
						Fibra f1 = new Viscose();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.MODAL)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.MODAL) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.MODAL))) {
						Fibra f1 = new Modal();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LIOCEL)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LIOCEL) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LIOCEL))) {
						Fibra f1 = new Liocel();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ACETATO)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ACETATO) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ACETATO))) {
						Fibra f1 = new Acetato();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ACRILICO)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ACRILICO) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ACRILICO))) {
						Fibra f1 = new Acrilico();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.POLIAMIDA)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.POLIAMIDA)
							|| (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.POLIAMIDA))) {
						Fibra f1 = new Poliamida();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.POLIESTER)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.POLIESTER)
							|| (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.POLIESTER))) {
						Fibra f1 = new Poliester();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}
					if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ELASTANO)
							|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ELASTANO) || (!nomeFibra3.contains("sem")
									&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ELASTANO))) {
						Fibra f1 = new Elastano();
						f1.setTodasAsPropriedades();
						fibras.add(f1);
					}

//        ---------------------- MONTANDO TECIDO E MODELAGEM ---------------					
					Modelagem modelagem = new ModelagemBuilder().bolsos(entradaToBoolean(temBolso))
							.tipoFechamento(TipoFechamento.pegaEnum(tipoFechamento)).barra(Barra.pegaEnum(barra))
							.pala(entradaToBoolean(temPala)).pregas(Pregas.pegaEnum(pregas))
							.pences(entradaToBoolean(temPence)).fenda(entradaToBoolean(temFenda))
							.forro(entradaToBoolean(temForro)).babado(entradaToBoolean(temBabado))
							.cinto(entradaToBoolean(temCinto)).passantes(entradaToBoolean(temPassantes))
							.silhueta(Silhueta.pegaEnum(silhueta)).build();

					Tecido tecido = new Tecido(fibras, Construcao.pegaEnum(construcaoTecido));
					tecido.setTodasAsPropriedades();



//	 -------------------  Verificando Tipo De Roupa  -------------------  
					if (!TipoDeRoupa.existeNoEnum(tipoRoupa)) {
						saida.add(msgErro("tipoRoupa", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					// Tipo De Roupa e interdependencias
					if (!(partesDeCimaSemLapela.contains(nome) && tipoRoupa.contains("cima"))
							&& !(partesDeBaixoComPernas.contains(nome) && tipoRoupa.contains("baixo"))
							&& !(partesDeBaixoSemPernas.contains(nome) && tipoRoupa.contains("baixo"))
							&& !(partesDeCimaLapela.contains(nome) && tipoRoupa.contains("cima"))
							&& !(deCorpoInteiro.contains(nome) && tipoRoupa.contains("inteiro"))) {
						saida.add(msgErro("name", "tipoRoupa", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
					
					
// =======================================================================
					
					
//				     -------------------  Verificando Partes De Cima  ------------------- 

					// parte de cima precisa ter manga e decote definido
					if ((partesDeCimaSemLapela.contains(nome) || partesDeCimaLapela.contains(nome)
							|| deCorpoInteiro.contains(nome))
							&& !(Manga.existeNoEnum(manga) && Decote.existeNoEnum(decote) && Cava.existeNoEnum(cava))) {
						saida.add(msgErro("nome", "manga", "decote", "cava", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					// se lapela em peça que não tem
					if (!lapela.equals("null") && partesDeCimaSemLapela.contains(nome)) {
						saida.add(msgErro("lapela", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					// se tomara que caia -> sem cava e sem ser casaco
					if ((decote.equals("tomara_que_caia") && !cava.contains("sem"))
							|| decote.equals("tomara_que_caia") && partesDeCimaLapela.contains(nome)) {
						saida.add(msgErro("decote", "manga", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;

					}

					// se tem parte de baixo em peça de cima

					if (partesDeCimaSemLapela.contains(nome) || partesDeCimaLapela.contains(nome)) {
						if (!(comprimentoCalca.equals("null") && bodyTipo.equals("null") && calcolaTipo.equals("null")
								&& comprimentoSaia.equals("null") && punhoCalca.equals("null") && cintura.equals("null")
								&& ganchoTipo.equals("null"))) {
							saida.add(
									msgErro("nome", "campos de parte baixo também estão preenchidos", contagemLinha));
							contagemLinha++;
							contagemErros++;
							continue;
						}
					}

					// se sem manga em peças que precisam ter
					if ((partesDeCimaLapela.contains(nome) || nome.contains("camisa") || nome.contains("blusa")
							|| nome.contains("camiseta")) && manga.contains("sem")) {
						saida.add(msgErro("nome", "manga", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					// se colarinho ou lapela -> sem capuz
					if ((decote.contains("colarinho") || !lapela.contains("sem"))
							&& entradaToBoolean(temCapuz).equals(true)) {
						saida.add(msgErro("colarinho", "lapela", "capuz", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					//==================== Se TOP
					if (nome.contains("top")
							&& !(ComprimentoBustie.existeNoEnum(comprimentoTop) && comprimentoBlusa.equals("null")
									&& comprimentoPoncho.equals("null") && comprimentoCasaco.equals("null"))) {
						saida.add(
								msgErro("nome, comprimento Bustie", "comprimento de outras peças", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
					if (nome.contains("top")) {
						Roupa top = new BustieBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoBustie(ComprimentoBustie.pegaEnum(comprimentoTop)).build();

						saida.add(top);
						contagemLinha++;
						continue;
					}

					//==================== Se BLUSA / CAMISETA

					if ((nome.contains("blusa") || nome.contains("camiseta"))
							&& !(ComprimentoBlusa.existeNoEnum(comprimentoBlusa) && comprimentoPoncho.equals("null")
									&& comprimentoCasaco.equals("null") && comprimentoTop.equals("null"))) {
						saida.add(
								msgErro("nome, comprimento Blusa", "comprimento de outras peças", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
					if (nome.contains("blusa")) {
						Roupa blusa = new BlusaBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoBlusa(ComprimentoBlusa.pegaEnum(comprimentoBlusa)).build();
						saida.add(blusa);
						contagemLinha++;
						continue;

					}

					//==================== Se CAMISA
					if (nome.contains("camisa") && ComprimentoBlusa.existeNoEnum(comprimentoBlusa)
							&& !decote.contains("colarinho") && comprimentoPoncho.equals("null")
							&& comprimentoCasaco.equals("null") && comprimentoTop.equals("null")) {
						saida.add(msgErro("nome, comprimento Blusa", "decote", "comprimento de outras peças",
								contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("camisa")) {
						Roupa camisa = new BlusaBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoBlusa(ComprimentoBlusa.pegaEnum(comprimentoBlusa)).build();

						saida.add(camisa);
						contagemLinha++;
						continue;
					}

					//==================== Se PONCHO
					if (nome.contains("poncho") && !(manga.contains("sem") && entradaToBoolean(temCapa).equals(false)
							&& cava.equals("sem") && ComprimentoPoncho.existeNoEnum(comprimentoPoncho))) {
						saida.add(msgErro("nome", "comprimento poncho", "capa", "manga, cava", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}
					if (nome.contains("poncho")) {
						Roupa poncho = new PonchoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.decote(Decote.pegaEnum(decote)).capuz(entradaToBoolean(temCapuz))
								.capa(entradaToBoolean(temCapa))
								.comprimentoPoncho(ComprimentoPoncho.pegaEnum(comprimentoPoncho)).build();
						saida.add(poncho);
						contagemLinha++;
						continue;
					}

					//==================== Se CASACO
					if ((nome.contains("casaco") || nome.contains("colete")) && (!Lapela.existeNoEnum(lapela)
							|| !ComprimentoCasaco.existeNoEnum(comprimentoCasaco) || !comprimentoPoncho.equals("null")
							|| !comprimentoTop.equals("null") || !comprimentoBlusa.equals("null"))) {
						saida.add(msgErro("nome", "lapela, comprimento casaco", "comprimento de outras peças",
								contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;

					}

					if ((nome.contains("casaco") || nome.contains("colete"))
							&& ComprimentoCasaco.existeNoEnum(comprimentoCasaco) && Lapela.existeNoEnum(lapela)
							&& (!comprimentoPoncho.equals("null") && !comprimentoTop.equals("null")
									&& !comprimentoBlusa.equals("null"))) {
						saida.add(
								msgErro("nome", "comprimento casaco", "comprimento de outras peças", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("casaco") || nome.contains("colete")) {

						Roupa casaco = new CasacosBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecido(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
								.lapela(Lapela.pegaEnum(lapela)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoCasaco(ComprimentoCasaco.pegaEnum(comprimentoCasaco)).build();

						saida.add(casaco);
						contagemLinha++;
						continue;
					}
					
//				     -------------------  Verificando Partes CorpoInteiro ------------------- 

					//==================== Se BODY
					if (nome.contains("body") && (!BodyTipos.existeNoEnum(bodyTipo)
							|| !CalcolaTipos.existeNoEnum(calcolaTipo) || !silhueta.contains("justa")
							|| !comprimentoCalca.equals("null") || !comprimentoSaia.equals("null")
							|| !punhoCalca.equals("null") || !cintura.equals("null") && !ganchoTipo.equals("null"))) {
						saida.add(msgErro("nome", "body tipo, calçola tipo ",
								"comprimento de outras peças, partes de outras peças", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("body")) {
						Roupa body = new BodyBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
								.lapela(Lapela.pegaEnum(lapela)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.bodyTipo(BodyTipos.pegaEnum(bodyTipo))
								.bodyCalcolaTipo(CalcolaTipos.pegaEnum(calcolaTipo)).build();

						saida.add(body);
						contagemLinha++;
						continue;
					}

					//==================== Se VESTIDO
					if (nome.contains("vestido") && (comprimentoSaia.equals("null") || !bodyTipo.equals("null")
							|| !calcolaTipo.equals("null") || !comprimentoCalca.equals("null")
							|| !punhoCalca.equals("null") || !cintura.equals("null") || !ganchoTipo.equals("null"))) {
						saida.add(msgErro("nome", "comprimento saia",
								"comprimento de outras peças, partes de outras peças", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("vestido")) {
						Roupa vestido = new VestidoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
								.lapela(Lapela.pegaEnum(lapela)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoVestido(ComprimentoDeSaia.pegaEnum(comprimentoSaia)).build();

						saida.add(vestido);
						contagemLinha++;
						continue;
					}

					//==================== Se MACACAO
					if (nome.contains("maca") && (comprimentoCalca.equals("null") || punhoCalca.equals("null")
							|| ganchoTipo.equals("null") || !bodyTipo.equals("null") || !calcolaTipo.equals("null")
							|| !cintura.equals("null"))) {
						saida.add(msgErro("nome", "comprimento calça",
								"comprimento de outras peças, partes de outras peças", contagemLinha));

						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("maca")) {
						Roupa macacao = new MacacaoBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.manga(Manga.pegaEnum(manga)).decote(Decote.pegaEnum(decote))
								.lapela(Lapela.pegaEnum(lapela)).cava(Cava.pegaEnum(cava))
								.capuz(entradaToBoolean(temCapuz)).capa(entradaToBoolean(temCapa))
								.comprimentoMacacao(ComprimentoDeCalca.pegaEnum(comprimentoCalca))
								.punhoCalca(PunhoCalca.pegaEnum(punhoCalca))
								.ganchoTipo(GanchoTipos.pegaEnum(ganchoTipo)).build();
						saida.add(macacao);
						contagemLinha++;
						continue;
					}

//			        -------------------  Verificando Partes De Baixo ------------------- 
					if (partesDeBaixoComPernas.contains(nome) || partesDeBaixoSemPernas.contains(nome)) {
						if (!(decote.equals("null") && manga.equals("null") && cava.equals("null")
								&& lapela.equals("null") && comprimentoBlusa.equals("null")
								&& comprimentoTop.equals("null") && comprimentoPoncho.equals("null")
								&& comprimentoCasaco.equals("null") && bodyTipo.equals("null")
								&& entradaToBoolean(temCapa).equals(false)
								&& entradaToBoolean(temCapuz).equals(false))) {
							saida.add(msgErro("nome", "comprimento e/ou partes de outras peças", contagemLinha));
							contagemLinha++;
							contagemErros++;
							continue;
						}

					}
					
					//==================== Se CALÇA

					if (nome.contains("calça") || nome.contains("calca") || nome.contains("bermuda")
							|| nome.contains("shorts")) {
						if (ganchoTipo.equals("null") || cintura.equals("null") || punhoCalca.equals("null")
								|| comprimentoCalca.equals("null") || !calcolaTipo.equals("null")
								|| !comprimentoSaia.equals("null")) {
							saida.add(msgErro("nome", "comprimento calça, cintura, gancho, punho",
									"comprimento e/ou partes de outras peças", contagemLinha));
							contagemLinha++;
							contagemErros++;
							continue;
						}
					}

					if (((nome.contains("calça") || nome.contains("calca"))
							&& ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 3)
							|| (nome.contains("bermuda") && ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 2)
							|| (nome.contains("shorts") && ComprimentoDeCalca.pegaNumero(comprimentoCalca) != 1)) {
						saida.add(msgErro("nome", "comprimento calça", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
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
						contagemLinha++;
						continue;
					}

					//==================== Se CALÇOLA
					if (nome.contains("calcinha") || nome.contains("tanga") || nome.contains("cueca")) {
						if (calcolaTipo.equals("null") || silhueta.contains("baggy") || !ganchoTipo.equals("null")
								|| !punhoCalca.equals("null") || !comprimentoCalca.equals("null")
								|| !comprimentoSaia.equals("null") || cintura.equals("null")) {
							saida.add(msgErro("nome", "calçola tipo", "silhueta, cintura",
									"comprimento e/ou partes de outras peças", contagemLinha));

							contagemLinha++;
							contagemErros++;
							continue;
						}
					}

					if ((nome.contains("calcinha") && genero.contains("masculino"))
							|| (nome.contains("cueca") && genero.contains("feminino"))) {
						saida.add(msgErro("nome", "genero", contagemLinha));
						contagemLinha++;
						contagemErros++;
						continue;
					}

					if (nome.contains("calcinha") || nome.contains("cueca") || nome.contains("tanga")) {
						Roupa calcola = new CalcolasBuilder()

								.nome(nome).tamanho(Integer.parseInt(tamanho)).genero(Genero.pegaEnum(genero)).cor(cor)
								.modelagem(modelagem).tecidos(tecido).temEstampa(entradaToBoolean(temEstampa))
								.temBordado(entradaToBoolean(temBordado)).cintura(Cintura.pegaEnum(cintura))
								.calcolaTipo(CalcolaTipos.pegaEnum(calcolaTipo)).build();

						saida.add(calcola);
						contagemLinha++;
						continue;
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
							continue;
						}
					}

					if (nome.contains("saia")) {
						Roupa saia = new SaiasBuilder().nome(nome).tamanho(Integer.parseInt(tamanho))
								.genero(Genero.pegaEnum(genero)).cor(cor).modelagem(modelagem).tecidos(tecido)
								.temEstampa(entradaToBoolean(temEstampa)).temBordado(entradaToBoolean(temBordado))
								.cintura(Cintura.pegaEnum(cintura))
								.comprimentoDeSaia(ComprimentoDeSaia.pegaEnum(comprimentoSaia)).build();

						saida.add(saia);
						contagemLinha++;
						continue;
					}

				


				line = br.readLine();
				continue;
			
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}
		
		System.out.println(saida);

	}

}
