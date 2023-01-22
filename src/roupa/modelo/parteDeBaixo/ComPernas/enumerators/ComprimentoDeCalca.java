package roupa.modelo.parteDeBaixo.ComPernas.enumerators;


public enum ComprimentoDeCalca {
	MICRO("Micro", 1),
	CURTO("Curto", 1),
	ACIMA_DO_JOELHO("Bermuda", 2),
	NO_JOELHO("No_Joelho", 2),
	ABAIXO_DO_JOELHO("Abaixo_do_Joelho", 2),
	PANTACOURT("Pantacourt", 3),
	TORNOZELO("Tornozelo", 3),
	LONGA("Longo", 3);
	
	
	private String value;
	private int numero;

	ComprimentoDeCalca(String value, int numero) {
		this.value = value;
		this.numero = numero;
	}
	
	public String getValue() {
		return value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public static int pegaNumero(String valor) {
		int resultado = 0;
        for (ComprimentoDeCalca calca : values()) {
            if (calca.name().equalsIgnoreCase(valor) || calca.getValue().equalsIgnoreCase(valor)) {
            	resultado  = calca.getNumero();
                break;
            }
        }
        return resultado ;
	}

	 public static ComprimentoDeCalca pegaEnum(String valor) {
		 ComprimentoDeCalca resultado = null;
	        for (ComprimentoDeCalca calca : values()) {
	            if (calca.name().equalsIgnoreCase(valor) || calca.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = calca;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (ComprimentoDeCalca calca : values()) {
	            if (calca.name().equalsIgnoreCase(valor) || calca.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }



}
