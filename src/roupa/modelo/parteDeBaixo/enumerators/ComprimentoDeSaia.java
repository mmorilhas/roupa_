package roupa.modelo.parteDeBaixo.enumerators;


public enum ComprimentoDeSaia {

	MICRO("Micro"),
	CURTO("Curto"),
	ACIMA_DO_JOELHO("Acima_do_Joelho"),
	NO_JOELHO("No_Joelho"),
	ABAIXO_DO_JOELHO("Abaixo_do_Joelho"),
	MIDI("Midi"),
	LONGO("Longo"),
	ASSIMETRICO("Assimétrico");
	
	private String value;

	ComprimentoDeSaia(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static ComprimentoDeSaia pegaEnum(String valor) {
		 ComprimentoDeSaia resultado = null;
	        for (ComprimentoDeSaia compSaia : values()) {
	            if (compSaia.name().equalsIgnoreCase(valor) || compSaia.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = compSaia;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoDeSaia compSaia : values()) {
	            if (compSaia.name().equalsIgnoreCase(valor) || compSaia.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
