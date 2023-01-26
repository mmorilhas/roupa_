package roupa.modelo.pBaixo.enumerators;


public enum BodyTipos{
	SEM_FECHO("Sem"),
	COM_COLCHETES("Com_Colchetes"),
	COM_BOTAO("Com_Botão");
	
	private String value;

	BodyTipos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static BodyTipos pegaEnum(String valor) {
		 BodyTipos resultado = null;
	        for (BodyTipos bodyTipos : values()) {
	            if (bodyTipos.name().equalsIgnoreCase(valor) || bodyTipos.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = bodyTipos;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (BodyTipos bodyTipos : values()) {
	            if (bodyTipos.name().equalsIgnoreCase(valor) || bodyTipos.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
