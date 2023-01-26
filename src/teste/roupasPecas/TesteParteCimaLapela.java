package teste.roupasPecas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Casacos.CasacosBuilder;

public class TesteParteCimaLapela {
	@Test
	@DisplayName("parte de cima hashCode")
	void parteDeCima_HashCode() {
		Roupa r = new CasacosBuilder().build();
		int i = r.hashCode();
		
		
		assertEquals(i,r.hashCode());
	}

	@Test
	@DisplayName("parte de baixo equals ele mesmo")
	void parteDeCima_Equals_ela_mesma() {
		Roupa r = new CasacosBuilder().build();		
		
		assertTrue(r.equals(r));
	}
	
	@Test
	@DisplayName("parte de baixo  outro mesmos valores")
	void parteDeCima_Equals_outra_igual() {
		Roupa r = new CasacosBuilder().build();
		Roupa r1 = new CasacosBuilder().build();
		
		assertTrue(r.equals(r1));
	}
	@Test
	@DisplayName("parte de baixo igual outro valores diferentes")
	void parteDeCima_Equals_outraDiferente() {
		Roupa r = new CasacosBuilder().build();
		Roupa r1 = new CasacosBuilder().nome("casaco").build();
		
		
		assertFalse(r1.equals(r));
	}
}
