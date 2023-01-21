package roupa.modelo.tecido.fibra;

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

	

	
}
