package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Casacos.CasacosBuilder;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoCasaco;

public class TesteCasacos {

	@Test
	@DisplayName("casaco é instanciável")
	void casacoDiferente_De_Null() {
		Roupa r = new CasacosBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("casacopopula corretamente")
	void casacoPopuladoCorretamente() {
		Roupa r = new CasacosBuilder().nome("casaco")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecido(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null)	
				.comprimentoCasaco(ComprimentoCasaco.ABAIXO_DO_JOELHO)
				
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("casacoigual ele mesmo")
	void casaco1_Igual_casaco1() {
		Roupa r = new CasacosBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("casacoigual outro casacomesmos valores")
	void casaco1_Igual_casaco2() {
		Roupa r = new CasacosBuilder().build();
		Roupa r1 = new CasacosBuilder().build();
		assertTrue(r.equals(r1));
	}

	@Test
	@DisplayName("toString está correto")
	void casaco_ToString() {
		Roupa r = new CasacosBuilder().nome("casaco")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecido(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null)	
				.comprimentoCasaco(ComprimentoCasaco.ABAIXO_DO_JOELHO)
				
				.build();
		assertTrue(r.toString().contains("CRIADA"));
	}
}
