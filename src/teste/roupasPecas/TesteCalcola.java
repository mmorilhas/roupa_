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

public class TesteCalcola {

	@Test
	@DisplayName("calcola é instanciável")
	void calcolaDiferente_De_Null() {
		Roupa r = new CalcolasBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("calcola popula corretamente")
	void calcolaPopuladoCorretamente() {
		Roupa r = new CalcolasBuilder().nome("Calcolas")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null)
				.calcolaTipo(null)
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("calcola igual ele mesmo")
	void calcola1_Igual_calcola1() {
		Roupa r = new CalcolasBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("calcola igual outro calcola mesmos valores")
	void calcola1_Igual_calcola2() {
		Roupa r = new CalcolasBuilder().build();
		Roupa r1 = new CalcolasBuilder().build();
		assertTrue(r.equals(r1));
	}
	
	@Test
	@DisplayName("calcola diferente saia")
	void calcola1_Igual_Saia() {
		Roupa r = new CalcolasBuilder().build();
		Roupa r1 = new SaiasBuilder().build();
		assertFalse(r.equals(r1));
	}
	
	
	@Test
	@DisplayName("calcola hashCode")
	void calcola1_hash() {
		Roupa r = new CalcolasBuilder().build();
		Roupa r1 = new CalcolasBuilder().build();
		assertEquals(r.hashCode(), r1.hashCode());
	}

	@Test
	@DisplayName("toString está correto")
	void calcola_ToString() {
		Roupa r = new CalcolasBuilder().nome("Calcolas")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(null)
				.calcolaTipo(null)
				.build();
		assertTrue(r.toString().contains("CRIADA"));
	}
}
