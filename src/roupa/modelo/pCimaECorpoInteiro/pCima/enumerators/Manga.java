package roupa.modelo.pCimaECorpoInteiro.pCima.enumerators;


public enum Manga {
	REGATA("Regata"),
	REGATA_RAGLAN("Regata_Raglan"),
	CURTA_TULIPA("Curta_Tulipa"),
	CURTA_BUFANTE_PUNHO_ELASTICO("Curta_Bufante_Punho_Elástico"),
	CURTA_BUFANTE_PUNHO_BOTAO("Curta_Bufante_Punho_Botão"),
	CURTA_BUFANTE_PUNHO_FITA("Curta_Bufante_Punho_Fita"),
	CURTA_COM_BABADO("Curta_Com_Babado"),
	CURTA_VAZADO("Curta_Vazada"),
	CURTA_RAGLAN("Curta_Raglan"),
	CURTA_GODE("Curta_Godê"),
	CURTA_FRANZIDA("Curta_Franzida"),
	CURTA_SOLTA("Curta_Solta"),
	TRES_QUARTOS_TULIP("Três_Quartos_Tulipa"),
	TRES_QUARTOS_BUFANTE_PUNHO_ELASTICO("Três_Quartos_Bufante_Punho_Elástico"),
	TRES_QUARTOS_BUFANTE_PUNHO_BOTAO("Três_Quartos_Bufante_Punho_Botão"),
	TRES_QUARTOS_BUFANTE_PUNHO_FITA("Três_Quartos_Bufante_Punho_Fita"),
	TRES_QUARTOS_COM_BABADO("Três_Quartos_Com_Babado"),
	TRES_QUARTOS_VAZADO("Três_Quartos_Vazada"),
	TRES_QUARTOS_RAGLAN("Três_Quartos_Raglan"),
	TRES_QUARTOS_FRANZIDA("Três_Quartos_Franzida"),
	TRES_QUARTOS_SINO("Três_Quartos_Sino"),
	TRES_QUARTOS_SOLTA("Três_Quartos_Solta"),
	TRES_QUARTOS_GODE("Três_Quartos_Godê"),
	LONGA_TULIPA("Longa_Tulipa"),
	LONGA_BUFANTE_PUNHO_ELASTICO("Longa_Bufante_Punho_Elástico"),
	LONGA_BUFANTE_PUNHO_BOTAO("Longa_Bufante_Punho_Botão"),
	LONGA_BUFANTE_PUNHO_FITA("Longa_Bufante_Punho_Fita"),
	LONGA_COM_BABADO("Longa_Com_Babado"),
	LONGA_VAZADO("Longa_Vazada"),
	LONGA_RAGLAN("Longa_Raglan"),
	LONGA_SINO("Longa_Sino"),
	LONGA_SOLTA("Longa_Solta"),
	LONGA_FRANZIDA("Longa_Franzida"),
	LONGA_GODE("Longa_Godê"),
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
