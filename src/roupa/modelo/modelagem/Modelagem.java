package roupa.modelo.modelagem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import roupa.modelo.Roupa;
import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.Silhueta;
import roupa.modelo.modelagem.enumerators.TipoFechamento;
import roupa.modelo.pBaixo.semPernas.Calcolas.CalcolasBuilder;

public class Modelagem {

	Boolean bolsos;
	TipoFechamento tipoFechamento;
	Barra barra;
	Boolean pala;
	Pregas pregas;
	Boolean pences;
	Boolean fenda;
	Boolean forro;
	Boolean babado;
	Boolean cinto;
	Boolean passantes;
	Silhueta silhueta;

	public Modelagem(ModelagemBuilder builder) {
		this.bolsos = builder.bolsos;
		this.tipoFechamento = builder.tipoFechamento;
		this.barra = builder.barra;
		this.pala = builder.pala;
		this.pregas = builder.pregas;
		this.pences = builder.pences;
		this.fenda = builder.fenda;
		this.forro = builder.forro;
		this.babado = builder.babado;
		this.cinto = builder.cinto;
		this.passantes = builder.passantes;
		this.silhueta = builder.silhueta;
	}

	public static class ModelagemBuilder {
		Boolean bolsos;
		TipoFechamento tipoFechamento;
		Barra barra;
		Boolean pala;
		Pregas pregas;
		Boolean pences;
		Boolean fenda;
		Boolean forro;
		Boolean babado;
		Boolean cinto;
		Boolean passantes;
		Silhueta silhueta;

		public ModelagemBuilder bolsos(Boolean bolsos) {
			this.bolsos = bolsos;
			return this;
		}

		public ModelagemBuilder tipoFechamento(TipoFechamento tipoFechamento) {
			this.tipoFechamento = tipoFechamento;
			return this;
		}

		public ModelagemBuilder barra(Barra barra) {
			this.barra = barra;
			return this;
		}

		public ModelagemBuilder pala(Boolean pala) {
			this.pala = pala;
			return this;
		}

		public ModelagemBuilder pregas(Pregas pregas) {
			this.pregas = pregas;
			return this;
		}

		public ModelagemBuilder pences(Boolean pences) {
			this.pences = pences;
			return this;
		}

		public ModelagemBuilder fenda(Boolean fenda) {
			this.fenda = fenda;
			return this;
		}

		public ModelagemBuilder forro(Boolean forro) {
			this.forro = forro;
			return this;
		}

		public ModelagemBuilder babado(Boolean babado) {
			this.babado = babado;
			return this;
		}

		public ModelagemBuilder cinto(Boolean cinto) {
			this.cinto = cinto;
			return this;
		}

		public ModelagemBuilder passantes(Boolean passantes) {
			this.passantes = passantes;
			return this;
		}

		public ModelagemBuilder silhueta(Silhueta silhueta) {
			this.silhueta = silhueta;
			return this;
		}

		public Modelagem build() {
			return new Modelagem(this);
		}
	}

	@Override
	public String toString() {
		return "  " + this.silhueta + "  Fenda: " + this.fenda + "  Pences: " + this.pences + "  Bolso: " + this.bolsos
				+ "  Fechamento: " + this.tipoFechamento + "  Cinto: " + this.cinto + "  Passantes: " + this.passantes
				+ "  Pregas: " + this.pregas + "  Babado: " + this.babado + "  Pala: " + this.pala + "  Barra: "
				+ this.barra + "  Forro: " + this.forro;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(babado, barra, bolsos, cinto, fenda, forro, pala, passantes, pences, pregas, silhueta,
				tipoFechamento);
	}

	@Override
	public boolean equals(Object outro) {
		if(outro == null)return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Modelagem modelagem = (Modelagem) outro;
		return Objects.equals(babado, modelagem.babado) && barra == modelagem.barra && Objects.equals(bolsos, modelagem.bolsos)
				&& Objects.equals(cinto, modelagem.cinto) && Objects.equals(fenda, modelagem.fenda)
				&& Objects.equals(forro, modelagem.forro) && Objects.equals(pala, modelagem.pala)
				&& Objects.equals(passantes, modelagem.passantes) && Objects.equals(pences, modelagem.pences)
				&& pregas == modelagem.pregas && silhueta == modelagem.silhueta && tipoFechamento == modelagem.tipoFechamento;
		
	}
	

}
