package roupa.modelo.tecido.fibra;

import java.util.Objects;
import roupa.modelo.tecido.fibra.enumerators.AbsorcaoAguaFibra;
import roupa.modelo.tecido.fibra.enumerators.ComportamentoTermicoFibra;
import roupa.modelo.tecido.fibra.enumerators.ElasticidadeFibra;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.enumerators.ResistenciaFibra;
import roupa.modelo.tecido.fibra.enumerators.RespiravelFibra;
import roupa.modelo.tecido.fibra.enumerators.TempoDeSecagemFibra;
import roupa.modelo.tecido.fibra.enumerators.TipoFibra;

public abstract class Fibra{
	protected NomeFibra nomeFibra;
	protected TipoFibra tipoFibra;
	protected TempoDeSecagemFibra tempoDeSecagem;
	protected RespiravelFibra respiravel;
	protected AbsorcaoAguaFibra absorcaoDeAgua;
	protected ElasticidadeFibra elasticidade;
	protected ComportamentoTermicoFibra comportamentoTermico;
	protected ResistenciaFibra resistencia;

	
	public NomeFibra getNomeFibra() {
		return nomeFibra;
	}
	public TipoFibra getTipoFibra() {
		return tipoFibra;
	}
	public TempoDeSecagemFibra getTempoDeSecagem() {
		return tempoDeSecagem;
	}
	public RespiravelFibra getRespiravel() {
		return respiravel;
	}
	public AbsorcaoAguaFibra getAbsorcaoDeAgua() {
		return absorcaoDeAgua;
	}
	public ElasticidadeFibra getElasticidade() {
		return elasticidade;
	}
	public ComportamentoTermicoFibra getComportamentoTermico() {
		return comportamentoTermico;
	}
	public ResistenciaFibra getResistencia() {
		return resistencia;
	}
	
	public void setTodasAsPropriedades() {}
		

	
	@Override
	public int hashCode() {
		return Objects.hash(absorcaoDeAgua, comportamentoTermico, elasticidade, nomeFibra, resistencia, respiravel,
				tempoDeSecagem, tipoFibra);
	}
	@Override
	public boolean equals(Object outro) {
		if(outro == null) return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
	
		Fibra fibra = (Fibra) outro;
		return absorcaoDeAgua == fibra.absorcaoDeAgua && comportamentoTermico == fibra.comportamentoTermico
				&& elasticidade == fibra.elasticidade && nomeFibra == fibra.nomeFibra
				&& resistencia == fibra.resistencia && respiravel == fibra.respiravel
				&& tempoDeSecagem == fibra.tempoDeSecagem && tipoFibra == fibra.tipoFibra;
	}

	public String fiando( ) {
				
		return "fiando..... Fibra pronta para Tecelagem! ";
	}
	
	
	@Override
	public String toString() {
		
		return this.fiando()+ "\nFibra: " + this.getNomeFibra() + "   Tipo: " + this.getTipoFibra() + "\nPropriedades: "  + this.getAbsorcaoDeAgua() + ", " + this.getTempoDeSecagem()  + ", " + this.getRespiravel()  + ", " + this.getResistencia() + ", " + this.getComportamentoTermico()  + " e " + this.getElasticidade() + "\n";
	}

	

	

	
}
