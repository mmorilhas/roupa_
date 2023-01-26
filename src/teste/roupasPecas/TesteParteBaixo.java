package teste.roupasPecas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.comPernas.Calca.CalcaBuilder;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;

public class TesteParteBaixo {
	
	@Test
	@DisplayName("parte de baixo hashCode")
	void parteDeBaixo_HashCode() {
		Roupa r = new CalcaBuilder().build();
		int i = r.hashCode();
		
		
		assertEquals(i,r.hashCode());
	}

	@Test
	@DisplayName("parte de baixo equals")
	void parteDeBaixo_Equals_ela_mesma() {
		Roupa r = new CalcaBuilder().build();
		
		
		
		assertTrue(r.equals(r));
	}
	
	@Test
	@DisplayName("parte de baixo igual outro mesmos valores")
	void parteDeBaixo_Equals_outra_igual() {
		Roupa r = new CalcaBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(Cintura.ALTA).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
;
Roupa r1 = new CalcaBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
.cintura(Cintura.ALTA).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
		
		
		
		assertTrue(r1.equals(r));
	}
	@Test
	@DisplayName("parte de baixo igual outro  valores diferentes")
	void parteDeBaixo_Equals_outraDiferente() {
		Roupa r = new CalcaBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.cintura(Cintura.ALTA).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
;
Roupa r1 = new CalcaBuilder().nome(null).tamanho(null).genero(null).cor(null).modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
.cintura(null).punhoCalca(null).gancho(null).comprimentoCalca(ComprimentoDeCalca.ABAIXO_DO_JOELHO).build();
		
		
		
		assertFalse(r1.equals(r));
	}

	
}
