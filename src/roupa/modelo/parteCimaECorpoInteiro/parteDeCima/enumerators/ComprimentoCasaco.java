package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum ComprimentoCasaco {

	CROPPED("Cropped"), 
	CINTURA("Cintura"),
	QUADRIL("Quadril"),
	MEIO_DA_COXA("Meio_da_coxa"),
	NO_JOELHO("No_Joelho"),
	ABAIXO_DO_JOELHO("Abaixo_do_Joelho"),
	MEIO_DA_CANELA("Meio_da_canela"),
	TORNOZELO("Tornozelo");

	private String value;

	ComprimentoCasaco(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static ComprimentoCasaco pegaEnum(String valor) {
		 ComprimentoCasaco resultado = null;
	        for (ComprimentoCasaco compCasaco : values()) {
	            if (compCasaco.name().equalsIgnoreCase(valor) || compCasaco.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = compCasaco;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoCasaco compCasaco : values()) {
	            if (compCasaco.name().equalsIgnoreCase(valor) || compCasaco.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

}
