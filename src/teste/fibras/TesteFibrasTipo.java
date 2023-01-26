package teste.fibras;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.artificial.Liocel;
import roupa.modelo.tecido.fibra.artificial.Modal;
import roupa.modelo.tecido.fibra.artificial.Viscose;
import roupa.modelo.tecido.fibra.enumerators.TipoFibra;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.natural.Couro;
import roupa.modelo.tecido.fibra.natural.La;
import roupa.modelo.tecido.fibra.natural.Linho;
import roupa.modelo.tecido.fibra.natural.Seda;
import roupa.modelo.tecido.fibra.sintetica.Acrilico;
import roupa.modelo.tecido.fibra.sintetica.Elastano;
import roupa.modelo.tecido.fibra.sintetica.Poliamida;
import roupa.modelo.tecido.fibra.sintetica.Poliester;

public class TesteFibrasTipo {

	
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Algodao")
	void ehNatural_Algodao(){
		Fibra f = new Algodao();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.NATURAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Lã")
	void ehNatural_La(){
		Fibra f = new La();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.NATURAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Linho")
	void ehNatural_Linho(){
		Fibra f = new Linho();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.NATURAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Couro")
	void ehNatural_Couro(){
		Fibra f = new Couro();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.NATURAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Seda")
	void ehNatural_Seda(){
		Fibra f = new Seda();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.NATURAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Acetato")
	void ehArtificial_Acetato(){
		Fibra f = new Acetato();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.ARTIFICIAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Liocel")
	void ehArtificial_Liocel(){
		Fibra f = new Liocel();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.ARTIFICIAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Modal")
	void ehArtificial_Modal(){
		Fibra f = new Modal();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.ARTIFICIAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Viscose")
	void ehArtificial_Viscose(){
		Fibra f = new Viscose();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.ARTIFICIAL);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Acrilico")
	void ehSintetica_Acrilico(){
		Fibra f = new Acrilico();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.SINTETICA);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Poliamida")
	void ehSintetica_Poliamida(){
		Fibra f = new Poliamida();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.SINTETICA);
	}
	
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Elastano")
	void ehSintetica_Elastano(){
		Fibra f = new Elastano();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.SINTETICA);
	}
	@Test
	@DisplayName("Se o tipo de fibra é settado corretamente - Poliester")
	void ehSintetica_Poliester(){
		Fibra f = new Poliester();
		f.setTodasAsPropriedades();
		TipoFibra output = f.getTipoFibra();
		assertEquals(output, TipoFibra.SINTETICA);
	}

}
