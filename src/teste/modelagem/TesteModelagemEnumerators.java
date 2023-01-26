package teste.modelagem;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;

public class TesteModelagemEnumerators {

	@Test
	@DisplayName("Se silhueta metodos funcionam corretamente")
	void silhueta_pegaEnum(){
		
		
		assertTrue(Silhueta.existeNoEnum("larga"));
	}
	
	@Test
	@DisplayName("Se silhueta metodos funcionam corretamente")
	void silhueta_existeEnum(){
		
		
		assertEquals(Silhueta.pegaEnum("larga"), Silhueta.BAGGY);
	}
	
	
	@Test
	@DisplayName("Se tipoFechamento metodos funcionam corretamente")
	void tipoFechamento_pegaEnum(){
		
		
		assertTrue(TipoFechamento.existeNoEnum("Bot�o_costas"));
	}
	
	@Test
	@DisplayName("Se tipoFechamento metodos funcionam corretamente")
	void tipoFechamento_existeEnum(){
		
		
		assertEquals(TipoFechamento.pegaEnum("Bot�o_costas"), TipoFechamento.BOTAO_COSTAS);
	}
	
	
	@Test
	@DisplayName("Se barra metodos funcionam corretamente")
	void barra_pegaEnum(){
		
		
		assertTrue(Barra.existeNoEnum("Vi�s"));
	}
	
	@Test
	@DisplayName("Se barra metodos funcionam corretamente")
	void barra_existeEnum(){
	
		
		assertEquals(Barra.pegaEnum("Vi�s"), Barra.VIES);
	}
	
	@Test
	@DisplayName("Se pregas metodos funcionam corretamente")
	void pregas_pegaEnum(){
		
		
		assertTrue(Pregas.existeNoEnum("F�mea"));
	}
	
	@Test
	@DisplayName("Se pregas metodos funcionam corretamente")
	void pregas_existeEnum(){
	
		
		assertEquals(Pregas.pegaEnum("F�mea"), Pregas.FEMEA);
	}
}
