package teste.roupas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;

public class TesteRoupaEnumerators {
	
	@Test
	@DisplayName("Se Genero metodos funcionam corretamente")
	void generoTipos_pegaEnum(){
		
		
		assertTrue(Genero.existeNoEnum("feminino"));
	}
	
	@Test
	@DisplayName("Se Genero metodos funcionam corretamente")
	void generoTipos_existeEnum(){
		
		
		assertEquals(Genero.pegaEnum("feminino") ,Genero.FEMININO);
	}
	
	
	@Test
	@DisplayName("Se tipoRoupa metodos funcionam corretamente")
	void genero_existeEnum_(){
		
		
		assertNotEquals(Genero.pegaEnum("unissex") , null);
	}
	
	@Test
	@DisplayName("Se tipoRoupa metodos funcionam corretamente")
	void tipoRoupa_pegaEnum(){
		
		
		assertTrue(TipoDeRoupa.existeNoEnum("corpo_inteiro"));
	}
	
	@Test
	@DisplayName("Se tipoRoupa metodos funcionam corretamente")
	void tipoRoupa_existeEnum(){
		
		
		assertEquals(TipoDeRoupa.pegaEnum("corpo_inteiro") ,TipoDeRoupa.CORPO_INTEIRO);
	}
	
	
	@Test
	@DisplayName("Se tipoRoupa metodos funcionam corretamente")
	void tipoRoupa_existeEnum_(){
		
		
		assertNotEquals(TipoDeRoupa.pegaEnum("baixo") , null);
	}



}
