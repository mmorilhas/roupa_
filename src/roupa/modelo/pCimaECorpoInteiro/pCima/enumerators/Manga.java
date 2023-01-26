package roupa.modelo.pCimaECorpoInteiro.pCima.enumerators;


public enum Manga {
	REGATA("Regata"),
	REGATA_RAGLAN("Regata_Raglan"),
	CURTA_TULIPA("Curta_Tulipa"),
	CURTA_BUFANTE_PUNHO_ELASTICO("Curta_Bufante_Punho_El�stico"),
	CURTA_BUFANTE_PUNHO_BOTAO("Curta_Bufante_Punho_Bot�o"),
	CURTA_BUFANTE_PUNHO_FITA("Curta_Bufante_Punho_Fita"),
	CURTA_COM_BABADO("Curta_Com_Babado"),
	CURTA_VAZADO("Curta_Vazada"),
	CURTA_RAGLAN("Curta_Raglan"),
	CURTA_GODE("Curta_God�"),
	CURTA_FRANZIDA("Curta_Franzida"),
	CURTA_SOLTA("Curta_Solta"),
	TRES_QUARTOS_TULIP("Tr�s_Quartos_Tulipa"),
	TRES_QUARTOS_BUFANTE_PUNHO_ELASTICO("Tr�s_Quartos_Bufante_Punho_El�stico"),
	TRES_QUARTOS_BUFANTE_PUNHO_BOTAO("Tr�s_Quartos_Bufante_Punho_Bot�o"),
	TRES_QUARTOS_BUFANTE_PUNHO_FITA("Tr�s_Quartos_Bufante_Punho_Fita"),
	TRES_QUARTOS_COM_BABADO("Tr�s_Quartos_Com_Babado"),
	TRES_QUARTOS_VAZADO("Tr�s_Quartos_Vazada"),
	TRES_QUARTOS_RAGLAN("Tr�s_Quartos_Raglan"),
	TRES_QUARTOS_FRANZIDA("Tr�s_Quartos_Franzida"),
	TRES_QUARTOS_SINO("Tr�s_Quartos_Sino"),
	TRES_QUARTOS_SOLTA("Tr�s_Quartos_Solta"),
	TRES_QUARTOS_GODE("Tr�s_Quartos_God�"),
	LONGA_TULIPA("Longa_Tulipa"),
	LONGA_BUFANTE_PUNHO_ELASTICO("Longa_Bufante_Punho_El�stico"),
	LONGA_BUFANTE_PUNHO_BOTAO("Longa_Bufante_Punho_Bot�o"),
	LONGA_BUFANTE_PUNHO_FITA("Longa_Bufante_Punho_Fita"),
	LONGA_COM_BABADO("Longa_Com_Babado"),
	LONGA_VAZADO("Longa_Vazada"),
	LONGA_RAGLAN("Longa_Raglan"),
	LONGA_SINO("Longa_Sino"),
	LONGA_SOLTA("Longa_Solta"),
	LONGA_FRANZIDA("Longa_Franzida"),
	LONGA_GODE("Longa_God�"),
	SEM_MANGA("Sem");
	
	private String value;

	Manga(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	

	 public static Manga pegaEnum(String valor) {
		 Manga resultado = null;
	        for (Manga manga : values()) {
	            if (manga.name().equalsIgnoreCase(valor) || manga.getValue().equalsIgnoreCase(valor)) {
	            	resultado  = manga;
	                break;
	            }
	        }
	        return resultado ;
	    }

	public static boolean existeNoEnum(String valor) {
		 boolean achou = false;
	        for (Manga manga : values()) {
	            if (manga.name().equalsIgnoreCase(valor) || manga.getValue().equalsIgnoreCase(valor)) {
	                achou = true;
	                break;
	            }
	        }
	        return achou;
	    }

	
	

}
