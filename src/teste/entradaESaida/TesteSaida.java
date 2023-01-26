package teste.entradaESaida;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.EntradaESaida.Saida;

public class TesteSaida {
	
	@Test
	@DisplayName("saída")
	void testesaida() {
		List<Object> saida = new ArrayList<>();
		saida.add("estou sendo testada");
		
		Saida s = new Saida();
		s.criaCSVSaida("TesteSaida", saida, 1, 0);
		
		assertFalse(saida.isEmpty());
	}
	
	@Test
	@DisplayName("saída")
	void testesaida_vazia() {
		List<Object> saida = new ArrayList<>();
		
		Saida s = new Saida();
		s.criaCSVSaida("TesteSaida", saida, 1, 0);
		
		assertTrue(saida.isEmpty());
	}

}
