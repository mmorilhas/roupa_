package roupa.modelo.pCimaECorpoInteiro.pCima;

import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.ComprimentoBlusa;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
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
		return "\n\n"  + this.costurando() + "\nPEÇA CRIADA! " 
				+ this.tipoDeRoupa + " ---> " 
				+ this.nome.toUpperCase() 
				+ " Tamanho: " + this.tamanho 
				+ " Comprimento: " + this.comprimentoBlusa 
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: "	+ this.tecidos+ "/" 
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
		resultado = primo * resultado + Objects.hash(comprimentoBlusa);
		return resultado;
	}
	
	@Override
	public boolean equals(Object outro) {
		if(outro == null) return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Blusa roupa = (Blusa) outro;
		return comprimentoBlusa == roupa.comprimentoBlusa 
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
