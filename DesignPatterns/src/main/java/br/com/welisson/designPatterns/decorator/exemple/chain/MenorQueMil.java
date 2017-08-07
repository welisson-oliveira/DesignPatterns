package br.com.welisson.designPatterns.decorator.exemple.chain;

import br.com.welisson.designPatterns.decorator.exemple.Orcamento;

public class MenorQueMil implements CalculoICCC {
	
	private final double juros = 0.05;
	
	public double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC) {
		if(shouldCalculate(orcamento)){
			return orcamento.getValor() - (orcamento.getValor() * juros);
		}
		
		return nextCalculoICCC.calcularICCC(orcamento, new AcimaDeTresMil());
	}

	public boolean shouldCalculate(Orcamento orcamento) {
		return orcamento.getValor() < 1000;
	}

}
