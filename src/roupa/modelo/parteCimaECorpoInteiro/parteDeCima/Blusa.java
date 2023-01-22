package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;

import java.util.Objects;

import roupa.modelo.Genero;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoBlusa;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;

public class Blusa extends ParteDeCimaECorpoInteiro{

	ComprimentoBlusa  comprimentoBlusa;
	
	public Blusa(BlusaBuilder builder) {
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
		this.comprimentoBlusa = builder.comprimentoBlusa;
	}
	
	
	
	public static class BlusaBuilder {
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_CIMA;
		protected int tamanho;
		protected Genero genero;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected boolean temEstampa;
		protected boolean temBordado;
		protected Manga manga;
		protected Decote decote;
		protected Cava cava;
		protected boolean capuz;
		protected boolean capa;
		protected ComprimentoBlusa comprimentoBlusa;
		
		
		
		public BlusaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		

		public BlusaBuilder tamanho(int tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public BlusaBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public BlusaBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public BlusaBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public BlusaBuilder tecido(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		
		public BlusaBuilder temEstampa(boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		
		public BlusaBuilder temBordado(boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		
		public BlusaBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}
		
		public BlusaBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}
		
		
		public BlusaBuilder cava(Cava cava) {
			this.cava = cava;
			return this;

		}
		
		public BlusaBuilder capuz(boolean capuz) {
			this.capuz = capuz;
			return this;
		}
		
		public BlusaBuilder capa(boolean capa) {
			this.capa = capa;
			return this;
		}
		
		public BlusaBuilder comprimentoBlusa(ComprimentoBlusa comprimentoBlusa) {
			this.comprimentoBlusa = comprimentoBlusa;
			return this;
		}
		
		
	
		public Blusa build() {

			return new Blusa(this);
		}

	}

	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase() 
				+ " Tamanho: " + this.tamanho 
				+ " Comprimento: " + this.comprimentoBlusa 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " Tecido: "	+ this.tecidos 
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
		result = prime * result + Objects.hash(comprimentoBlusa);
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
		Blusa other = (Blusa) obj;
		return comprimentoBlusa == other.comprimentoBlusa;
	}
	
	


}
