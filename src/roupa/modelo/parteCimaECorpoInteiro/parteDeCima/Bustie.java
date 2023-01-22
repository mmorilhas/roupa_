package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;

import java.util.Objects;

import roupa.modelo.Genero;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoBustie;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
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
		this.capa = builder.capa;
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
		protected Boolean capa;
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

		public BustieBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		public Bustie build() {

			return new Bustie(this);
		}

	}




	@Override
	public String toString() {
		return "\nPEÇA CRIADA! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase() 
				+ " Tamanho: " + this.tamanho 
				+ " Comprimento: " + this.comprimentoBustie 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " Tecido: " + this.tecidos 
				+ " Modelagem: " + this.modelagem 
				+ "      Manga: " + this.manga 
				+ "      Cava: " + this.cava 
				+ "      Decote:  " + this.decote
				+ "      Possui Capuz: " + this.capuz
				+ "      Possui Capa:  " + this.capa;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(comprimentoBustie);
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bustie other = (Bustie) obj;
		return comprimentoBustie == other.comprimentoBustie;
	}
	
	

	
}
