package teste.modelagem;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.Modelagem.ModelagemBuilder;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;
import roupa.modelo.tecido.Tecido;

public class TesteModelagem {

	@Test
	@DisplayName ("Modelagem  é instanciável")
	public void modelagem_Instanciavel() {
		Modelagem m = new ModelagemBuilder().build();
		assertNotEquals(m, null);
	}
	
	@Test
	@DisplayName ("Modelagem  é populada corretamente pelo Builder")
	public void modelagem_Populada() {
		Modelagem m = new ModelagemBuilder()
				.bolsos(false)
				.tipoFechamento(TipoFechamento.BOTAO_COSTAS)
				.barra(Barra.LENCO)
				.pregas(Pregas.PLISSADO)
				.pences(true)
				.fenda(false)
				.pala(true)
				.forro(false)
				.babado(true)
				.cinto(false)
				.passantes(false)
				.silhueta(Silhueta.RETA)
				.build();
	
		assertNotEquals(m, null);
	}

	

	@Test
	@DisplayName ("Modelagem toString não é null")
	public void modelagem_to_String_() {
		Modelagem m = new ModelagemBuilder().build();
		assertNotEquals(m.toString(), null);
	}
	
	@Test
	@DisplayName ("Modelagem toString contem texto dele")
	public void modelagem_to_String() {
		Modelagem m = new ModelagemBuilder().build();
		String s = " Fenda:";
		assertTrue(m.toString().contains(s));
	}
	
	
	@Test
	@DisplayName ("Modelagem Equals")
	public void modelagem_Equals() {
		Modelagem m = new ModelagemBuilder().build();
		Modelagem m1 = new ModelagemBuilder().build();
		Tecido t = new Tecido(null, null);
		
		assertTrue(m.equals(m1));
	}
	
	@Test
	@DisplayName ("Modelagem Equals")
	public void modelagem_Equals_Tecido() {
		Modelagem m = new ModelagemBuilder().build();
		Tecido t = new Tecido(null, null);
		
		assertFalse(m.equals(t));
	}
	
	@Test
	@DisplayName("modelagem hashCode")
	void modelagem1_hash() {
		Modelagem m = new ModelagemBuilder().build();
		Modelagem m1 = new ModelagemBuilder().build();
		assertEquals(m.hashCode(), m1.hashCode());
	}
	
	

}
