package roupa.teste;

import java.util.Collection;
import java.util.HashSet;


import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.artificial.Acetato;
import roupa.modelo.tecido.fibra.natural.Algodao;

public class Principal {
	
	public static void main(String[] args)  {
		

		Fibra acetato = new Acetato();
		acetato.setTodasAsPropriedades();
		//System.out.println(acetato);
		
		Fibra acetato1 = new Acetato();
		acetato1.setTodasAsPropriedades();
		//System.out.println(acetato);
		
		
		Fibra algodao = new Algodao();
		algodao.setTodasAsPropriedades();
		//System.out.println(algodao);
		
		
		System.out.println(algodao.getTipoFibra().toString());
		Collection <Fibra> fibras = new HashSet<>();
		fibras.add(acetato);
		fibras.add(algodao);
		
		Tecido tecido = new Tecido(fibras, Construcao.MALHA);
		Tecido tecido1 = new Tecido(fibras, Construcao.MALHA);
		//System.out.println(tecido);
		
		Collection <Fibra> fibrasQ = new HashSet<>();
		fibrasQ.add(acetato);
		
		Tecido tecidoQ = new Tecido(fibrasQ, Construcao.MALHA);
		//System.out.println(tecidoQ);
		
		
		System.out.println(acetato.equals(acetato1));
		System.out.println(acetato1.equals(acetato));
		System.out.println(acetato.hashCode());
		System.out.println(acetato.hashCode());
		
		System.out.println("t - t1");
		System.out.println(tecido.equals(tecido1));
		System.out.println(tecido1.equals(tecido));
		System.out.println(tecido.hashCode());
		System.out.println("t - tq");
		System.out.println(tecido.equals(tecidoQ));
		System.out.println(tecidoQ.equals(tecido));
		System.out.println(tecido1.hashCode());

		System.out.println("t1 - tq");
		System.out.println(tecido1.equals(tecidoQ));
		System.out.println(tecidoQ.equals(tecido1));
		System.out.println(tecidoQ.hashCode());
		
	
		
		
	}
	

}
