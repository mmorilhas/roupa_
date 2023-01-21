package roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaECorpoInteiro;
import roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro.enumerators.BodyTipos;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.*;
import roupa.modelo.parteDeBaixo.enumerators.CalcolaTipos;
import roupa.modelo.tecido.Tecido;

public class Body extends ParteDeCimaECorpoInteiro{

	BodyTipos bodyTipo;
	CalcolaTipos bodyCalcolaTipo;
	
	public Body(BodyBuilder builder) {
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
		this.bodyTipo = builder.bodyTipo;
		this.bodyCalcolaTipo = builder.bodyCalcolaTipo;
	}
	
	public static class BodyBuilder{
		
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
		protected BodyTipos bodyTipo;
		protected CalcolaTipos bodyCalcolaTipo;
		
		
		public BodyBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public BodyBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}
		
		public BodyBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}
		public BodyBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}
		
		public BodyBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}
		public BodyBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}
		public BodyBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}
		public BodyBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}
		public BodyBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}
		public BodyBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}
		public BodyBuilder manga(Manga manga) {
			this.manga = manga;
			return this;
		}
		public BodyBuilder decote(Decote decote) {
			this.decote = decote;
			return this;
		}
		public BodyBuilder cava(Cava cava) {
			this.cava = cava;
			return this;
		}
		public BodyBuilder capuz(Boolean capuz) {
			this.capuz = capuz;
			return this;
		}
		public BodyBuilder capa(Boolean capa) {
			this.capa = capa;
			return this;
		}
		public BodyBuilder bodyTipo(BodyTipos bodyTipo) {
			this.bodyTipo = bodyTipo;
			return this;
		}
		
		public BodyBuilder bodyCalcolaTipo(CalcolaTipos bodyCalcolaTipo) {
			this.bodyCalcolaTipo = bodyCalcolaTipo;
			return this;
		}
		
		public Body build() {
			return new Body(this);
		}
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" + this.tipoDeRoupa + " ---> " + this.nome + " " + this.bodyTipo + "" + this.bodyCalcolaTipo + "\nTamanho: " + this.tamanho  
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario + "\nCor: " + this.cor + "\n\nDe tecido: "
				+ this.tecidos + "\nDe Modelagem: " + this.modelagem + "\n      Manga: " + " " 
				+ this.manga + " " + "\n      Cava: " + this.cava + "\n      Decote:  " + this.decote
				+ "\n      Possui Capuz: " + this.capuz
				+ "\n      Possui Capa:  " + this.capa;
	}

	
	


	




}
