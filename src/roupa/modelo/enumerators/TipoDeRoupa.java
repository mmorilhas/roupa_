package roupa.modelo.enumerators;


public enum TipoDeRoupa {
	PARTE_DE_CIMA("Cima"),
	PARTE_DE_BAIXO("Baixo"),
	CORPO_INTEIRO("Corpo_Inteiro");
	
	private String value;

	TipoDeRoupa(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static TipoDeRoupa pegaEnum(String valor) {
		 TipoDeRoupa resultado = null;
	        for (TipoDeRoupa tipoRoupa : values()) {
	            if (tipoRoupa.name().equalsIgnoreCase(valor) || tipoRoupa.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = tipoRoupa;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (TipoDeRoupa tipoRoupa : values()) {
	            if (tipoRoupa.name().equalsIgnoreCase(valor) || tipoRoupa.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
