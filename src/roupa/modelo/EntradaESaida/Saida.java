package roupa.modelo.EntradaESaida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Saida {
	
	public void criaCSVSaida(String nomeArquivoSemExtensao, List<Object> saida, Integer contagemLinha, Integer contagemRoupasCriadas) {
		
		if(!saida.isEmpty()) {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(nomeArquivoSemExtensao+".csv")))) {
			bw.write("Total de linhas lidas(exceto cabeçalho): " + (contagemLinha - 2));
			bw.newLine();
			bw.newLine();
			bw.write(saida.toString());
			bw.newLine();
			bw.newLine();
			bw.write("Total roupas criadas: " + contagemRoupasCriadas);
			bw.close();
	
			
			} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			}
		
		}
	}
	
	
	
}

