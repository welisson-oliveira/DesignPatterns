package br.com.welisson.designPatterns.decorator.exercice2;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	public ICPP() {
		super(null);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.05 + calculaProximo(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.07 + calculaProximo(orcamento);
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() > 500;
	}

}
