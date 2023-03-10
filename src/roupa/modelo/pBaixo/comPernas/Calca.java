package roupa.modelo.pBaixo.comPernas;


import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pBaixo.ParteDeBaixo;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pBaixo.enumerators.GanchoTipos;
import roupa.modelo.pBaixo.enumerators.PunhoCalca;
import roupa.modelo.tecido.Tecido;

public class Calca extends ParteDeBaixo {
	
	 protected PunhoCalca punhoCalca;
	 protected GanchoTipos gancho;
	 protected ComprimentoDeCalca comprimentoCalca;
	 
	public Calca(CalcaBuilder builder) {
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
		this.punhoCalca = builder.punhoCalca;
		this.gancho = builder.gancho;
		this.comprimentoCalca = builder.comprimentoCalca;
	}


	public static class CalcaBuilder {

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
		protected PunhoCalca punhoCalca;
		protected GanchoTipos gancho;
		protected ComprimentoDeCalca comprimentoCalca;

		public CalcaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public CalcaBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public CalcaBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public CalcaBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public CalcaBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public CalcaBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		public CalcaBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}

		public CalcaBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public CalcaBuilder cintura(Cintura cintura) {
			this.cintura = cintura;
			return this;
		}

		public CalcaBuilder punhoCalca(PunhoCalca punhoCalca) {
			this.punhoCalca = punhoCalca;
			return this;
		}

		public CalcaBuilder gancho(GanchoTipos gancho) {
			this.gancho = gancho;
			return this;
		}

		public CalcaBuilder comprimentoCalca(ComprimentoDeCalca comprimentoCalca) {
			this.comprimentoCalca = comprimentoCalca;
			return this;
		}

		public Calca build() {
			return new Calca(this);
		}

	}

	@Override
	public String toString() {
		return "\n\n" + this.costurando() + "\nPE?A CRIADA! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase()
				+ " Comprimento: " + this.comprimentoCalca 
				+ " Cintura: " + this.cintura 
				+ " Tamanho: " + this.tamanho 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: " + this.tecidos + "/"
				+ " / Modelagem: " + this.modelagem 
				+ "  Gancho: " + this.gancho 
				+ "  Punho: " + this.punhoCalca+ "/";

	}

	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(comprimentoCalca, gancho, punhoCalca);
		return resultado;
	}

	@Override
	public boolean equals(Object outro) {
		if(outro == null)return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Calca roupa = (Calca) outro;
		return comprimentoCalca == roupa.comprimentoCalca && gancho == roupa.gancho && punhoCalca == roupa.punhoCalca && cintura == roupa.cintura 
				&& cor == roupa.cor
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
