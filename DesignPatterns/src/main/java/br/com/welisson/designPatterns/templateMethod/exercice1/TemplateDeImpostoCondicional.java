package br.com.welisson.designPatterns.templateMethod.exercice1;


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
