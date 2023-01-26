package roupa.modelo.pCimaECorpoInteiro;

import java.util.Objects;

import roupa.modelo.*;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Cava;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Decote;
import roupa.modelo.pCimaECorpoInteiro.pCima.enumerators.Manga;

public abstract class ParteDeCimaECorpoInteiro extends Roupa {

	protected Manga manga;
	protected Decote decote;
	protected Cava cava;
	protected Boolean capuz;

	
	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(capuz, cava, decote, manga);
		return resultado;
	}
	
	
}
