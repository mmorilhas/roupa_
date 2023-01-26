package roupa.modelo.enumerators;

public enum Genero {
	FEMININO,
	MASCULINO,
	UNISSEX;
	


	

	 public static Genero pegaEnum(String valor) {
		 Genero resultadoBarra = null;
	        for (Genero genero : values()) {
	            if (genero.name().equalsIgnoreCase(valor)) {
	            	resultadoBarra  =genero;
	                break;
	            }
	        }
	        return resultadoBarra ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Genero genero : values()) {
	            if (genero.name().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

}
