package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;


import java.util.Objects;

import roupa.modelo.Genero;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoPoncho;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;

public class Poncho extends ParteDeCimaECorpoInteiro{

	ComprimentoPoncho comprimentoPoncho;
	
	public Poncho(PonchoBuilder builder) {
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
		this.comprimentoPoncho = builder.comprimentoPoncho;
		
	}

	public static class PonchoBuilder {

		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_CIMA;
		protected Integer tamanho;
		protected Genero genero;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected final Manga manga = Manga.SEM_MANGA;
		protected Decote decote;
		protected final Cava cava = Cava.SEM_CAVA;
		protected Boolean capuz;
		protected Boolean capa;
		protected ComprimentoPoncho comprimentoPoncho;


		public PonchoBuilder comprimentoPoncho(ComprimentoPoncho comprimentoPoncho) {
			this.comprimentoPoncho = comprimentoPoncho;
			return this;
		}

		public PonchoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		

		public PonchoBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public PonchoBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public PonchoBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public PonchoBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public PonchoBuilder tecido(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		
		public PonchoBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		
		public PonchoBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public PonchoBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}

		public PonchoBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}

		public PonchoBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		public Poncho build() {

			return new Poncho(this);
		}

	}
	
	public String toString() {
		return "\nPeça criada! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase()
				+ " Tamanho: " + this.tamanho 
				+ " Comprimento: " + this.comprimentoPoncho 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " De tecido: "	+ this.tecidos 
				+ " De Modelagem: " + this.modelagem 
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
		result = prime * result + Objects.hash(comprimentoPoncho);
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
		Poncho other = (Poncho) obj;
		return comprimentoPoncho == other.comprimentoPoncho;
	}
	
	

}
