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
	
	public void setTodasAsPropriedades() {
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(absorcaoDeAgua, comportamentoTermico, elasticidade, nomeFibra, resistencia, respiravel,
				tempoDeSecagem, tipoFibra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fibra other = (Fibra) obj;
		return absorcaoDeAgua == other.absorcaoDeAgua && comportamentoTermico == other.comportamentoTermico
				&& elasticidade == other.elasticidade && nomeFibra == other.nomeFibra
				&& resistencia == other.resistencia && respiravel == other.respiravel
				&& tempoDeSecagem == other.tempoDeSecagem && tipoFibra == other.tipoFibra;
	}

	
	
	

	

	
}
