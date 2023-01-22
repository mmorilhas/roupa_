package roupa.modelo;
import java.util.Objects;

import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.tecido.Tecido;

public abstract class Roupa{
	
	protected String nome;
	protected TipoDeRoupa tipoDeRoupa;
	protected Integer tamanho;
	protected Genero genero; 
	protected String cor;
	protected Modelagem modelagem;
	protected Boolean temEstampa;
	protected Boolean temBordado;
	protected Tecido tecidos;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cor, genero, modelagem, nome, tamanho, tecidos, temBordado, temEstampa, tipoDeRoupa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roupa other = (Roupa) obj;
		return Objects.equals(cor, other.cor) && genero == other.genero && Objects.equals(modelagem, other.modelagem)
				&& Objects.equals(nome, other.nome) && Objects.equals(tamanho, other.tamanho)
				&& Objects.equals(tecidos, other.tecidos) && Objects.equals(temBordado, other.temBordado)
				&& Objects.equals(temEstampa, other.temEstampa) && tipoDeRoupa == other.tipoDeRoupa;
	}
	
	
}
