package teste.fibras;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Collection;
import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.artificial.Liocel;
import roupa.modelo.tecido.fibra.artificial.Modal;
import roupa.modelo.tecido.fibra.artificial.Viscose;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.natural.Algodao;
import roupa.modelo.tecido.fibra.natural.Couro;
import roupa.modelo.tecido.fibra.natural.La;
import roupa.modelo.tecido.fibra.natural.Linho;
import roupa.modelo.tecido.fibra.natural.Seda;
import roupa.modelo.tecido.fibra.sintetica.Acrilico;
import roupa.modelo.tecido.fibra.sintetica.Elastano;
import roupa.modelo.tecido.fibra.sintetica.Poliamida;
import roupa.modelo.tecido.fibra.sintetica.Poliester;

public class TesteFibras {
	Fibra acetato = new Acetato();
	Fibra acetato1 = new Acetato();
	Collection<Fibra> fibras = new HashSet<>();
	Collection<Fibra> fibrasQ = new HashSet<>();

	
	@Test
	@DisplayName("Se algodão é criado corretamente")
	void criaAlgodao(){
		Fibra algodao = new Algodao();
		assertNotEquals(algodao, null);
	}
	
	@Test
	@DisplayName("Se Couro é criado corretamente")
	void criaouro(){
		Fibra f = new Couro();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Lã é criado corretamente")
	void criaLa(){
		Fibra f = new La();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Linho é criado corretamente")
	void criaLinho(){
		Fibra f = new Linho();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Seda é criado corretamente")
	void criaSeda(){
		Fibra f = new Seda();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Acetato é criado corretamente")
	void criaAcetato(){
		Fibra f = new Acetato();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Liocel é criado corretamente")
	void criaLiocel(){
		Fibra f = new Liocel();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Modal é criado corretamente")
	void criaModal(){
		Fibra f = new Modal();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Viscose é criado corretamente")
	void criaViscose(){
		Fibra f = new Viscose();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Acrilico é criado corretamente")
	void criaAcrilico(){
		Fibra f = new Acrilico();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Elastano é criado corretamente")
	void criaElastano(){
		Fibra f = new Elastano();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Poliamida é criado corretamente")
	void criaPoliamida(){
		Fibra f = new Poliamida();
		assertNotEquals(f, null);
	}
	@Test
	@DisplayName("Se Poliester é criado corretamente")
	void criaPoliester(){
		Fibra f = new Poliester();
		assertNotEquals(f, null);
	}
	//-----------------------------------
	@Test
	@DisplayName("Se NomeFibra métodos funcionam corretamente")
	void pegaEnumNomeFibraCorretamente(){
		assertNotEquals(NomeFibra.pegaEnum("poliamida"), null);
	}
	
	@Test
	@DisplayName("Se NomeFibra métodos funcionam corretamente")
	void procuraEnumNomeFibraCorretamente(){
		assertNotEquals(NomeFibra.existeNoEnum("poliamida"), null);
	}
	
	@Test
	@DisplayName("Se fiando método funcionam corretamente")
	void fibra_fiando(){
		Fibra f = new Algodao();
		
		assertNotEquals(f.fiando(), null);
	}
	
	@Test
	@DisplayName("Se toString métodos funcionam corretamente")
	void fibra_toString(){
		Fibra f = new Algodao();
		assertNotEquals(f.toString(), null);
	}
	
	
	

}
