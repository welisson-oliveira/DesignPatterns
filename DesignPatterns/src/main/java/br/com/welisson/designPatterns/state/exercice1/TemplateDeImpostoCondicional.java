package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link Aprovado}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		if(itensIguais(orcamento)){
			return impostoMaximo(orcamento);
		}else{
			return impostoMinimo(orcamento);
		}
	}

	public abstract double impostoMinimo(Orcamento orcamento) ;

	public abstract double impostoMaximo(Orcamento orcamento);

	public abstract boolean itensIguais(Orcamento orcamento);

}
