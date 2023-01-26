package roupa.modelo.pBaixo.enumerators;


public enum Cintura {

	SUPER_BAIXA("Super_Baixa"),
	BAIXA("Baixa"),
	MEDIA("Média"),
	ALTA("Alta"),
	SUPER_ALTA("Super_Alta");
	
	private String value;
	
	
	Cintura(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Cintura pegaEnum(String valor) {
		 Cintura resultado = null;
	        for (Cintura cintura : values()) {
	            if (cintura.name().equalsIgnoreCase(valor) || cintura.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = cintura;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Cintura cintura : values()) {
	            if (cintura.name().equalsIgnoreCase(valor) || cintura.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
