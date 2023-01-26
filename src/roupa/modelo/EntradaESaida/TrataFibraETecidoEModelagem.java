package roupa.modelo.EntradaESaida;

import java.util.Collection;
import java.util.HashSet;

import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.modelagem.Modelagem.ModelagemBuilder;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.tecido.Construcao;
import roupa.modelo.tecido.Tecido;
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

public class TrataFibraETecidoEModelagem {
	static Boolean entradaToBoolean(String valor) {
		if (valor.equals("true") || valor.equals("sim")) {
			return true;
		}
		return false;
	}
	

	public Collection<Fibra> devolveCollectionFibra(String nomeFibra1, String nomeFibra2, String nomeFibra3){
		Collection<Fibra> fibras = new HashSet<>();
		
		if (NomeFibra.pegaEnum(nomeFibra1) == NomeFibra.ALGODAO
				|| (!nomeFibra2.contains("sem") && NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ALGODAO))
				|| (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ALGODAO))) {
			Fibra f1 = new Algodao();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LINHO)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LINHO) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LINHO))) {
			Fibra f1 = new Linho();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LA)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LA)
				|| (!nomeFibra3.contains("sem") && NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LA))) {
			Fibra f1 = new La();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.SEDA)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.SEDA)
				|| (!nomeFibra3.contains("sem") && NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.SEDA))) {
			Fibra f1 = new Seda();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.COURO)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.COURO) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.COURO))) {
			Fibra f1 = new Couro();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.VISCOSE)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.VISCOSE) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.VISCOSE))) {
			Fibra f1 = new Viscose();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.MODAL)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.MODAL) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.MODAL))) {
			Fibra f1 = new Modal();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.LIOCEL)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.LIOCEL) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.LIOCEL))) {
			Fibra f1 = new Liocel();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ACETATO)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ACETATO) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ACETATO))) {
			Fibra f1 = new Acetato();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ACRILICO)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ACRILICO) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ACRILICO))) {
			Fibra f1 = new Acrilico();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.POLIAMIDA)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.POLIAMIDA)
				|| (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.POLIAMIDA))) {
			Fibra f1 = new Poliamida();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.POLIESTER)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.POLIESTER)
				|| (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.POLIESTER))) {
			Fibra f1 = new Poliester();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		if (NomeFibra.pegaEnum(nomeFibra1).equals(NomeFibra.ELASTANO)
				|| NomeFibra.pegaEnum(nomeFibra2).equals(NomeFibra.ELASTANO) || (!nomeFibra3.contains("sem")
						&& NomeFibra.pegaEnum(nomeFibra3).equals(NomeFibra.ELASTANO))) {
			Fibra f1 = new Elastano();
			f1.setTodasAsPropriedades();
			fibras.add(f1);
		}
		
		return fibras;
	}

	public Modelagem devolveModelagem(String temBolso, String tipoFechamento, String barra, String temPala, String pregas, String temPence, String temFenda, String temForro, String temBabado, String temCinto, String temPassantes, String silhueta ) {
			
			Modelagem modelagem = new ModelagemBuilder().bolsos(entradaToBoolean(temBolso))
					.tipoFechamento(TipoFechamento.pegaEnum(tipoFechamento)).barra(Barra.pegaEnum(barra))
					.pala(entradaToBoolean(temPala)).pregas(Pregas.pegaEnum(pregas))
					.pences(entradaToBoolean(temPence)).fenda(entradaToBoolean(temFenda))
					.forro(entradaToBoolean(temForro)).babado(entradaToBoolean(temBabado))
					.cinto(entradaToBoolean(temCinto)).passantes(entradaToBoolean(temPassantes))
					.silhueta(Silhueta.pegaEnum(silhueta)).build();
		return modelagem;
		
	}
	
	
	public Tecido devolveTecido(Collection<Fibra> fibras, String construcaoTecido) {
		Tecido tecido = new Tecido(fibras, Construcao.pegaEnum(construcaoTecido));
		tecido.setTodasAsPropriedades();
		return tecido;
	}
}
