package roupa.modelo.tecido;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import roupa.modelo.tecido.fibra.Fibra;
import roupa.modelo.tecido.fibra.SetPropriedadesFibraETecido;

public class Tecido implements SetPropriedadesFibraETecido {

	Collection<Fibra> composicao = new HashSet<>();
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
				tipoDeTecido = "MISTO";
			} else {
				tipoDeTecido = "SINTÉTICO";
			}
		} else {
			if (tecidos.contains("NATURAL")) {
				tipoDeTecido = "NATURAL";
			} else {
				tipoDeTecido = "SINTÉTICO";
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
				tempoSecagemTecido = "secagem rápida";
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
			tecidoRespiravel = "moderadamente respirável";
		} else {
			if (tecidos.contains("NAO_E_RESPIRAVEL")) {
				tecidoRespiravel = "não é respirável";
			} else {
				tecidoRespiravel = "é respirável";
			}
		}

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
			comportamentoTermicoTecido = "possui regulação de calor moderada";

		} else {
			if (tecidos.contains("BOA_CONSERVACAO_DE_CALOR")) {
				comportamentoTermicoTecido = "possui boa conservação de calor";
			} else {
				comportamentoTermicoTecido = "possui boa regulação de calor";
			}
		}
	}

	@Override
	public void setResistencia() {
		HashSet<String> tecidos = new HashSet<>();
		composicao.forEach(fibra -> tecidos.add(fibra.getResistencia().toString()));
		if (tecidos.size() > 1) {
			if (tecidos.contains("POUCO_RESISTENTE")) {
				resistenciaTecido = "resistente";
			} else {
				resistenciaTecido = "muito resistente";
			}
		} else {
			if (tecidos.contains("MUITO_RESISTENTE")) {
				resistenciaTecido = "muito resistente";
			} else if (tecidos.contains("RESISTENTE")) {
				resistenciaTecido = "resistente";
			} else {
				resistenciaTecido = "pouco resistente";
			}
		}

	}

	@Override
	public String toString() {
		return "" + this.tecendo() + " Construção: " + this.construcao + " Tipo: " + this.tipoDeTecido
				+ " Propriedades:  " + this.absorcaoAguaTecido + " - " + this.tempoSecagemTecido + " - "
				+ this.tecidoRespiravel + " - " + this.comportamentoTermicoTecido + " - " + this.resistenciaTecido
				+ " - " + this.elasticidadeTecido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(absorcaoAguaTecido, comportamentoTermicoTecido, composicao, construcao, elasticidadeTecido,
				resistenciaTecido, tecidoRespiravel, tempoSecagemTecido, tipoDeTecido);
	}

	@Override
	public boolean equals(Object outro) {
		if(outro == null)return false;
		if(this.getClass() != outro.getClass()) {
			return false;
		}
		Tecido tecido = (Tecido) outro;
		return Objects.equals(absorcaoAguaTecido, tecido.absorcaoAguaTecido)
				&& Objects.equals(comportamentoTermicoTecido, tecido.comportamentoTermicoTecido)
				&& Objects.equals(composicao, tecido.composicao) && construcao == tecido.construcao
				&& Objects.equals(elasticidadeTecido, tecido.elasticidadeTecido)
				&& Objects.equals(resistenciaTecido, tecido.resistenciaTecido)
				&& Objects.equals(tecidoRespiravel, tecido.tecidoRespiravel)
				&& Objects.equals(tempoSecagemTecido, tecido.tempoSecagemTecido)
				&& Objects.equals(tipoDeTecido, tecido.tipoDeTecido);
	}

	public String tecendo() {
		return "tecendo....... Pronto para ser usado!";
	}

	public Construcao getConstrucao() {
		return construcao;
	}

	public String getTipoDeTecido() {
		return tipoDeTecido;
	}

	public String getTempoSecagemTecido() {
		return tempoSecagemTecido;
	}

	public String getTecidoRespiravel() {
		return tecidoRespiravel;
	}

	public String getAbsorcaoAguaTecido() {
		return absorcaoAguaTecido;
	}

	public String getElasticidadeTecido() {
		return elasticidadeTecido;
	}

	public String getComportamentoTermicoTecido() {
		return comportamentoTermicoTecido;
	}

	public String getResistenciaTecido() {
		return resistenciaTecido;
	}

	
	
}
