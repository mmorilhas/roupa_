package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum ComprimentoBustie {

	TORAX("Tórax"),
	ABAIXO_DO_TORAX("Abaixo_Do_Toráx"),
	CINTURA("Cintura");
	

	private String value;

	ComprimentoBustie(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static ComprimentoBustie  pegaEnum(String valor) {
		 ComprimentoBustie  resultado = null;
	        for (ComprimentoBustie compBustie : values()) {
	            if (compBustie.name().equalsIgnoreCase(valor) || compBustie.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = compBustie;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoBustie compBustie : values()) {
	            if (compBustie.name().equalsIgnoreCase(valor) || compBustie.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
