package teste.tecido;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.artificial.Viscose;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.sintetica.Elastano;
import roupa.modelo.tecido.fibra.sintetica.Poliamida;

public class TesteTecido {
	@Test
	@DisplayName("tecido  é instanciável")
	void tecido_Diferente_De_Null() {
		Tecido t = new Tecido(null, Construcao.TNT);
		assertNotEquals(t, null);
	}

	@Test
	@DisplayName("tecido popula corretamente")
	void tecido_PopuladoCorretamente() {
		Fibra acetato = new Acetato();
		Fibra poliamida = new Poliamida();
		acetato.setTodasAsPropriedades();
		poliamida.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(poliamida);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		
		assertNotEquals(t, null);
	}

	@Test
	@DisplayName("tecido igual ele mesmo")
	void tecido1_Igual_tecido1() {
		Fibra acetato = new Acetato();
		Fibra poliamida = new Poliamida();
		acetato.setTodasAsPropriedades();
		poliamida.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(poliamida);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
	
		assertTrue(t.equals(t));
	}
	
	
	@Test
	@DisplayName("tecido igual outro tecido mesmos valores")
	void tecido1_Igual_tecido2() {
		Fibra acetato = new Acetato();
		Fibra poliamida = new Poliamida();
		acetato.setTodasAsPropriedades();
		poliamida.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(poliamida);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		
		Fibra acetato2 = new Acetato();
		Fibra poliamida2 = new Poliamida();
		acetato2.setTodasAsPropriedades();
		poliamida2.setTodasAsPropriedades();
		HashSet<Fibra> fibras2 = new HashSet<>();
		fibras2.add(acetato2);
		fibras2.add(poliamida2);
		Tecido t2 = new Tecido(fibras2, Construcao.PLANO);
		assertTrue(t.equals(t2));
	}

	@Test
	@DisplayName("toString está correto")
	void tecidotoString() {
		Fibra acetato = new Acetato();
		Fibra poliamida = new Poliamida();
		acetato.setTodasAsPropriedades();
		poliamida.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(poliamida);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		
		
		assertTrue(t.toString().contains("tecendo......."));
	}
	
	@Test
	@DisplayName("retorna a coleção de fibras")
	void tecidoGetFibras() {
		Fibra acetato = new Acetato();
		Fibra poliamida = new Poliamida();
		acetato.setTodasAsPropriedades();
		poliamida.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(poliamida);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		
		assertNotEquals(t.getComposicao(), null);
	}
	
	
	@Test
	@DisplayName("tecido 1 diferente de tecido 2 com valores diferentes")
	void tecido1_diferente_tecido2() {
		Fibra acetato = new Acetato();
		acetato.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		Tecido t1 = new Tecido(null, Construcao.TNT);
		
		assertFalse(t.equals(acetato));
	}
	
	
	@Test
	@DisplayName("tecido propriedades Elasticidade")
	void tecido_propriedades_0() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertTrue(t.getElasticidadeTecido().equals("alta elasticidade"));
	}
	
	@Test
	@DisplayName("tecido pega Composicao")
	void pegaComposicaoCorretamente(){
		Fibra f1 = new Algodao();
		HashSet<Fibra> fibras = new HashSet<>();
		Tecido t = new Tecido(fibras, null);
		
		
		assertNotEquals(t.getComposicao(), null);
	}
	
	@Test
	@DisplayName("tecido propriedades Elasticidade")
	void tecido_propriedades_1() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertTrue(t.getElasticidadeTecido().equals("alta elasticidade"));
	}
	
	@Test
	@DisplayName("tecido propriedades")
	void tecido1_prop() {
		Fibra f1 = new Viscose();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		
		assertTrue(t.getResistenciaTecido().equals("pouco resistente"));
	}
	
	@Test
	@DisplayName("tecido propriedades resistencia")
	void tecido1_prop_1() {
		Fibra f1 = new Viscose();
		f1.setTodasAsPropriedades();
		Fibra f2 = new Poliamida();
		f2.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		fibras.add(f2);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		
		assertTrue(t.getResistenciaTecido().equals("resistente"));
	}
	
	@Test
	@DisplayName("hash")
	void tecido1_hash() {
		Fibra f1 = new Viscose();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		Tecido t1 = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();
		
		assertEquals(t.hashCode(), t1.hashCode());
	}
	
	@Test
	@DisplayName("tecido propriedades Construcao")
	void tecido_propriedades_2() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertNotEquals(t.getConstrucao(),null);
	}
	
	@Test
	@DisplayName("tecido propriedades tipoTecido")
	void tecido_propriedades_3() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getTipoDeTecido().isEmpty());
	}
	
	@Test
	@DisplayName("tecido propriedades secagem")
	void tecido_propriedades_4() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getTempoSecagemTecido().isEmpty());
	}
	
	@Test
	@DisplayName("tecido propriedades respiravel")
	void tecido_propriedades_5() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getTecidoRespiravel().isEmpty());
	}
	
	@Test
	@DisplayName("tecido propriedades absorçao agua")
	void tecido_propriedades_6() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getAbsorcaoAguaTecido().isEmpty());
	}
	
	@Test
	@DisplayName("tecido propriedades comportamentotermico")
	void tecido_propriedades_7() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getComportamentoTermicoTecido().isEmpty());
	}
	
	@Test
	@DisplayName("tecido propriedades resistencia")
	void tecido_propriedades_8() {
		Fibra f1 = new Elastano();
		f1.setTodasAsPropriedades();
		HashSet<Fibra> fibras = new HashSet<>();
		fibras.add(f1);
		Tecido t = new Tecido(fibras, Construcao.PLANO);
		t.setTodasAsPropriedades();

		
		assertFalse(t.getResistenciaTecido().isEmpty());
	}

}
