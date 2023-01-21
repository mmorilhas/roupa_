package roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;
import roupa.modelo.parteDeBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.tecido.Tecido;

public class Vestido extends ParteDeCimaECorpoInteiro{

	protected ComprimentoDeSaia comprimentoVestido;
	
	public Vestido(VestidoBuilder builder) {
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
		this.comprimentoVestido = builder.comprimentoVestido;
	}
	
	public static class VestidoBuilder{
		
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
		protected ComprimentoDeSaia comprimentoVestido;
		
		
		public VestidoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public VestidoBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public VestidoBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		public VestidoBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}
		
		public VestidoBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public VestidoBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public VestidoBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public VestidoBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}
		public VestidoBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public VestidoBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public VestidoBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}
		public VestidoBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}
		public VestidoBuilder cava(Cava cava) {
			this.cava = cava;
			return this;
		}
		public VestidoBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}
		public VestidoBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}

		
		public VestidoBuilder bodyCalcolaTipo(ComprimentoDeSaia comprimentoVestido) {
			this.comprimentoVestido = comprimentoVestido;
			return this;
		}
		
		public Vestido build() {
			return new Vestido(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + "\nComprimento: " + this.comprimentoVestido + "\nTamanho: " + this.tamanho  
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
				+ "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}

	
	
}
