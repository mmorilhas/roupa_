package roupa.modelo.parteCimaECorpoInteiro;

import java.util.Objects;

import roupa.modelo.parteCimaECorpoInteiro.parteDeCima.enumerators.Lapela;

public class ParteDeCimaComLapela extends ParteDeCimaECorpoInteiro{
	
	protected Lapela lapela;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lapela);
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
		ParteDeCimaComLapela other = (ParteDeCimaComLapela) obj;
		return lapela == other.lapela;
	}
	
	

}
