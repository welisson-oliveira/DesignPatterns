package br.com.welisson.designPatterns.strategy.exercice1.chainOfResponsibility;

import br.com.welisson.designPatterns.strategy.exercice1.Orcamento;

public class EntreMilETresMil implements CalculoICCC {
	
	private final double juros = 0.07;

	public double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC) {
		if(shouldCalculate(orcamento)){
			return orcamento.getValor() - (orcamento.getValor() * juros);
		}
		return nextCalculoICCC.calcularICCC(orcamento, null);
	}

	public boolean shouldCalculate(Orcamento orcamento) {
		return orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000;
	}
	
	

}
