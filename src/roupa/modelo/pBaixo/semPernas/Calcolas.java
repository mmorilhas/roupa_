package roupa.modelo.pBaixo.semPernas;


import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pBaixo.ParteDeBaixo;
import roupa.modelo.pBaixo.enumerators.CalcolaTipos;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.tecido.Tecido;

public class Calcolas extends ParteDeBaixo{

	protected CalcolaTipos calcolaTipos;
	
	
	public Calcolas(CalcolasBuilder builder) {
		this.nome = builder.nome;
		this.tamanho = builder.tamanho;
		this.genero = builder.genero;
		this.cor = builder.cor;
		this.modelagem = builder.modelagem;
		this.tecidos = builder.tecidos;
		this.temEstampa = builder.temEstampa;
		this.temBordado = builder.temBordado;
		this.tipoDeRoupa = builder.tipoDeRoupa;
		this.cintura = builder.cintura;
		this.calcolaTipos = builder.calcolaTipos;
	}
	
	public static class CalcolasBuilder{
		
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_BAIXO;
		protected Integer tamanho;
		protected Genero genero;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected Cintura cintura;
		protected CalcolaTipos calcolaTipos;
		
		
		public CalcolasBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public CalcolasBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public CalcolasBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		
		public CalcolasBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public CalcolasBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public CalcolasBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public CalcolasBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public CalcolasBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public CalcolasBuilder cintura(Cintura cintura) {
			this.cintura = cintura;
			return this;
		}
		public CalcolasBuilder calcolaTipo(CalcolaTipos calcolaTipos) {
			this.calcolaTipos = calcolaTipos;
			return this;
		}
		
		
		
		public Calcolas build() {
			return new Calcolas(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\n\n" + this.costurando() + "\nPEÇA CRIADA! "
	+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase() + " " +  this.calcolaTipos 
				+ " Cintura: " + this.cintura 
				+ " Tamanho: " + this.tamanho  
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: " + this.tecidos + "/"
				+ " / Modelagem: " + this.modelagem + "/"; 
				
				
	}


	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(calcolaTipos);
		return resultado;
	}


	@Override
	public boolean equals(Object outro) {
		if(outro == null)return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Calcolas roupa = (Calcolas) outro;
		return calcolaTipos == roupa.calcolaTipos && cintura == roupa.cintura 	&& cor == roupa.cor
				&& genero == roupa.genero
				&& modelagem == roupa.modelagem
				&& nome == roupa.nome
				&& tamanho == roupa.tamanho
				&& tecidos == roupa.tecidos
				&& temBordado == roupa.temBordado
				&& temEstampa == roupa.temEstampa
				&& tipoDeRoupa == roupa.tipoDeRoupa;
	}
	
	
	
	
}
