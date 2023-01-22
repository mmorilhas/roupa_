package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum Lapela{
	LAPELA_QUADRADA("Lapela_Quadrada"),
	LAPELA_PONTUDA("Lapela_Pontuda"),
	LAPELA_XALE("Lapela_Xale"),
	SEM_LAPELA("Sem");
	
	private String value;

	Lapela(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Lapela pegaEnum(String valor) {
		 Lapela resultado = null;
	        for (Lapela lapela : values()) {
	            if (lapela.name().equalsIgnoreCase(valor) || lapela.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = lapela;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Lapela lapela : values()) {
	            if (lapela.name().equalsIgnoreCase(valor) || lapela.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

}
