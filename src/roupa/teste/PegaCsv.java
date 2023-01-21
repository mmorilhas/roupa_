package roupa.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import roupa.modelo.modelagem.Barra;
import roupa.modelo.parteDeBaixo.ComPernas.Calca;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;


public class PegaCsv {
	
	//PEÇAS
	protected static List<String> calcas = new ArrayList<>();
	
	static String msgErro(String entrada, Integer linha) {
		return "Não foi possível instanciar o objeto. Este campo não aceita este valor.   Entrada: \"" + entrada + "\" Linha: " + linha;
	}
	

	public static void main(String[] args) {
		//LISTA DE ROUPAS PARA VALIDAÇÃO
		String[] roupas1  = {"calça", "calca", "bermuda", "shorts", "saia", "calcinha", "tanga", "cueca", "sunga", "blusa", "camiseta", "camisa", "colete", "top", "sutiã", "sutia", "biquíni", "biquini", "espartilho", "corset", "corselet" , "robe", "trench coat", "sobretudo", "blazer", "jaqueta", "paletó","paleto", "sueter", "suéter", "poncho", "casaco", "cardigan", "moletom", "kimono" } ;
		List<String> roupas = new ArrayList<>();
		for(int i =  0; i < roupas1.length; i++) {
			roupas.add(roupas1[i]);
		}
		
		//LISTA DE CORES ACEITAS
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
		
		
		//LISTA DE TIPO DE FECHAMENTO
		List<String> fechamentos = new ArrayList<>();
		fechamentos.add("zíper lateral"); fechamentos.add("ziper lateral");
		fechamentos.add("zíper frente"); fechamentos.add("ziper frente");
		fechamentos.add("zíper costas"); fechamentos.add("ziper costas");
		fechamentos.add("botao frente"); fechamentos.add("botão frente");
		fechamentos.add("botão costas"); fechamentos.add("botao costas");
		fechamentos.add("botão lateral"); fechamentos.add("botao lateral");
		fechamentos.add("fita frente"); 
		fechamentos.add("fita costas"); 
		fechamentos.add("fita lateral"); 
		fechamentos.add("colchete frente"); 
		fechamentos.add("colchete costas"); 
		fechamentos.add("colchete lateral"); 
		fechamentos.add("não possui"); fechamentos.add("nao possui"); 
		
		//LISTA DE BARRAS ACEITAS
		List<String> barras = new ArrayList<>();
		barras.add("bainha");
		barras.add("invisível"); barras.add("invisivel");
		barras.add("lenço"); barras.add("lenco"); 
		barras.add("italiana"); 
		barras.add("simples"); 
		barras.add("galoneira"); 
		barras.add("original"); 
		barras.add("desfiada");
		barras.add("viés"); barras.add("vies"); 
		
		//LISTA DE SILHUETAS ACEITAS
		List<String> silhuetas = new ArrayList<>();
		silhuetas.add("ajustada");
		silhuetas.add("reta");
		silhuetas.add("baggy");
		
		
		
		//MENSAGENS DE ERRO
		Integer contagemLinha = 1;
		

		
		
		String path = "C:\\temp\\Roupa - Página1.csv";
		

		try (FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr)) {

			String line = br.readLine();
			line = br.readLine();
			
			while (line != null) {
				String[] vect = line.split(",");
				
				String name = vect[0].toLowerCase().trim();
				String tamanho = vect[1].trim();
				String genero = vect[2].toLowerCase().trim();
				String grupoEtario = vect[3].toLowerCase().trim();
				String cor = vect[4].toLowerCase().trim();
				String temBolso = vect[5].toLowerCase().trim();
				String tipoFechamento = vect[6].toLowerCase().trim();
				String barra = vect[7].toLowerCase().trim();
				String pala = vect[8].toLowerCase().trim();
				String pregas = vect[9].toLowerCase().trim();
				String pence = vect[10].toLowerCase().trim();
				String fenda = vect[11].toLowerCase().trim();
				String forro = vect[12].toLowerCase().trim();
				String cinto = vect[13].toLowerCase().trim();
				String passantes = vect[14].toLowerCase().trim();
				String recortes = vect[15].toLowerCase().trim();//ARRUMAT
				String silhueta = vect[16].toLowerCase().trim();
				String temEstampa = vect[17].toLowerCase().trim();
				String temBordado =vect[18].toLowerCase().trim();
				String construcaoTecido = vect[19].toLowerCase().trim();
				String nomeFibra1 = vect[20].toLowerCase().trim();
				String nomeFibra2 = vect[21].toLowerCase().trim();
				String nomeFibra3 = vect[22].toLowerCase().trim();
				String comprimentoBlusa = vect[23].toLowerCase().trim();
				String comprimentoPoncho = vect[24].toLowerCase().trim();
				String lapela = vect[25].toLowerCase().trim();
				String comprimentoCasaco = vect[26].toLowerCase().trim();
				String bodyTipo = vect[27].toLowerCase().trim();
				String calcolaTipo = vect[28].toLowerCase().trim();
				String comprimentoSaia = vect[29].toLowerCase().trim();
				String comprimentoMacaco = vect[30].toLowerCase().trim();
				String comprimentoCalca = vect[31].toLowerCase().trim();
				String punhoCalca = vect[32].toLowerCase().trim();
				String ganchoTipo = vect[33].toLowerCase().trim();
				String cintura = vect[34].toLowerCase().trim();

				

				
				for(int teste = 0; teste < 1; teste++) {
					//Verificando NOME
//					if(!name.matches("^[A-Za-zãéíóç]+")) {
//						System.out.println(msgErro(name, contagemLinha));
//						contagemLinha++;
//						break;
//					  } 
					 if(!roupas.contains(name)) {
						 System.out.println(msgErro(name, contagemLinha));
						 contagemLinha++;
						 break;
					  }
					 
					 //Verificando TAMANHO 
					 if(!tamanho.matches("^[0-9]+$") 
							 && Integer.parseInt(tamanho) > 0
							 && Integer.parseInt(tamanho) < 90)  {
						 System.out.println(msgErro(tamanho, contagemLinha));
						 contagemLinha++;
						 break;
					 }
					 
					 //Verificando GENERO
					 if(!genero.contains("feminino") 
							 ||genero.contains("masculino")
							 ||genero.contains("unissex")) {
						 System.out.println(msgErro(genero, contagemLinha));
						 contagemLinha++;
						 break;
					 }
					 
					 //Verificando GRUPO ETARIO
					if(!grupoEtario.contains("adulto")
							|| grupoEtario.contains("infantil")) {
						System.out.println(msgErro(genero, contagemLinha));
						 contagemLinha++;
						 break;
					}
					 
					
					//Verificando COR
					if(!cores.contains(cor)) {
						System.out.println(msgErro(cor, contagemLinha));
						 contagemLinha++;
						 break;
					}
					
					//Verificando TIPO FECHAMENTO
					//se não possui, construção = malha ou silhueta baggy
					
					
					//Verificando BARRA
					if(!barras.contains(barra)) {
						System.out.println(msgErro(barra, contagemLinha));
						 contagemLinha++;
						 break;
					}
					
					
					//Verificando SILHUETA
					if(!silhuetas.contains(silhueta)) {
						System.out.println(msgErro(silhueta, contagemLinha));
						 contagemLinha++;
						 break;
					}
					
					
					
					
					 System.out.println("passou em todos");
					 System.out.println("fora dos ifs");
					 
				}
				
				System.out.println(name);
				System.out.println("===========");
				
				
				 
				  /*if(!name.matches("^\\p{L}+$") || !name.matches("^\\p{L}+\\s$")) {
					  continue;
				  }
				  */
				 

				
				if(name.equalsIgnoreCase("calca") 
						|| name.equalsIgnoreCase("bermuda") 
						|| name.equalsIgnoreCase("shorts") ) {
					
				
					
					
				}
				
			
				
				
				
				line = br.readLine();
				
				// salvar.add(line);
				//for (String string : vect) {
				//	System.out.println(string);
				//}  
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}

		/*
		 * //METODO 2
		 * 
		 * 			tipofechamento = TipoFechamento.valueOf(vect[6].toUpperCase());
		 * 
		 * String path = "C:\\temp\\Roupa - Página1.csv";
		 * 
		 * FileReader fr = null; BufferedReader br = null;
		 * 
		 * //ArrayList<String> salvar = new ArrayList<>();
		 * 
		 * try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * 
		 * String line = br.readLine(); while(line != null) { //salvar.add(line);
		 * System.out.println(line); line = br.readLine(); } } catch (IOException e) {
		 * System.out.println("Erro: " +e.getMessage());
		 * 
		 * } finally { try { br.close(); fr.close(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * }
		 */

		/*
		 * File file = new File(null); Scanner sc = null;
		 * 
		 * try { sc = new Scanner(file); while(sc.hasNextLine()) { String line =
		 * sc.nextLine(); }
		 * 
		 * 
		 * } catch (IOException e) { System.out.println(e.getMessage());
		 * 
		 * } finally { if(sc != null) { sc.close(); }
		 * 
		 * }
		 */
		
		
	}


	public static List<String> getCalcas() {
		return calcas;
	}



}
