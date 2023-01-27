package roupa.modelo.pBaixo.enumerators;


public enum GanchoTipos {
	JUSTO("Justo"),
	SARUEL("Saruel"),
	SUPER_BAIXO("Super_Baixo");
	
	private String value;

	GanchoTipos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	
	public static GanchoTipos pegaEnum(String valor) {
		 GanchoTipos resultado = null;
	        for (GanchoTipos gancho: values()) {
	            if (gancho.name().equalsIgnoreCase(valor) || gancho.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = gancho;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (GanchoTipos gancho : values()) {
	            if (gancho.name().equalsIgnoreCase(valor) || gancho.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
	
}
