package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum ComprimentoPoncho {

	QUADRIL("Quadril"),
	MEIO_DA_COXA("Meio_da_Coxa"),
	NO_JOELHO("No_Joelho");
	
	private String value;

	ComprimentoPoncho(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static ComprimentoPoncho pegaEnum(String valor) {
		 ComprimentoPoncho resultado = null;
	        for (ComprimentoPoncho compPoncho : values()) {
	            if (compPoncho.name().equalsIgnoreCase(valor) || compPoncho.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = compPoncho;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoPoncho compPoncho : values()) {
	            if (compPoncho.name().equalsIgnoreCase(valor) || compPoncho.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
