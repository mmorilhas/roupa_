package roupa.EntradaESaida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EntradaESaida {


	public static void main(String[] args) {
		TrataDados td = new TrataDados();
			
		//---------------------------------

		File file = new File("Roupa.csv");
	
		
		//String path = "C:\\temp\\Roupa - Roupa.csv";
		//String path = "C:\\temp\\Roupa.csv";
						//"C:\\Users\\Magna\\Downloads\\Planilha sem t�tulo - P�gina1.csv";

		try (FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader br = new BufferedReader(isr)) {
			
			String line = br.readLine();
			//line = br.readLine();

			while (line != null) {
				String[] vect = line.split(",");

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
				String ganchoTipo = vect[35].toLowerCase().trim().replace(" ", "_");
				String punhoCalca = vect[36].toLowerCase().trim().replace(" ", "_");
				String cintura = vect[37].toLowerCase().trim().replace(" ", "_");
				
				
				td.populaListas();
				
				td.confereSeDadosSaoNoFormatoCorretoEChamaCriaRoupa(nome, tamanho, genero, cor, tipoRoupa, temBolso, temPala, temPence, temForro, temBabado, temFenda, temCinto, temPassantes, temEstampa, temCapuz,temBordado, tipoFechamento, barra, pregas, silhueta, construcaoTecido, nomeFibra1, nomeFibra2, nomeFibra3, manga, decote, cava, comprimentoBlusa, comprimentoTop, comprimentoPoncho, comprimentoCasaco, bodyTipo, calcolaTipo, comprimentoSaia, comprimentoCalca, punhoCalca, ganchoTipo, cintura);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());

		}
		
		Saida saida = new Saida();
		saida.criaCSVSaida("ListaRoupasCriadas__1", td.getSaida(), td.getContagemLinha(), td.getContagemRoupasCriadas());
	

	}

}
