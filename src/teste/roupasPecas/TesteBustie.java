package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.pBaixo.semPernas.Saias.SaiasBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Bustie.BustieBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBustie;

public class TesteBustie {

	@Test
	@DisplayName("Top  é instanciável")
	void top_Diferente_De_Null() {
		Roupa r = new BustieBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("Top popula corretamente")
	void top_PopuladoCorretamente() {
		Roupa r = new BustieBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecido(null)
				.temBordado(null).temEstampa(null).manga(null).decote(null).cava(null).capuz(null).comprimentoBustie(ComprimentoBustie.ABAIXO_DO_TORAX).build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("Top igual ele mesmo")
	void top1_Igual_top1() {
		Roupa r = new BustieBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("Top igual outro top mesmos valores")
	void top1_Igual_top2() {
		Roupa r = new BustieBuilder().build();
		Roupa r1 = new BustieBuilder().build();
		assertTrue(r.equals(r1));
	}

	@Test
	@DisplayName("bustiediferente saia")
	void bustie_Igual_Saia() {
		Roupa r = new BustieBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	
	@Test
	@DisplayName("bustiehashCode")
	void bustie_hash() {
		Roupa r = new BustieBuilder().build();
		Roupa r1 = new BustieBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode());
	}
	
	
	@Test
	@DisplayName("toString está correto")
	void top_toString() {
		Roupa r = new BustieBuilder().nome("top").tamanho(null).genero(null).cor("null").modelagem(null).tecido(null)
				.temBordado(null).temEstampa(null).manga(null).decote(null).cava(null).capuz(null).comprimentoBustie(ComprimentoBustie.ABAIXO_DO_TORAX).build();
		
		assertTrue(r.toString().contains("CRIADA"));
	}
	
	
}
