package br.com.welisson.designPatterns.decorator.exemple.chain;

import br.com.welisson.designPatterns.decorator.exemple.Orcamento;

public interface CalculoICCC {
	double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC);
	
	boolean shouldCalculate(Orcamento orcamento);
}
