package roupa.teste;

import java.util.Collection;
import java.util.HashSet;

import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.Roupa;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.Excecoes.TipoErradoException;
import roupa.modelo.modelagem.Barra;
import roupa.modelo.modelagem.LocalFechamento;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.Pregas;
import roupa.modelo.modelagem.TipoFechamento;
import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.artificial.Liocel;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.natural.Linho;
import roupa.modelo.tecido.fibra.natural.Seda;
import roupa.modelo.modelagem.Modelagem.ModelagemBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Casacos;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Corselet;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Blusa.BlusaBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.Corselet.CorseletBuilder;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoCasaco;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Lapela;
import roupa.modelo.parteDeBaixo.ComPernas.Calca;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.Braguilha;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.GanchoTipos;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.PunhoCalca;

public class Principal {
	
	public static void main(String[] args) throws TipoErradoException {

	
		/*
		 * Algodao alg = new Algodao(); alg.setTodasPropriedadesDeUmaVez();
		 * 
		 * Seda sed = new Seda(); sed.setTodasPropriedadesDeUmaVez();
		 * 
		 * Liocel li = new Liocel(); li.setTodasPropriedadesDeUmaVez();
		 * 
		 * Linho linho = new Linho(); linho.setTodasPropriedadesDeUmaVez();
		 * 
		 * Linho linho2 = new Linho(); linho2.setTodasPropriedadesDeUmaVez();
		 * 
		 * Collection <Fibra> fibras = new HashSet<>(); fibras.add(alg);
		 * fibras.add(sed); fibras.add(li); fibras.add(linho); fibras.add(sed);
		 * //System.out.println(fibras.toString()); fibras.forEach(f ->
		 * System.out.println(f.toString()));
		 * 
		 * Tecido tafeta = new Tecido(fibras, Construcao.PLANO);
		 * tafeta.setTodasPropriedadesDeUmaVez();
		 * //System.out.println(tafeta.toString());
		 * 
		 * Collection<Tecido> tecidos = new HashSet<>(); tecidos.add(tafeta); //
		 * --------------------------------
		 */
		Modelagem m1 = new ModelagemBuilder()
				.babado(false)
				.barra(Barra.DESFIADA)
				.bolsos(true)
				.cinto(false)
				.fenda(false)
				.forro(true)
				.pala(false)
				.passantes(false)
				.pences(false)
				.pregas(Pregas.NAO_POSSUI)
				.silhueta("baggy")
				.tipoFechamento(TipoFechamento.BOTAO_LATERAL)
				.build();
				


		
		Roupa cor1 = new CorseletBuilder()
				.aviamentos(null)
				.capa(false)
				.capuz(false)
				.comprimentoCorselet(null)
				.cor(null)
				.genero(null)
				.grupoEtario(null)
				.manga(null)
				.modelagem(m1)
				.nome(null)
				.tamanho(0)
				.tecido(null)
				.build();
		
		
		Roupa b1 = new BlusaBuilder()
				.decote(Decote.CANOA)
				.cava(Cava.BAIXA)
				.build();

		
		//System.out.println(b1);
		//System.out.println(cor1);
		
		Roupa c1 = new Calca.CalcaBuilder()
				.modelagem(m1)
				.cintura(null)
				.gancho(GanchoTipos.JUSTO)
				.punhoCalca(PunhoCalca.COM_BOTAO)
				.build();

		//System.out.println(c1);
		
		//System.out.println(b1);
		//System.out.println(cor1);
		

		Acetato acetato = new Acetato();
		System.out.println(acetato);
		
		Algodao algodao = new Algodao();
		algodao.setTodasPropriedadesDeUmaVez();
		System.out.println(algodao);
		
		
		System.out.println(algodao.getTipoFibra().toString());
		Collection <Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(algodao);
		
		Tecido tecido = new Tecido(fibras, Construcao.MALHA);
		tecido.setTodasPropriedadesDeUmaVez();
		System.out.println(tecido);
		
		Collection <Fibra> fibrasQ = new HashSet<>();
		fibrasQ.add(acetato);
		
		Tecido tecidoQ = new Tecido(fibrasQ, Construcao.MALHA);
		tecidoQ.setTodasPropriedadesDeUmaVez();
		System.out.println(tecidoQ);
	}
	

}
