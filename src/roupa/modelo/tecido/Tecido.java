package roupa.modelo.tecido;

import java.util.Collection;
import java.util.HashSet;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.SetPropriedadesFibraETecido;

public class Tecido implements SetPropriedadesFibraETecido {

	Collection<Fibra> composicao;
	protected Construcao construcao;
	protected String tipoDeTecido;
	protected String tempoSecagemTecido;
	protected String tecidoRespiravel;
	protected String absorcaoAguaTecido;
	protected String elasticidadeTecido;
	protected String comportamentoTermicoTecido;
	protected String resistenciaTecido;
	
	public Tecido(Collection<Fibra> composicao, Construcao construcao) {
		super();
		this.composicao = composicao;
		this.construcao = construcao;
	}

	public Collection<Fibra> getComposicao() {
		return composicao;
	}
	
	public Construcao getConstrucao() {
		return construcao;
	}
	
	public void setTipoDeTecido() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getTipoFibra().toString()));
		if (tecidos.size() > 1) {
			if (tecidos.contains("NATURAL") && tecidos.contains("ARTIFICIAL")
					|| tecidos.contains("NATURAL") && tecidos.contains("SINTETICA")) {
				tipoDeTecido = "Misto";
			} else {
				tipoDeTecido = "Sintético";
			}
		}else {
			if (tecidos.contains("NATURAL")) {
				tipoDeTecido = "Natural";
			} else {
				tipoDeTecido = "Sintético";
			}
		}

	}
	public String getTipoDeTecido() {
		return tipoDeTecido;
	}
	
	
	
	@Override
	public void setTodasPropriedadesDeUmaVez() {
		setTipoDeTecido();
		setTempoDeSecagem();
		setEhRespiravel();
		setAbsorcaoDeAgua();
		setElasticidade();
		setComportamentoTermico();
		setResistencia();
	}
	

	
	@Override
	public void setTempoDeSecagem() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getTempoDeSecagem().toString()));

		if (tecidos.size() > 1) {
			tempoSecagemTecido = "tempo de secagem mediano";
		} else {
			if (tecidos.contains("SECA_RAPIDAMENTE")) {
				tempoSecagemTecido = "secagem rápida";
			} else {
				tempoSecagemTecido = "secagem lenta";
			}
		}

	}
	

	public String getTempoSecagemTecido() {
		return tempoSecagemTecido;
	}


	@Override
	public void setEhRespiravel() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getRespiravel().toString()));

		if (tecidos.size() > 1) {
			tecidoRespiravel = "moderadamente respirável";
		}else {
			if (tecidos.contains("NAO_E_RESPIRAVEL")) {
				tecidoRespiravel = "não é respirável";
			} else {
				tecidoRespiravel = "é respirável";
			}
		}

	}
	
	public String getTecidoRespiravel() {
		return tecidoRespiravel;
	}

	@Override
	public void setAbsorcaoDeAgua() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getAbsorcaoDeAgua().toString()));

		if (tecidos.size() > 1) {
			absorcaoAguaTecido = "absorve água moderadamente";

		} else {
			if (tecidos.contains("HIDROFOBICO")) {
				absorcaoAguaTecido = "hidrofóbico";
			} else {
				absorcaoAguaTecido = "hidrofílico";
			}
		}

	}
	
	public String getAbsorcaoAguaTecido() {
		return absorcaoAguaTecido;
	}

	@Override
	public void setElasticidade() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getElasticidade().toString()));

		if (tecidos.size() > 1) {
			elasticidadeTecido = "boa elasticidade";

		} else {
			if (tecidos.contains("BAIXA_ELASTICIDADE")) {
				elasticidadeTecido = "baixa elasticidade";
			} else {
				elasticidadeTecido = "alta elasticidade";
			}
		}

	}
	public String getElasticidadeTecido() {
		return elasticidadeTecido;
	}

	@Override
	public void setComportamentoTermico() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getComportamentoTermico().toString()));

		if (tecidos.size() > 1) {
			comportamentoTermicoTecido = "possui regulação de calor moderada";

		} else {
			if (tecidos.contains("BOA_CONSERVACAO_DE_CALOR")) {
				comportamentoTermicoTecido  = "possui boa conservação de calor";
			} else {
				comportamentoTermicoTecido  = "possui boa regulação de calor";
			}
		}
	}
	
	public String getComportamentoTermicoTecido() {
		return comportamentoTermicoTecido;
	}
	

	@Override
	public void setResistencia() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getResistencia().toString()));
		if(tecidos.size() > 1) {
			if(tecidos.contains("POUCO_RESISTENTE")) {
				resistenciaTecido = "resistente";
			}  else {
			resistenciaTecido = "muito resistente";
			}
		} else {
			if(tecidos.contains("MUITO_RESISTENTE")) {
				resistenciaTecido = "muito resistente";
			} else if(tecidos.contains("RESISTENTE")) {
				resistenciaTecido = "resistente";
			} else {
				resistenciaTecido = "pouco resistente";
			}
		}

	}
	
	public String getResistenciaTecido() {
		return resistenciaTecido;
	}

	
	@Override
	public String toString() {
		return "\nTecido: " + this.getConstrucao() + " " + this.getTipoDeTecido() + "\nPropriedades: \n      " + this.getAbsorcaoAguaTecido() + "\n      " + this.getTempoSecagemTecido() + "\n      " + this.getTecidoRespiravel() + "\n      " + this.getComportamentoTermicoTecido() + "\n      " + this.getResistenciaTecido() + "\n      " + this.getElasticidadeTecido() + "\n";
	}


}
