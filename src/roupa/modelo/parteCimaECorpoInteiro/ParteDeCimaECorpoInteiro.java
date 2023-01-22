package roupa.modelo.parteCimaECorpoInteiro;

import java.util.Objects;

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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capa, capuz, cava, decote, manga);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParteDeCimaECorpoInteiro other = (ParteDeCimaECorpoInteiro) obj;
		return Objects.equals(capa, other.capa) && Objects.equals(capuz, other.capuz) && cava == other.cava
				&& decote == other.decote && manga == other.manga;
	}
}
