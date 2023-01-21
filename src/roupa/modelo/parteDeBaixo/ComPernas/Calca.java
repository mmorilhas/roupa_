package roupa.modelo.parteDeBaixo.ComPernas;

import java.util.Collection;

import roupa.modelo.Aviamento;
import roupa.modelo.Genero;
import roupa.modelo.GrupoEtario;
import roupa.modelo.TipoDeRoupa;
import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.parteDeBaixo.InferiorComPernas;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.ComprimentoDeCalca;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.GanchoTipos;
import roupa.modelo.parteDeBaixo.ComPernas.enumerators.PunhoCalca;
import roupa.modelo.parteDeBaixo.enumerators.Cintura;
import roupa.modelo.tecido.Tecido;

public class Calca extends InferiorComPernas {

	protected ComprimentoDeCalca comprimentoCalca;

	public Calca(CalcaBuilder builder) {
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
		this.punhoCalca = builder.punhoCalca;
		this.gancho = builder.gancho;
		this.comprimentoCalca = builder.comprimentoCalca;
	}

	public static class CalcaBuilder {

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
		protected PunhoCalca punhoCalca;
		protected GanchoTipos gancho;
		protected ComprimentoDeCalca comprimentoCalca;

		public CalcaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public CalcaBuilder tamanho(Integer tamanho) {
			this.tamanho = tamanho;
			return this;
		}

		public CalcaBuilder genero(Genero genero) {
			this.genero = genero;
			return this;
		}

		public CalcaBuilder grupoEtario(GrupoEtario grupoEtario) {
			this.grupoEtario = grupoEtario;
			return this;
		}

		public CalcaBuilder cor(String cor) {
			this.cor = cor;
			return this;
		}

		public CalcaBuilder modelagem(Modelagem modelagem) {
			this.modelagem = modelagem;
			return this;
		}

		public CalcaBuilder tecidos(Tecido tecidos) {
			this.tecidos = tecidos;
			return this;
		}

		public CalcaBuilder aviamento(String[] aviamentos) {
			this.aviamentos = aviamentos;
			return this;
		}

		public CalcaBuilder temEstampa(Boolean temEstampa) {
			this.temEstampa = temEstampa;
			return this;
		}

		public CalcaBuilder temBordado(Boolean temBordado) {
			this.temBordado = temBordado;
			return this;
		}

		public CalcaBuilder cintura(Cintura cintura) {
			this.cintura = cintura;
			return this;
		}

		public CalcaBuilder punhoCalca(PunhoCalca punhoCalca) {
			this.punhoCalca = punhoCalca;
			return this;
		}

		public CalcaBuilder gancho(GanchoTipos gancho) {
			this.gancho = gancho;
			return this;
		}

		public CalcaBuilder comprimentoCalca(ComprimentoDeCalca comprimentoCalca) {
			this.comprimentoCalca = comprimentoCalca;
			return this;
		}

		public Calca build() {
			return new Calca(this);
		}

	}

	@Override
	public String toString() {
		return "\nPEÇA CRIADA! \n" 
				+ this.tipoDeRoupa + " ---> " + this.nome
				+  "\nComprimento: " + this.comprimentoCalca + " " + this.cintura 
				+ "\nTamanho: " + this.tamanho 
				+ "\nGrupo: " + this.genero + " " + this.grupoEtario 
				+ "\nCor: " + this.cor 
				+ "\n\nDe tecido: " + this.tecidos 
				+ "\nDe Modelagem: " + this.modelagem 
				+ "\n      Gancho: " + this.gancho 
				+ "\n      Punho: " + this.punhoCalca;

	}

}
