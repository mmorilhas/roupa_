package roupa.modelo.tecido;


public enum Construcao {
	PLANO,
	MALHA,
	TNT,
	JACQUARD;
	

	 public static Construcao  pegaEnum(String valor) {
		 Construcao  resultado = null;
	        for (Construcao  construcao  : values()) {
	            if (construcao.name().equalsIgnoreCase(valor)) {
	            	resultado  = construcao;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Construcao  pregas : values()) {
	            if (pregas.name().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
