package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;
import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
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
		this.comprimentoBustie = builder.comprimentoBustie;
		
	}

	public static class BustieBuilder {

		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_CIMA;
		protected Integer tamanho;
		protected Genero genero;
		protected GrupoEtario grupoEtario;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected String[] aviamentos;
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

		public BustieBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
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

		public BustieBuilder aviamentos(String[] aviamentos) {
			this.aviamentos = aviamentos;
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
		return "\nPeça criada! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nTamanho: " + this.tamanho + "\nComprimento: " + this.comprimentoBustie 
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
				+ "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}

	
}
