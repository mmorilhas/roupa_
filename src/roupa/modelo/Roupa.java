package roupa.modelo;
import java.util.Objects;
import roupa.modelo.enumerators.Genero;
import roupa.modelo.enumerators.TipoDeRoupa;
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



	public String costurando() {
		return "costurando.......";
	}
	
}
