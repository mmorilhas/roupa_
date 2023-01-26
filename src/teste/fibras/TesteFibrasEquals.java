package teste.fibras;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Collection;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.natural.Algodao;

public class TesteFibrasEquals{
	
	Fibra acetato = new Acetato();
	Fibra acetato1 = new Acetato();
	Fibra algodao = new Algodao();
	Collection <Fibra> fibras = new HashSet<>();
	Collection <Fibra> fibrasQ = new HashSet<>();
	
	@Test
	public void comparandoFibras_verificandoSaida() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		fibras.add(acetato);
		fibrasQ.add(acetato);
		assertTrue(fibras.equals(fibrasQ));
	}
	
	
	
	@Test
	public void comparandoCollectionFibras_verificandoEquals() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		fibras.add(acetato);
		fibrasQ.add(acetato);
		assertTrue(fibras.equals(fibrasQ));
	}
	
	@Test
	public void comparandoCollectionFibras_verificandoEquals_2() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		fibras.add(acetato);
		fibrasQ.add(acetato1);
		assertTrue(fibras.equals(fibrasQ));
	}
	
	@Test
	public void comparandoCollectionFibras_verificandoEquals_3() {
		acetato.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		fibras.add(acetato);
		fibrasQ.add(algodao);
		assertFalse(fibras.equals(fibrasQ));
	}
	
	
	
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasIguaisSaoIGUAIS() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		assertTrue(acetato.equals(acetato1));
	}
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasIguaisSaoIGUAIS_2() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		assertTrue(acetato1.equals(acetato));
	}
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasDiferentesSaoDIFERENTES() {
		acetato1.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		assertFalse(acetato.equals(algodao));
	}
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasDiferentesSaoDIFERENTES_2() {
		acetato.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		assertFalse(algodao.equals(acetato));
	}
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasDiferentesSaoDIFERENTES_3() {
		acetato1.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		assertFalse(acetato1.equals(algodao));
	}
	@Test
	public void comparandoFibras_verificandoEquals_seDuasFibrasDiferentesSaoDIFERENTES_4() {
		acetato1.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		assertFalse(algodao.equals(acetato1));
	}
	@Test
	public void comparandoFibras_verificandoHashCode_seDuasFibrasIguaisMESMOHashcode() {
		acetato.setTodasAsPropriedades();
		acetato1.setTodasAsPropriedades();
		int acet = acetato.hashCode();
		int acet1 = acetato1.hashCode();
		assertEquals(acet, acet1);
	}
	@Test
	public void comparandoFibras_verificandoHashCode_seDuasFibrasDiferentesHashcodeDIFERENTE() {
		acetato1.setTodasAsPropriedades();
		algodao.setTodasAsPropriedades();
		int acet = acetato.hashCode();
		int alg = algodao.hashCode();
		assertNotEquals(acet, alg);
	}
	
	

}
