package roupa.modelo.parteDeBaixo.SemPernas;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteDeBaixo.ParteDeBaixo;
import roupa.modelo.parteDeBaixo.enumerators.Cintura;
import roupa.modelo.parteDeBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.tecido.Tecido;

public class Saias  extends ParteDeBaixo{

	protected ComprimentoDeSaia comprimentoDeSaia;
	
	public Saias(SaiasBuilder builder) {
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
		this.cintura = builder.cintura;
		this.comprimentoDeSaia = builder.comprimentoDeSaia;
	}
	
	public static class SaiasBuilder{
		
		protected String nome;
		protected final TipoDeRoupa tipoDeRoupa = TipoDeRoupa.PARTE_DE_BAIXO;
		protected Integer tamanho;
		protected Genero genero;
		protected GrupoEtario grupoEtario;
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected String[] aviamentos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected Cintura cintura;
		protected ComprimentoDeSaia comprimentoDeSaia;
		
		
		public SaiasBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public SaiasBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public SaiasBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		public SaiasBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}
		
		public SaiasBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public SaiasBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public SaiasBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public SaiasBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}
		public SaiasBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public SaiasBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public SaiasBuilder cintura(Cintura cintura) {
			this.cintura = cintura;
			return this;
		}
		public SaiasBuilder comprimentoDeSaia(ComprimentoDeSaia comprimentoDeSaia) {
			this.comprimentoDeSaia = comprimentoDeSaia;
			return this;
		}
		
		
		
		public Saias build() {
			return new Saias(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" + this.tipoDeRoupa + " ---> " + this.nome + "\nComprimento: " +  this.comprimentoDeSaia + "\nCintura:  " + this.cintura + "\nTamanho: " + this.tamanho  
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem; 
				
				
				
	}
}
