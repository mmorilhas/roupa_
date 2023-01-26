package teste.roupasPecas;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.enumerators.Genero;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.Modelagem.ModelagemBuilder;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.pBaixo.semPernas.Saias.SaiasBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Blusa.BlusaBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBlusa;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.sintetica.Poliamida;

public class TesteBlusa {

	@Test
	@DisplayName("Se uma blusa é igual a outra exatamente Igual")
	void blusa1_Igual_blusa2ComMesmosValores() {
		Fibra a1 = new Algodao();
		Fibra a2 = new Poliamida();
		a1.setTodasAsPropriedades();
		a2.setTodasAsPropriedades();

		Collection<Fibra> fs = new HashSet<Fibra>();
		fs.add(a1);
		fs.add(a2);

		Tecido t = new Tecido(fs, Construcao.MALHA);
		t.setTodasAsPropriedades();

		Modelagem m = new ModelagemBuilder()
				.bolsos(false)
				.tipoFechamento(TipoFechamento.BOTAO_COSTAS)
				.barra(Barra.LENCO)
				.pregas(Pregas.PLISSADO)
				.pences(true)
				.fenda(false)
				.forro(false)
				.babado(true)
				.cinto(false)
				.passantes(false)
				.silhueta(Silhueta.RETA)
				.build();

		Roupa r = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(m).tecido(t).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		
		
		Fibra a11 = new Algodao();
		Fibra a22 = new Poliamida();
		a11.setTodasAsPropriedades();
		a22.setTodasAsPropriedades();
		Collection<Fibra> fs1 = new HashSet<Fibra>();
		fs.add(a11);
		fs.add(a22);

		Tecido t1 = new Tecido(fs1, Construcao.MALHA);
		t.setTodasAsPropriedades();

		Modelagem m1 = new ModelagemBuilder()
				.bolsos(false)
				.tipoFechamento(TipoFechamento.BOTAO_COSTAS)
				.barra(Barra.LENCO)
				.pregas(Pregas.PLISSADO)
				.pences(true)
				.fenda(false)
				.forro(false)
				.babado(true)
				.cinto(false)
				.passantes(false)
				.silhueta(Silhueta.RETA)
				.build();

		Roupa r1 = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(m).tecido(t).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		
		assertEquals(r, r1);
		
	}
	
	
	@Test
	@DisplayName("Se uma blusa é igual a outra  diferente")
	void blusa1_Diferente_blusa2ComDiferentesValores() {
		Fibra a1 = new Algodao();
		a1.setTodasAsPropriedades();

		Collection<Fibra> fs = new HashSet<Fibra>();
		fs.add(a1);

		Tecido t = new Tecido(fs, Construcao.MALHA);
		t.setTodasAsPropriedades();

		Modelagem m = new ModelagemBuilder()
				.bolsos(false)
				.tipoFechamento(TipoFechamento.BOTAO_COSTAS)
				.barra(Barra.LENCO)
				.pregas(Pregas.PLISSADO)
				.pences(true)
				.fenda(false)
				.pala(false)
				.forro(false)
				.babado(true)
				.cinto(false)
				.passantes(false)
				.silhueta(Silhueta.RETA)
				.build();

		Roupa r = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(m).tecido(t).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		
		
		Fibra a11 = new Algodao();
		Fibra a22 = new Poliamida();
		a11.setTodasAsPropriedades();
		a22.setTodasAsPropriedades();
		Collection<Fibra> fs1 = new HashSet<Fibra>();
		fs.add(a11);
		fs.add(a22);

		Tecido t1 = new Tecido(fs1, Construcao.MALHA);
		t.setTodasAsPropriedades();

		Modelagem m1 = new ModelagemBuilder()
				.bolsos(false)
				.tipoFechamento(TipoFechamento.BOTAO_COSTAS)
				.barra(Barra.LENCO)
				.pregas(Pregas.PLISSADO)
				.pala(false)
				.pences(true)
				.fenda(false)
				.forro(false)
				.babado(true)
				.cinto(false)
				.passantes(false)
				.silhueta(Silhueta.RETA)
				.build();

		Roupa r1 = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(m).tecido(t).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		
		assertNotSame(r, r1);
		
	}
	
	
	
	@Test
	@DisplayName("Se toString funciona como esperado")
	void blusa_To_String_SeFuncionaCorretamente() {
			Roupa r = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(null).tecido(null).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		
		String toString = r.toString();
		
		String resultado = "costurando.......";
				
		
		assertTrue(r.toString().contains(resultado));
				
	}
	
	
	@Test
	@DisplayName("Testando o Equals()")
	void blusa1_EqualsTrue_blusa2() {
		Roupa r = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(null).tecido(null).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();

		Roupa r1 = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(null).tecido(null).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
				
		
		assertTrue(r.equals(r1));
		
		
	}
	
	@Test
	@DisplayName("Testando o Equals()")
	void blusa2_EqualsTrue_blusa1() {
		Roupa r = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(null).tecido(null).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
		

		Roupa r1 = new BlusaBuilder().nome("blusa").tamanho(36).genero(Genero.FEMININO).cor("rosa").modelagem(null).tecido(null).temEstampa(true).temBordado(true).manga(Manga.CURTA_FRANZIDA).decote(Decote.QUADRADO).cava(Cava.BAIXA).capuz(false).comprimentoBlusa(ComprimentoBlusa.CINTURA).build();
				
		
		assertTrue(r1.equals(r));
		
		
	}
	
	@Test
	@DisplayName("blusa diferente saia")
	void blusa_Igual_Saia() {
		Roupa r = new BlusaBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	

	
	
	
	

}
