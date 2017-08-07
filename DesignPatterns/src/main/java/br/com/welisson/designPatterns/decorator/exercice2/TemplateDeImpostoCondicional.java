package br.com.welisson.designPatterns.decorator.exercice2;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	public TemplateDeImpostoCondicional() {
		super(null);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaProximo(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaProximo(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
