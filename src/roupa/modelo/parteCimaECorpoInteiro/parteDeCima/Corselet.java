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
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoCorselet;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;

public class Corselet extends ParteDeCimaECorpoInteiro {

	ComprimentoCorselet comprimentoCorselet;
	
	public Corselet(CorseletBuilder builder) {
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
		//this.colarinho = builder.colarinho;
		this.cava = builder.cava;
		this.capuz = builder.capuz;
		this.capa = builder.capa;
		this.comprimentoCorselet = builder.comprimentoCorselet;
		
	}

	public static class CorseletBuilder {

		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_CIMA;
		protected Integer tamanho;
		protected Genero genero;
		protected GrupoEtario grupoEtario;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected Manga manga;
		protected final Decote decote = Decote.TOMARA_QUE_CAIA;
		protected final Cava cava = Cava.SEM_CAVA;
		protected Boolean capuz;
		protected Boolean capa;
		protected ComprimentoBlusa comprimentoBlusa;
		protected String[] aviamentos;

		protected ComprimentoCorselet comprimentoCorselet;

		public CorseletBuilder comprimentoCorselet(ComprimentoCorselet comprimentoCorselet) {
			this.comprimentoCorselet = comprimentoCorselet;
			return this;
		}

		public CorseletBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		

		public CorseletBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public CorseletBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public CorseletBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}

		public CorseletBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public CorseletBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public CorseletBuilder tecido(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		public CorseletBuilder aviamentos(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}
		
		public CorseletBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		
		public CorseletBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public CorseletBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}


		public CorseletBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}

		public CorseletBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		public Corselet build() {

			return new Corselet(this);
		}

	}




	@Override
	public String toString() {
		return "\nPeça criada! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nTamanho: " + this.tamanho + "\nComprimento: " + this.comprimentoCorselet 
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
			 + "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}

	
}
