package roupa.modelo.parteDeBaixo.SemPernas;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteDeBaixo.ParteDeBaixo;
import roupa.modelo.parteDeBaixo.enumerators.CalcolaTipos;
import roupa.modelo.parteDeBaixo.enumerators.Cintura;
import roupa.modelo.tecido.Tecido;

public class Calcolas extends ParteDeBaixo{

	protected CalcolaTipos calcolaTipos;
	
	
	public Calcolas(CalcolasBuilder builder) {
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
		this.calcolaTipos = builder.calcolaTipos;
	}
	
	public static class CalcolasBuilder{
		
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
		protected CalcolaTipos calcolaTipos;
		
		
		public CalcolasBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public CalcolasBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public CalcolasBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		public CalcolasBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}
		
		public CalcolasBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public CalcolasBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public CalcolasBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public CalcolasBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}
		public CalcolasBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public CalcolasBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public CalcolasBuilder cintura(Cintura cintura) {
			this.cintura = cintura;
			return this;
		}
		public CalcolasBuilder calcolaTipo(CalcolaTipos calcolaTipos) {
			this.calcolaTipos = calcolaTipos;
			return this;
		}
		
		
		
		public Calcolas build() {
			return new Calcolas(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " +  this.calcolaTipos + " " + this.cintura + "\nTamanho: " + this.tamanho  
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem; 
				
				
				
	}
	
}
