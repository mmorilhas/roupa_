package roupa.modelo.tecido.fibra.artificial;

import roupa.modelo.tecido.fibra.FibraArtificial;
import roupa.modelo.tecido.fibra.SetPropriedadesFibraETecido;
import roupa.modelo.tecido.fibra.enumerators.AbsorcaoAguaFibra;
import roupa.modelo.tecido.fibra.enumerators.ComportamentoTermicoFibra;
import roupa.modelo.tecido.fibra.enumerators.ElasticidadeFibra;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.enumerators.ResistenciaFibra;
import roupa.modelo.tecido.fibra.enumerators.RespiravelFibra;
import roupa.modelo.tecido.fibra.enumerators.TempoDeSecagemFibra;

public class Modal extends FibraArtificial implements SetPropriedadesFibraETecido {
	
	// ou raion/rayon
	@Override
	public void setTodasAsPropriedades(){
		setNomeFibra();
		setTipoFibra();
		setTempoDeSecagem();
		setEhRespiravel();
		setAbsorcaoDeAgua();
		setResistencia();
		setComportamentoTermico();
		setElasticidade();
	}
	

	public void setNomeFibra() {
		super.nomeFibra = NomeFibra.MODAL;
	}

	@Override
	public void setTempoDeSecagem() {
		super.tempoDeSecagem = TempoDeSecagemFibra.SECA_RAPIDAMENTE;

	}

	@Override
	public void setEhRespiravel() {
		super.respiravel = RespiravelFibra.RESPIRAVEL;

	}

	@Override
	public void setAbsorcaoDeAgua() {
		super.absorcaoDeAgua = AbsorcaoAguaFibra.HIDROFOBICO;

	}

	@Override
	public void setResistencia() {
		super.resistencia = ResistenciaFibra.MUITO_RESISTENTE;

	}

	@Override
	public void setComportamentoTermico() {
		super.comportamentoTermico = ComportamentoTermicoFibra.BOA_REGULACAO_DE_CALOR;

	}

	@Override
	public void setElasticidade() {
		super.elasticidade = ElasticidadeFibra.ALTA_ELASTICIDADE;

	}
	
	


}
