package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pBaixo.enumerators.GanchoTipos;
import roupa.modelo.pBaixo.enumerators.PunhoCalca;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Macacao.MacacaoBuilder;

public class TesteMacacao {
	@Test
	@DisplayName("macacao é instanciável")
	void macacaoDiferente_De_Null() {
		Roupa r = new MacacaoBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("macacao popula corretamente")
	void macacaoPopuladoCorretamente() {
		Roupa r = new MacacaoBuilder().nome("macacao")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null)
				.capuz(null)	
				.comprimentoMacacao(ComprimentoDeCalca.ACIMA_DO_JOELHO)
				.ganchoTipo(null)
				.punhoCalca(null)
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("macacao igual ele mesmo")
	void macacao1_Igual_macacao1() {
		Roupa r = new MacacaoBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("macacao igual outro macacao mesmos valores")
	void macacao1_Igual_macacao2() {
		Roupa r = new MacacaoBuilder().build();
		Roupa r1 = new MacacaoBuilder().build();
		assertTrue(r.equals(r1));
	}

	@Test
	@DisplayName("toString está correto")
	void macacao_ToString() {
		Roupa r = new MacacaoBuilder().nome("macacao")
				.tamanho(null).genero(null).cor("azul")
				.modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null)
				.capuz(null)	
				.comprimentoMacacao(ComprimentoDeCalca.ACIMA_DO_JOELHO)
				.ganchoTipo(GanchoTipos.JUSTO)
				.punhoCalca(PunhoCalca.COM_BOTAO)
				.build();
		assertTrue(r.toString().contains("CRIADA"));
	}

	
}
