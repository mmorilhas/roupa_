package roupa.modelo.tecido.fibra.natural;

import roupa.modelo.tecido.fibra.FibraNatural;
import roupa.modelo.tecido.fibra.SetPropriedadesFibraETecido;
import roupa.modelo.tecido.fibra.enumerators.AbsorcaoAguaFibra;
import roupa.modelo.tecido.fibra.enumerators.ComportamentoTermicoFibra;
import roupa.modelo.tecido.fibra.enumerators.ElasticidadeFibra;
import roupa.modelo.tecido.fibra.enumerators.NomeFibra;
import roupa.modelo.tecido.fibra.enumerators.ResistenciaFibra;
import roupa.modelo.tecido.fibra.enumerators.RespiravelFibra;
import roupa.modelo.tecido.fibra.enumerators.TempoDeSecagemFibra;

public class Algodao extends FibraNatural implements SetPropriedadesFibraETecido{
	
	
	@Override
	public void setTodasAsPropriedades() {
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
		super.nomeFibra = NomeFibra.ALGODAO;
	}

	@Override
	public void setTempoDeSecagem() {
		super.tempoDeSecagem = TempoDeSecagemFibra.SECA_LENTAMENTE;

	}

	@Override
	public void setEhRespiravel() {
		super.respiravel = RespiravelFibra.RESPIRAVEL;

	}

	@Override
	public void setAbsorcaoDeAgua() {
		super.absorcaoDeAgua = AbsorcaoAguaFibra.HIDROFILICO;

	}

	@Override
	public void setResistencia() {
		super.resistencia = ResistenciaFibra.RESISTENTE;

	}

	@Override
	public void setComportamentoTermico() {
		super.comportamentoTermico = ComportamentoTermicoFibra.BOA_REGULACAO_DE_CALOR;
	}

	@Override
	public void setElasticidade() {
		super.elasticidade = ElasticidadeFibra.BAIXA_ELASTICIDADE;

	}
	
	@Override
	public String toString() {
		
		return 	
				
				"\nFibra: " + this.getNomeFibra() + "   Tipo: " + this.getTipoFibra() + "\nPropriedades: " + this.getAbsorcaoDeAgua() + ", " + this.getTempoDeSecagem()  + ", " + this.getRespiravel()  + ", " + this.getResistencia() + ", " + this.getComportamentoTermico()  + " e " + this.getElasticidade() + "\n";
	}
	


}
