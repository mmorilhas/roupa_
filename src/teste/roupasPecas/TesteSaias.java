package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.semPernas.Saias.SaiasBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.Blusa.BlusaBuilder;

public class TesteSaias {
	@Test
	@DisplayName("Saia é instanciável")
	void saiaDiferente_De_Null() {
		Roupa r = new SaiasBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("saia popula corretamente")
	void saiaPopuladoCorretamente() {
		Roupa r = new SaiasBuilder().nome("saias")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null)
				.comprimentoDeSaia(null)
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("saia igual ele mesmo")
	void saia1_Igual_saia1() {
		Roupa r = new SaiasBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("saia igual outro saia mesmos valores")
	void saia1_Igual_saia2() {
		Roupa r = new SaiasBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertTrue(r.equals(r1));
	}
	@Test
	@DisplayName("saia igual blusa ")
	void saia1_Igual_blusa() {
		Roupa r = new SaiasBuilder().build();
		Roupa r1 = new BlusaBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	@Test
	@DisplayName("saia hashCode")
	void saia1_Igual_hash() {
		Roupa r = new SaiasBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode() );
	}

	@Test
	@DisplayName("toString está correto")
	void saia_ToString() {
		Roupa r = new SaiasBuilder().nome("saias")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null)
				.comprimentoDeSaia(null)
				.build();
		assertTrue(r.toString().contains("CRIADA"));
	}
}
