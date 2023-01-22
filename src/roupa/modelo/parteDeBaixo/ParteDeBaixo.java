package roupa.modelo.parteDeBaixo;

import java.util.Objects;

import roupa.modelo.Roupa;
import roupa.modelo.parteDeBaixo.enumerators.Cintura;

public abstract class ParteDeBaixo extends Roupa{

	protected Cintura cintura;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cintura);
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
		ParteDeBaixo other = (ParteDeBaixo) obj;
		return cintura == other.cintura;
	}

	
}
