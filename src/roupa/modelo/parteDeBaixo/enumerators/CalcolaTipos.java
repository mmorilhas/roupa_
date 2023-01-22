package roupa.modelo.parteDeBaixo.enumerators;


public enum CalcolaTipos {
	TANGA("Tanga"),
	FIO_DENTAL("Fio_Dental"),
	BIQUINI("Biquíni"),
	CALECON("Caleçon"),
	BOXER("Boxer"),
	CICLISTA("Ciclista"),
	SAMBA_CANCAO("Samba_Canção"),
	SLIP("Slip");

	private String value;

	CalcolaTipos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static CalcolaTipos pegaEnum(String valor) {
		 CalcolaTipos resultado = null;
	        for (CalcolaTipos calcolaTipos : values()) {
	            if (calcolaTipos.name().equalsIgnoreCase(valor) || calcolaTipos.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = calcolaTipos;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (CalcolaTipos calcolaTipos : values()) {
	            if (calcolaTipos.name().equalsIgnoreCase(valor) || calcolaTipos.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }
}
