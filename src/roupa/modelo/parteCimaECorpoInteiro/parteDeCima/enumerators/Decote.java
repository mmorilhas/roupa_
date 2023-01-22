package roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators;

public enum Decote {

	CANOA("Canoa"),
	GOLA_ALTA("Gola_Alta"),
	TOMARA_QUE_CAIA("Tomara_que_Caia"),
	EM_V("V"),
	EM_U("U"),
	OVERSIZED("Oversized"),
	QUADRADO("Quadrado"),
	CARECA("Careca"),
	COLARINHO_INGLES("Colarinho_Inglês"),
	COLARINHO_AMERICANO("Colarinho_Americano"), 
	COLARINHO_ITALIANO("Colarinho_Italiano"),
	COLARINHO_CURTO("Colarinho_Curto"),
	COLARINHO_MAO("Colarinho_Mao"),
	COLARINHO_OPERA("Colarinho_Ópera"),
	COLARINHO_QUEBRADO("Colarinho_Quebrado");
	
	private String value;

	Decote(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Decote pegaEnum(String valor) {
		 Decote resultado = null;
	        for (Decote decote : values()) {
	            if (decote.name().equalsIgnoreCase(valor) || decote.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = decote;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Decote decote : values()) {
	            if (decote.name().equalsIgnoreCase(valor) || decote.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

	
}
