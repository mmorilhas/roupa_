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
	
	public void setTodasAsPropriedades() {
	
			setTipoDeTecido();
			setTempoDeSecagem();
			setEhRespiravel();
			setAbsorcaoDeAgua();
			setElasticidade();
			setComportamentoTermico();
			setResistencia();
	
	}
	
	
	public void setTipoDeTecido() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getTipoFibra().toString()));
		if (tecidos.size() > 1) {
			if (tecidos.contains("NATURAL") && tecidos.contains("ARTIFICIAL")
					|| tecidos.contains("NATURAL") && tecidos.contains("SINTETICA")) {
				tipoDeTecido = "Misto";
			} else {
				tipoDeTecido = "Sint�tico";
			}
		}else {
			if (tecidos.contains("NATURAL")) {
				tipoDeTecido = "Natural";
			} else {
				tipoDeTecido = "Sint�tico";
			}
		}

	}

	
	@Override
	public void setTempoDeSecagem() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getTempoDeSecagem().toString()));

		if (tecidos.size() > 1) {
			tempoSecagemTecido = "tempo de secagem mediano";
		} else {
			if (tecidos.contains("SECA_RAPIDAMENTE")) {
				tempoSecagemTecido = "secagem r�pida";
			} else {
				tempoSecagemTecido = "secagem lenta";
			}
		}

	}
	



	@Override
	public void setEhRespiravel() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getRespiravel().toString()));

		if (tecidos.size() > 1) {
			tecidoRespiravel = "moderadamente respir�vel";
		}else {
			if (tecidos.contains("NAO_E_RESPIRAVEL")) {
				tecidoRespiravel = "n�o � respir�vel";
			} else {
				tecidoRespiravel = "� respir�vel";
			}
		}

	}
	

	@Override
	public void setAbsorcaoDeAgua() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getAbsorcaoDeAgua().toString()));

		if (tecidos.size() > 1) {
			absorcaoAguaTecido = "absorve �gua moderadamente";

		} else {
			if (tecidos.contains("HIDROFOBICO")) {
				absorcaoAguaTecido = "hidrof�bico";
			} else {
				absorcaoAguaTecido = "hidrof�lico";
			}
		}

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

	@Override
	public void setComportamentoTermico() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getComportamentoTermico().toString()));

		if (tecidos.size() > 1) {
			comportamentoTermicoTecido = "possui regula��o de calor moderada";

		} else {
			if (tecidos.contains("BOA_CONSERVACAO_DE_CALOR")) {
				comportamentoTermicoTecido  = "possui boa conserva��o de calor";
			} else {
				comportamentoTermicoTecido  = "possui boa regula��o de calor";
			}
		}
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
	

	
	@Override
	public String toString() {
		return "\nTecido: " + this.construcao + " " + this.tipoDeTecido + "\nPropriedades: \n      " + this.absorcaoAguaTecido + "\n      " + this.tempoSecagemTecido + "\n      " + this.tecidoRespiravel + "\n      " + this.comportamentoTermicoTecido + "\n      " + this.resistenciaTecido + "\n      " + this.elasticidadeTecido + "\n";
	}


}
