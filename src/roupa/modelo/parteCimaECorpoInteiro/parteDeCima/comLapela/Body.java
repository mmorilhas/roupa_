package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.comLapela;


import java.util.Objects;

import roupa.modelo.Genero;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteCimaECorpoInteiro.ParteDeCimaComLapela;
import roupa.modelo.parteCimaECorpoInteiro.CorpoInteiro.enumerators.BodyTipos;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.*;
import roupa.modelo.parteDeBaixo.enumerators.CalcolaTipos;
import roupa.modelo.tecido.Tecido;

public class Body extends ParteDeCimaComLapela{

	BodyTipos bodyTipo;
	CalcolaTipos bodyCalcolaTipo;
	
	public Body(BodyBuilder builder) {
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
		this.lapela = builder.lapela;
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
		protected String cor;
		protected Modelagem modelagem;
		protected Tecido tecidos;
		protected Boolean temEstampa;
		protected Boolean temBordado;
		protected Manga manga;
		protected Decote decote;
		protected Cava cava;
		protected Lapela lapela;
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
		
		public BodyBuilder lapela(Lapela lapela) {
			this.lapela = lapela;
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
		return "\nPEÇA CRIADA! " 
				+ this.tipoDeRoupa + " ---> " + this.nome.toUpperCase() 
				+ " " + this.bodyTipo + " " + this.bodyCalcolaTipo 
				+ " Tamanho: " + this.tamanho  
				+ " Grupo: " + this.genero 
				+ " Cor: " + this.cor.toUpperCase() 
				+ " Tecido: "	+ this.tecidos 
				+ " Modelagem: " + this.modelagem 
				+ "      Manga: " + this.manga 
				+ "      Cava: " + this.cava 
				+ "      Decote:  " + this.decote
				+ "      Possui Capuz: " + this.capuz
				+ "      Possui Capa:  " + this.capa;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bodyCalcolaTipo, bodyTipo);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Body other = (Body) obj;
		return bodyCalcolaTipo == other.bodyCalcolaTipo && bodyTipo == other.bodyTipo;
	}

	
	


	




}
