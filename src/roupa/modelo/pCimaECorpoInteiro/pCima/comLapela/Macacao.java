package roupa.modelo.pCimaECorpoInteiro.pCima.comLapela;


import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeCalca;
import roupa.modelo.pBaixo.enumerators.GanchoTipos;
import roupa.modelo.pBaixo.enumerators.PunhoCalca;
import roupa.modelo.pCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;
import roupa.modelo.tecido.Tecido;

public class Macacao extends ParteDeCimaECorpoInteiro{
	
	protected PunhoCalca punhoCalca;
	protected GanchoTipos ganchoTipos;
	protected ComprimentoDeCalca comprimentoMacacao;
	
	
	public Macacao(MacacaoBuilder builder) {
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
		this.comprimentoMacacao = builder.comprimentoMacacao;
		this.ganchoTipos = builder.ganchoTipos;
		this.punhoCalca = builder.punhoCalca;
	}
	
	public static class MacacaoBuilder{
		
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.CORPO_INTEIRO;
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
		protected ComprimentoDeCalca comprimentoMacacao;
		protected PunhoCalca punhoCalca;
		protected GanchoTipos ganchoTipos;
		
		
		public MacacaoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public MacacaoBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public MacacaoBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		public MacacaoBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public MacacaoBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public MacacaoBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public MacacaoBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public MacacaoBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public MacacaoBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}
		public MacacaoBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}
		public MacacaoBuilder cava(Cava cava) {
			this.cava = cava;
			return this;
		}
		
		public MacacaoBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}
		
		public MacacaoBuilder comprimentoMacacao(ComprimentoDeCalca comprimentoMacacao) {
			this.comprimentoMacacao = comprimentoMacacao;
			return this;
		}
		
		public MacacaoBuilder punhoCalca(PunhoCalca punhoCalca) {
			this.punhoCalca = punhoCalca;
			return this;
		}
		public MacacaoBuilder ganchoTipo(GanchoTipos ganchoTipos) {
			this.ganchoTipos = ganchoTipos;
			return this;
		}
		
		public Macacao build() {
			return new Macacao(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return  
				"\n\n" + this.costurando() + "\nPEÇA CRIADA! "
				+ this.tipoDeRoupa + " ---> " + this.nome.toUpperCase()
				+ " Comprimento: " + this.comprimentoMacacao 
				+ " Tamanho: " + this.tamanho  
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: "	+ this.tecidos + "/"
				+ " / Modelagem: " + this.modelagem 
				+ "  Manga: "	+ this.manga 
				+ "  Cava: " + this.cava 
				+ "  Decote:  " + this.decote
				+ "  Gancho: " + this.ganchoTipos
				+ "  Punho: " + this.punhoCalca
				+ "  Possui Capuz: " + this.capuz+"/";
				
	}


	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(comprimentoMacacao, ganchoTipos, punhoCalca);
		return resultado;
	}


	@Override
	public boolean equals(Object outro) {
		if(outro == null) return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Macacao roupa = (Macacao) outro;
		return comprimentoMacacao == roupa.comprimentoMacacao && ganchoTipos == roupa.ganchoTipos
				&& punhoCalca == roupa.punhoCalca
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
