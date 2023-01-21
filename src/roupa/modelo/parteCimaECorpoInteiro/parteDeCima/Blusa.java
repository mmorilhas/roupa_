package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
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
		this.grupoEtario = builder.grupoEtario;
		this.cor = builder.cor;
		this.modelagem = builder.modelagem;
		this.tecidos = builder.tecidos;
		this.aviamentos = builder.aviamentos;
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
		protected GrupoEtario grupoEtario;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected String[] aviamentos;
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

		public BlusaBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
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

		public BlusaBuilder aviamentos(String[] aviamentos) {
			this.aviamentos = aviamentos;
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
		return "\nPeça criada! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nTamanho: " + this.tamanho + "\nComprimento: " + this.comprimentoBlusa 
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
				+  "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}


}
