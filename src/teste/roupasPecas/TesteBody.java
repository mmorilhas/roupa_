package teste.roupasPecas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.enumerators.Genero;
import roupa.modelo.pBaixo.enumerators.BodyTipos;
import roupa.modelo.pBaixo.enumerators.CalcolaTipos;
import roupa.modelo.pCimaECorpoInteiro.pCima.comLapela.Body.BodyBuilder;

public class TesteBody {

	@Test
	@DisplayName("body  é instanciável")
	void body_Diferente_De_Null() {
		Roupa r = new BodyBuilder().build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("body popula corretamente")
	void body_PopuladoCorretamente() {
		Roupa r = new BodyBuilder().nome("body")
				.tamanho(null).genero(Genero.FEMININO).cor("azul").modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null).bodyCalcolaTipo(CalcolaTipos.BIQUINI).bodyTipo(BodyTipos.COM_BOTAO)
				
				.build();
		assertNotEquals(r, null);
	}

	@Test
	@DisplayName("body igual ele mesmo")
	void body1_Igual_body1() {
		Roupa r = new BodyBuilder().build();
		assertTrue(r.equals(r));
	}
	@Test
	@DisplayName("body igual outro body mesmos valores")
	void body1_Igual_body2() {
		Roupa r = new BodyBuilder().build();
		Roupa r1 = new BodyBuilder().build();
		assertTrue(r.equals(r1));
	}

	@Test
	@DisplayName("toString está correto")
	void bodytoString() {
		Roupa r = new BodyBuilder().nome("body")
				.tamanho(null).genero(Genero.MASCULINO).cor("azul").modelagem(null).tecidos(null).temBordado(null).temEstampa(null)
				.manga(null).decote(null).cava(null).capuz(null).bodyCalcolaTipo(CalcolaTipos.BIQUINI).bodyTipo(BodyTipos.COM_BOTAO).build();
		
		assertTrue(r.toString().contains("CRIADA"));
	}
}
