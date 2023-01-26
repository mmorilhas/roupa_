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
import roupa.modelo.pCimaECorpoInteiro.pCima.Poncho.PonchoBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoPoncho;

public class TestePoncho {
	
	@Test
	@DisplayName("poncho  é instanciável")
	void poncho_Diferente_De_Null() {
		Roupa r = new PonchoBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("poncho popula corretamente")
	void poncho_PopuladoCorretamente() {
		Roupa r = new PonchoBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecido(null).temBordado(null).temEstampa(null).decote(null).capuz(null).comprimentoPoncho(ComprimentoPoncho.MEIO_DA_COXA).build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("poncho igual ele mesmo")
	void poncho1_Igual_poncho1() {
		Roupa r = new PonchoBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("poncho igual outro poncho mesmos valores")
	void poncho1_Igual_poncho2() {
		Roupa r = new PonchoBuilder().build();
		Roupa r1 = new PonchoBuilder().build();
		assertTrue(r.equals(r1));
	}

	
	@Test
	@DisplayName("poncho diferente saia")
	void poncho1_Igual_Saia() {
		Roupa r = new PonchoBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	
	@Test
	@DisplayName("poncho hashCode")
	void poncho1_hash() {
		Roupa r = new PonchoBuilder().build();
		Roupa r1 = new PonchoBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode());
	}
	@Test
	@DisplayName("toString está correto")
	void poncho_toString() {
		Roupa r = new PonchoBuilder().nome("poncho").tamanho(null).genero(null).cor("azul").modelagem(null).tecido(null).temBordado(null).temEstampa(null).decote(null).capuz(null).comprimentoPoncho(ComprimentoPoncho.MEIO_DA_COXA).build();
		
		assertTrue(r.toString().contains("CRIADA"));
	}
	

}
