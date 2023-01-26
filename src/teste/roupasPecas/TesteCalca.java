package teste.roupasPecas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.comPernas.Calca.CalcaBuilder;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pCimaECorpoInteiro.pCima.Blusa.BlusaBuilder;

public class TesteCalca {
	@Test
	@DisplayName("calca  é instanciável")
	void calca_Diferente_De_Null() {
		Roupa r = new CalcaBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("calca popula corretamente")
	void calca_PopuladoCorretamente() {
		Roupa r = new CalcaBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("calca igual ele mesmo")
	void calca1_Igual_calca1() {
		Roupa r = new CalcaBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("calca igual outro calca mesmos valores")
	void calca1_Igual_calca2() {
		Roupa r = new CalcaBuilder().build();
		Roupa r1 = new CalcaBuilder().build();
		assertTrue(r.equals(r1));
	}

	@Test
	@DisplayName("toString está correto")
	void calca_toString() {
		Roupa r = new CalcaBuilder().nome("calca").tamanho(null).genero(null).cor("azul").modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
		
		assertTrue(r.toString().contains("CRIADA"));
	}
	
	@Test
	@DisplayName("calca igual outro calca mesmos valores")
	void calca1_Igual_calca2_HAshCode() {
		Roupa r = new CalcaBuilder().build();
		Roupa r1 = new CalcaBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode());
	}
	
	@Test
	@DisplayName("calca igual blusa")
	void calca1_Igual_blusa() {
		Roupa r = new CalcaBuilder().build();
		Roupa r1 = new BlusaBuilder().build();
		assertFalse(r.equals(r1));
	}
	
}
