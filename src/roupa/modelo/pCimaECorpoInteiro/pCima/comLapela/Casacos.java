package roupa.modelo.pCimaECorpoInteiro.pCima.comLapela;


import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoCasaco;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;


public class Casacos extends ParteDeCimaECorpoInteiro {

	protected ComprimentoCasaco comprimentoCasaco;

	public Casacos(CasacosBuilder builder) {
		this.nome = builder.nome;
		this.tamanho = builder.tamanho;
		this.genero = builder.genero;
		this.cor = builder.cor;
		this.modelagem = builder.modelagem;
		this.tecidos = builder.tecidos;
		this.temEstampa = builder.temEstampa;
		this.temBordado = builder.temBordado;
		this.tipoDeRoupa = builder.tipoDeRoupa;
		this.manga = builder.manga;
		this.decote = builder.decote;
		this.cava = builder.cava;
		this.capuz = builder.capuz;
		this.comprimentoCasaco = builder.comprimentoCasaco;
	}

	public static class CasacosBuilder {
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_CIMA;
		protected Integer tamanho;
		protected Genero genero;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected Manga manga;
		protected Decote decote;
		protected Cava cava;
		protected Boolean capuz;

		protected ComprimentoCasaco comprimentoCasaco;

		public CasacosBuilder comprimentoCasaco(ComprimentoCasaco comprimentoCasaco) {
			this.comprimentoCasaco = comprimentoCasaco;
			return this;
		}

		public CasacosBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public CasacosBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public CasacosBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public CasacosBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public CasacosBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public CasacosBuilder tecido(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		public CasacosBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}

		public CasacosBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public CasacosBuilder manga(Manga manga) {

			this.manga = manga;
			return this;
		}

		public CasacosBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}

		public CasacosBuilder cava(Cava cava) {
			this.cava = cava;
			return this;
		}

		public CasacosBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}


		public Casacos build() {

			return new Casacos(this);
		}

	}

	@Override
	public String toString() {
		return  "\n\n" + this.costurando() + "\nPEÇA CRIADA! "
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase()
				+ " Comprimento: " + this.comprimentoCasaco 
				+ " Tamanho: " + this.tamanho 
				+ " Grupo: " + this.genero  
				+ " Cor: " + this.cor.toUpperCase() 
				+ " / Tecido: " + this.tecidos + "/"
				+ " / Modelagem: " + this.modelagem 
				+ "  Manga: " + this.manga 
				+ "  Cava: " + this.cava 
				+ "  Decote:  " + this.decote 
				+ "  Possui Capuz: " + this.capuz +"/";
	}

	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(comprimentoCasaco);
		return resultado;
	}

	@Override
	public boolean equals(Object outro) {
		if(outro == null) return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
	
		Casacos roupa = (Casacos) outro;
		return comprimentoCasaco == roupa.comprimentoCasaco
				&& capuz == roupa.capuz 
				&& cava == roupa.cava
				&& decote == roupa.decote 
				&& manga == roupa.manga
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
