package roupa.modelo.parteCimaECorpoInteiro;

import roupa.modelo.*;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Cava;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Decote;
import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Manga;

public abstract class ParteDeCimaECorpoInteiro extends Roupa {

	protected Manga manga;
	protected Decote decote;
	protected Cava cava;
	protected Boolean capuz;
	protected Boolean capa;


	public String seTomaraQueCaia() {
		if (this.decote == Decote.TOMARA_QUE_CAIA) {
			this.cava = Cava.SEM_CAVA;

		}
		return "";
	}
	
	//SE DECOTE TOMARA QUE CAIA SEM CAVA


}
