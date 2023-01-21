package roupa.modelo;
import java.util.Collection;

import roupa.modelo.modelagem.Modelagem;
import roupa.modelo.tecido.Tecido;

public abstract class Roupa{
	
	protected String nome;
	protected TipoDeRoupa tipoDeRoupa;
	protected Integer tamanho;
	protected Genero genero; 
	protected GrupoEtario grupoEtario;
	protected String cor;
	protected Modelagem modelagem;
	protected Boolean temEstampa;
	protected Boolean temBordado;
	protected Tecido tecidos;
	protected String[] aviamentos;
	
	
}
