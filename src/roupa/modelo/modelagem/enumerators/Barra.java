package roupa.modelo.modelagem.enumerators;

public enum Barra {
	INVISIVEL("Invisível"),
	LENCO("Lenço"),
	ITALIANA("Italiana"),
	SIMPLES("Simples"),
	GALONEIRA("Galoneira"),
	VIES("Viés"),
	ORIGINAL("Original"),
	DESFIADA("Desfiada");

	private String value;

	Barra(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Barra pegaEnum(String valor) {
		 Barra resultado = null;
	        for (Barra barra : values()) {
	            if (barra.name().equalsIgnoreCase(valor) || barra.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = barra;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Barra barra : values()) {
	            if (barra.name().equalsIgnoreCase(valor) || barra.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

	 

}
