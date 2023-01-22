package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela;


import java.util.Objects;

import roupa.modelo.Genero;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaComLapela;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoCasaco;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Lapela;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;


public class Casacos extends ParteDeCimaComLapela {

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
		this.lapela = builder.lapela;
		this.cava = builder.cava;
		this.capuz = builder.capuz;
		this.capa = builder.capa;
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
		protected Lapela lapela;
		protected Cava cava;
		protected Boolean capuz;
		protected Boolean capa;

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

		public CasacosBuilder lapela(Lapela lapela) {
			this.lapela = lapela;
			return this;
		}

		public CasacosBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}

		public CasacosBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		public Casacos build() {

			return new Casacos(this);
		}

	}

	@Override
	public String toString() {
		return  "\nPeça criada! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase()
				+ " Comprimento: " + this.comprimentoCasaco 
				+ " Tamanho: " + this.tamanho 
				+ " Grupo: " + this.genero  
				+ " Cor: " + this.cor.toUpperCase() 
				+ " Tecido: " + this.tecidos 
				+ " Modelagem: " + this.modelagem 
				+ "      Manga: " + this.manga 
				+ "      Cava: " + this.cava 
				+ "      Decote:  " + this.decote + " " +this.lapela
				+ "      Possui Capuz: " + this.capuz 
				+ "      Possui Capa:  " + this.capa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(comprimentoCasaco);
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
		Casacos other = (Casacos) obj;
		return comprimentoCasaco == other.comprimentoCasaco;
	}
	
	

}
