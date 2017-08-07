package br.com.welisson.designPatterns.strategy.exercice1.chainOfResponsibility;

import br.com.welisson.designPatterns.strategy.exercice1.Orcamento;

public interface CalculoICCC {
	double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC);
	
	boolean shouldCalculate(Orcamento orcamento);
}
