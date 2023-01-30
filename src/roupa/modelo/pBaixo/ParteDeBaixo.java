package roupa.modelo.pBaixo;

import java.util.Objects;

import roupa.modelo.Roupa;
import roupa.modelo.pBaixo.enumerators.Cintura;

public abstract class ParteDeBaixo extends Roupa{
	
	protected Cintura cintura;

	@Override
	public int hashCode() {
		final int primo = 7;
		int resultado = super.hashCode();
		resultado = primo * resultado + Objects.hash(cintura);
		return resultado;
	}


	

}
