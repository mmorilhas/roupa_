package roupa.modelo.pCimaECorpoInteiro.pCima;

import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBustie;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;


public class Bustie extends ParteDeCimaECorpoInteiro{

	ComprimentoBustie comprimentoBustie;
	
	
	public Bustie(BustieBuilder builder) {
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
		this.comprimentoBustie = builder.comprimentoBustie;
		
	}

	public static class BustieBuilder {

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
		protected ComprimentoBustie comprimentoBustie;


		public BustieBuilder comprimentoBustie(ComprimentoBustie comprimentoBustie) {
			this.comprimentoBustie = comprimentoBustie;
			return this;
		}

		public BustieBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		

		public BustieBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public BustieBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public BustieBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public BustieBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public BustieBuilder tecido(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		public BustieBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		
		public BustieBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public BustieBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}
		
		public BustieBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}
		
		public BustieBuilder cava(Cava cava) {
			this.cava = cava;
			return this;
		}


		public BustieBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}

		public Bustie build() {

			return new Bustie(this);
		}

	}




	@Override
	public String toString() {
		return "\n\n"  + this.costurando() + "\nPEÇA CRIADA! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase() 
				+ " Tamanho: " + this.tamanho 
				+ " Comprimento: " + this.comprimentoBustie 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: " + this.tecidos + "/"
				+ " / Modelagem: " + this.modelagem 
				+ "  Manga: " + this.manga 
				+ "  Cava: " + this.cava 
				+ "  Decote:  " + this.decote
				+ "  Possui Capuz: " + this.capuz+"/";
	}



	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(comprimentoBustie);
		return resultado;
	}




	@Override
	public boolean equals(Object outro) {
		if(outro == null) return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Bustie roupa = (Bustie) outro;
		return comprimentoBustie == roupa.comprimentoBustie
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
