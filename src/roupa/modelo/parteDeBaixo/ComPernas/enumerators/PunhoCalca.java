package roupa.modelo.parteDeBaixo.ComPernas.enumerators;

public enum PunhoCalca {
	COM_ELASTICO("Com_Elástico"),
	COM_BOTAO("Com_Botão"),
	COM_FITA("Com_Fita"),
	SEM_PUNHO("Sem");
	
	
	
	private String value;

	PunhoCalca(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static PunhoCalca pegaEnum(String valor) {
		 PunhoCalca resultado = null;
	        for (PunhoCalca calca : values()) {
	            if (calca.name().equalsIgnoreCase(valor) || calca.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = calca;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (PunhoCalca calca : values()) {
	            if (calca.name().equalsIgnoreCase(valor) || calca.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
