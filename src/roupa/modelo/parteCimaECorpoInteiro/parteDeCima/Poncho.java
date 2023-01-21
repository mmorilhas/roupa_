package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoPoncho;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;


//DECOTE != DE TOMARA QUE CAIA
//DECOTE != DE COLARINHO???

public class Poncho extends ParteDeCimaECorpoInteiro{

	ComprimentoPoncho comprimentoPoncho;
	
	public Poncho(PonchoBuilder builder) {
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
		this.comprimentoPoncho = builder.comprimentoPoncho;
		
	}

	public static class PonchoBuilder {

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
		protected final Manga manga = Manga.SEM_MANGA;
		protected Decote decote;
		protected final Cava cava = Cava.SEM_CAVA;
		protected Boolean capuz;
		protected Boolean capa;
		protected String[] aviamentos;
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

		public PonchoBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
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

		public PonchoBuilder aviamentos(String[] aviamentos) {
			this.aviamentos = aviamentos;
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
		return "\nPeça criada! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nTamanho: " + this.tamanho + "\nComprimento: " + this.comprimentoPoncho 
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
			 + "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}

}
