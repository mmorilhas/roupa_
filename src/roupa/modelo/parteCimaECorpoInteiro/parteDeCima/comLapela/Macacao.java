package roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro.enumerators.MacacaoComprimento;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.GanchoTipos;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.PunhoCalca;
import roupa.modelo.tecido.Tecido;

public class Macacao extends ParteDeCimaECorpoInteiro{
	
	protected PunhoCalca punhoCalca;
	protected GanchoTipos ganchoTipos;
	protected MacacaoComprimento comprimentoMacacao;
	
	
	public Macacao(MacacaoBuilder builder) {
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
		this.comprimentoMacacao = builder.comprimentoMacacao;
		this.ganchoTipos = builder.ganchoTipos;
		this.punhoCalca = builder.punhoCalca;
	}
	
	public static class MacacaoBuilder{
		
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.CORPO_INTEIRO;
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
		protected MacacaoComprimento comprimentoMacacao;
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
		public MacacaoBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
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
		public MacacaoBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
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
		public MacacaoBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		
		public MacacaoBuilder comprimentoMacacao(MacacaoComprimento comprimentoMacacao) {
			this.comprimentoMacacao = comprimentoMacacao;
			return this;
		}
		
		public MacacaoBuilder punhoCalca(PunhoCalca punhoCalca) {
			this.punhoCalca = punhoCalca;
			return this;
		}
		public MacacaoBuilder comprimentoMacacao(GanchoTipos ganchoTipos) {
			this.ganchoTipos = ganchoTipos;
			return this;
		}
		
		public Macacao build() {
			return new Macacao(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nComprimento: " + this.comprimentoMacacao + "\nTamanho: " + this.tamanho  
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
				+ "\n      Gancho: " + this.ganchoTipos
				+ "\n      Punho: " + this.punhoCalca
				+ "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
				
				
	}
}
