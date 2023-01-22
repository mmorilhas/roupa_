package roupa.modelo.tecido.fibra.enumerators;


public enum NomeFibra {
	ALGODAO("Algodão"),
	LA("Lã"),
	LINHO("Linho"),
	SEDA("Seda"),
	COURO("Couro"),
	
	VISCOSE("Viscose"),
	MODAL("Modal"),
	LIOCEL("Liocel"),
	ACETATO("Acetato"),
	
	ACRILICO("Acrílico"),
	POLIAMIDA("Poliamida"),
	POLIESTER("Poliéster"),
	ELASTANO("Elastano");
	
	private String value;

	private NomeFibra(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	

	 public static NomeFibra pegaEnum(String valor) {
		 NomeFibra resultado = null;
	        for (NomeFibra fibra : values()) {
	            if (fibra.name().equalsIgnoreCase(valor) || fibra.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = fibra;
	            }
	        }
	        
			return resultado;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (NomeFibra fibra : values()) {
	            if (fibra.name().equalsIgnoreCase(valor) || fibra.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }



	 

}
