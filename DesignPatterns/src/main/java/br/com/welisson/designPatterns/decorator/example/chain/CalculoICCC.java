package br.com.welisson.designPatterns.decorator.example.chain;

import br.com.welisson.designPatterns.decorator.example.Orcamento;

public interface CalculoICCC {
	double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC);
	
	boolean shouldCalculate(Orcamento orcamento);
}
