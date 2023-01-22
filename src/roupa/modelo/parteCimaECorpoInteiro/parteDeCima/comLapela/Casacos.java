package roupa.modelo.parteCimaECorpoInteiro.parteDeCima;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaComLapela;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.ComprimentoCasaco;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Lapela;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;

//SE LAPELA NÃO TEM DECOTE 
//ADD TO STRINg LAPELA
//MANGA NÃO PODE SER REGATA
//DECOTE NÃO PODE SER TOMARA QUE CAIA

public class Casacos extends ParteDeCimaComLapela {
	
	protected ComprimentoCasaco comprimentoCasaco;

	
	public Casacos(CasacosBuilder builder) {
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
		this.comprimentoCasaco = builder.comprimentoCasaco;
	}

	public static class CasacosBuilder {
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
		//protected Colarinho colarinho;
		protected Lapela lapela;
		protected Cava cava;
		protected Boolean capuz;
		protected Boolean capa;

		protected ComprimentoCasaco comprimentoCasaco;

		public CasacosBuilder comprimentoCasaco(ComprimentoCasaco comprimentoCasaco) {
			this.comprimentoCasaco= comprimentoCasaco;
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

		public CasacosBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
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

		public CasacosBuilder aviamentos(String[] aviamentos) {
			this.aviamentos = aviamentos;
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

			if(manga != Manga.REGATA_ALCINHA || manga != Manga.REGATA_MUSCLETEE) {
				this.manga = manga;
			
			}
			
			return this;
		}


		
		  public CasacosBuilder decote(Decote decote) { this.decote = decote; return this; }
		 

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
		return 
				this.seTomaraQueCaia() + "\nPeça criada! \n" +this.tipoDeRoupa + " ---> " + this.nome +  " " + this.comprimentoCasaco + "\nTamanho: " + this.tamanho + "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\nDe tecido: " + this.tecidos + "\nDe Modelagem: " + this.modelagem + "\nManga: " + " " + this.manga + "\nCava: " + this.cava +"\nDecote:  " + this.decote  + "\nPossui Capuz: " + this.capuz + "\nPossui Capa:  " + this.capa;  
	}

	//public void seSemManga() throws Exception {
	//	if(comprimentoManga == comprimentoManga.SEM_MANGA) {
//			throw exception
//		}
//		return this;
//	}



	
	
}
