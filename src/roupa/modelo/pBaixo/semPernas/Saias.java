package roupa.modelo.pBaixo.semPernas;


import java.util.Objects;

import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.pBaixo.ParteDeBaixo;
import roupa.modelo.pBaixo.enumerators.Cintura;
import roupa.modelo.pBaixo.enumerators.ComprimentoDeSaia;
import roupa.modelo.tecido.Tecido;

public class Saias  extends ParteDeBaixo{

	protected ComprimentoDeSaia comprimentoDeSaia;
	
	public Saias(SaiasBuilder builder) {
		this.nome = builder.nome;
		this.tamanho = builder.tamanho;
		this.genero = builder.genero;
		this.cor = builder.cor;
		this.modelagem = builder.modelagem;
		this.tecidos = builder.tecidos;
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
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
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
		return "\n\n" + this.costurando() + "\nPEÇA CRIADA! "
				+ this.tipoDeRoupa + " ---> " + this.nome.toUpperCase()
				+ " Comprimento: " +  this.comprimentoDeSaia 
				+ " Cintura:  " + this.cintura 
				+ " Tamanho: " + this.tamanho  
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase()
				+ " / Tecido: "	+ this.tecidos + "/" 
				+ " / Modelagem: " + this.modelagem+ "/"; 
				
				
				
	}


	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(comprimentoDeSaia);
		return resultado;
	}



	@Override
	public boolean equals(Object outro) {
		if(outro == null)return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Saias roupa = (Saias) outro;
		return comprimentoDeSaia == roupa.comprimentoDeSaia && cintura == roupa.cintura
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
