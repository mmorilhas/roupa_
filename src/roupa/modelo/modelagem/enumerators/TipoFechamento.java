package roupa.modelo.modelagem.enumerators;

public enum TipoFechamento {
	ZIPER_LATERAL("Zíper_lateral",1),
	ZIPER_FRENTE("Zíper_frente", 1),
	ZIPER_COSTAS("Zíper_costas", 1),
	BOTAO_LATERAL("Botão_lateral", 2),
	BOTAO_FRENTE("Botão_frente",2),
	BOTAO_COSTAS("Botão_costas", 2),
	COLCHETE_LATERAL("Colchete_lateral", 3),
	COLCHETE_FRENTE("Colchete_frente", 3),
	COLCHETE_COSTAS("Colchete_costas", 3),
	FITA_LATERAL("Fita_lateral",4),
	FITA_FRENTE("Fita_frente", 4),
	FITA_COSTAS("Fita_costas", 4),
	NAO_POSSUI("Não_possui", 5);
	
	
	private String value;
	private int tipo;

	private TipoFechamento(String value, int tipo) {
		this.value = value;
		this.tipo = tipo;	}
	
	public String getValue() {
		return value;
	}
	
	/*
	 * public int getTipo() { return tipo; }
	 * 
	 * public static int pegaTipo(String name) { int resultado = 0; for
	 * (TipoFechamento tipoFechamento : values()) { if
	 * (tipoFechamento.name().equalsIgnoreCase(name) ||
	 * tipoFechamento.getValue().equalsIgnoreCase(name)) { resultado =
	 * tipoFechamento.getTipo(); break; } } return resultado; }
	 */
	
	public static TipoFechamento pegaEnum(String name) {
		 TipoFechamento resultado = null;
	        for (TipoFechamento tipoFechamento : values()) {
	            if (tipoFechamento.name().equalsIgnoreCase(name) || tipoFechamento.getValue().equalsIgnoreCase(name)) {
	                resultado = tipoFechamento;
	                break;
	            }
	        }
	        return resultado;
	    }
	 

	 
	 public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (TipoFechamento tipoFechamento : values()) {
	            if (tipoFechamento.name().equalsIgnoreCase(valor) || tipoFechamento.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
	 
}
