package br.com.welisson.designPatterns.templateMethod.exemplo.certo;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() > 500;
	}

}
