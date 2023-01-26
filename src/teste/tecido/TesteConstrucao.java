package teste.tecido;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import roupa.modelo.tecido.Construcao;

public class TesteConstrucao {
	
	@Test
	@DisplayName("Se algod�o � criado corretamente")
	void pegaEnumCorretamente(){		
		
		assertSame(Construcao.pegaEnum("plano"), Construcao.PLANO);
	}
	
	
	@Test
	@DisplayName("Se algod�o � criado corretamente")
	void verificaSeEnumExisteCorretamente(){		
		
		assertEquals(Construcao.existeNoEnum("plano"), true);
	}

}
