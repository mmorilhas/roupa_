package roupa.modelo.modelagem.enumerators;


public enum Silhueta {
	
	AJUSTADA("Justa"),
	RETA("Reta"),
	BAGGY("Larga");
	
	
	private String value;

	Silhueta(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Silhueta pegaEnum(String valor) {
		 Silhueta resultado = null;
	        for (Silhueta silhueta : values()) {
	            if (silhueta.name().equalsIgnoreCase(valor) || silhueta.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = silhueta;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Silhueta silhueta : values()) {
	            if (silhueta.name().equalsIgnoreCase(valor)|| silhueta.getValue().equalsIgnoreCase(valor) ) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

}
