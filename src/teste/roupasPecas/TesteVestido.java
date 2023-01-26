package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.pBaixo.semPernas.Saias.SaiasBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Vestido.VestidoBuilder;

public class TesteVestido {
	@Test
	@DisplayName("vestido é instanciável")
	void vestidoDiferente_De_Null() {
		Roupa r = new VestidoBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("vestido popula corretamente")
	void vestidoPopuladoCorretamente() {
		Roupa r = new VestidoBuilder().nome("vestido")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null)	
				.comprimentoVestido(ComprimentoDeSaia.ASSIMETRICO)
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("vestido igual ele mesmo")
	void vestido1_Igual_vestido1() {
		Roupa r = new VestidoBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("vestido igual outro vestido mesmos valores")
	void vestido1_Igual_vestido2() {
		Roupa r = new VestidoBuilder().build();
		Roupa r1 = new VestidoBuilder().build();
		assertTrue(r.equals(r1));
	}

	
	@Test
	@DisplayName("vestidodiferente saia")
	void vestido_Igual_Saia() {
		Roupa r = new VestidoBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	
	@Test
	@DisplayName("vestidohashCode")
	void vestido_hash() {
		Roupa r = new VestidoBuilder().build();
		Roupa r1 = new VestidoBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode());
	}
	@Test
	@DisplayName("toString está correto")
	void vestido_ToString() {
		Roupa r = new VestidoBuilder().nome("vestido")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null)	
				.comprimentoVestido(ComprimentoDeSaia.ASSIMETRICO)
				.build();
		assertTrue(r.toString().contains("CRIADA"));
	}
}
