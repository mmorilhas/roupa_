package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum ComprimentoBlusa {

	CROPPED("Cropped"),
	CINTURA("Cintura"),
	QUADRIL("Quadril"),
	ABAIXO_DO_QUADRIL("Abaixo_do_Quadril");
	
	private String value;

	ComprimentoBlusa(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static ComprimentoBlusa pegaEnum(String valor) {
		 ComprimentoBlusa resultado = null;
	        for (ComprimentoBlusa compBlusa : values()) {
	            if (compBlusa.name().equalsIgnoreCase(valor) || compBlusa.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = compBlusa;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoBlusa compBlusa : values()) {
	            if (compBlusa.name().equalsIgnoreCase(valor) || compBlusa.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
