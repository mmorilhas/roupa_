package roupa.modelo.modelagem;

import java.util.Objects;

import roupa.modelo.modelagem.enumerators.Barra;
import roupa.modelo.modelagem.enumerators.Pregas;
import roupa.modelo.modelagem.enumerators.TipoFechamento;

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
			this.barra= barra;
			return this;
		}
		public ModelagemBuilder pala(Boolean pala) {
			this.pala = pala;
			return this;
		}
		public ModelagemBuilder  pregas(Pregas  pregas) {
			this.pregas=  pregas;
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
		return "\n      " + this.silhueta 
				+ "\n      Fenda: " + this.fenda
				+ "\n      Pences: " + this.pences
				+ "\n      Bolso: " + this.bolsos
				+ "\n      Fechamento: " + this.tipoFechamento 
				+ "\n      Cinto: " + this.cinto 
				+ "\n      Passantes: " + this.passantes
				+ "\n      Pregas: " + this.pregas
				+ "\n      Babado: " + this.babado
				+ "\n      Pala: " + this.pala
				+ "\n      Barra: " + this.barra
				+ "\n      Forro: " + this.forro  ;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(babado, barra, bolsos, cinto, fenda, forro, pala, passantes, pences, pregas, silhueta,
				tipoFechamento);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelagem other = (Modelagem) obj;
		return Objects.equals(babado, other.babado) && barra == other.barra && Objects.equals(bolsos, other.bolsos)
				&& Objects.equals(cinto, other.cinto) && Objects.equals(fenda, other.fenda)
				&& Objects.equals(forro, other.forro) && Objects.equals(pala, other.pala)
				&& Objects.equals(passantes, other.passantes) && Objects.equals(pences, other.pences)
				&& pregas == other.pregas && silhueta == other.silhueta && tipoFechamento == other.tipoFechamento;
	}




	
	
	
}
