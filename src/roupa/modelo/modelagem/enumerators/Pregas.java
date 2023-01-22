package roupa.modelo.modelagem.enumerators;

public enum Pregas {
	SIMPLES("Simples"),
	MACHO("Macho"),
	FEMEA("Fêmea"),
	PLISSADO("Plissado"),
	NAO_POSSUI("Não_Possui");

	private String value;

	Pregas(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Pregas pegaEnum(String valor) {
		 Pregas resultado = null;
	        for (Pregas pregas : values()) {
	            if (pregas.name().equalsIgnoreCase(valor) || pregas.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = pregas;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Pregas pregas : values()) {
	            if (pregas.name().equalsIgnoreCase(valor) || pregas.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
