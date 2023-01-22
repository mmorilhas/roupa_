package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;


public enum Cava {

	JUSTA("Justa"),
	BAIXA("Baixa"),
	SEM_CAVA("Sem");
	
	private String value;

	Cava(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static Cava pegaEnum(String valor) {
		Cava resultado = null;
	        for (Cava cava : values()) {
	            if (cava.name().equalsIgnoreCase(valor) || cava.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = cava;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Cava cava : values()) {
	            if (cava.name().equalsIgnoreCase(valor)|| cava.getValue().equalsIgnoreCase(valor) ) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
