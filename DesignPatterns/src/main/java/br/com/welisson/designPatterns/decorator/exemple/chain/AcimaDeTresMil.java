package br.com.welisson.designPatterns.decorator.exemple.chain;

import br.com.welisson.designPatterns.decorator.exemple.Orcamento;

public class AcimaDeTresMil implements CalculoICCC{

	private final double juros = 0.08;

	public double calcularICCC(final Orcamento orcamento, final CalculoICCC nextCalculoICCC) {
		if(shouldCalculate(orcamento)){
			return orcamento.getValor() - (orcamento.getValor() * juros) + 30;
		}
		throw new RuntimeException("Não foi possivel Calcular");
	}

	public boolean shouldCalculate(Orcamento orcamento) {
		return orcamento.getValor() > 3000;
	}

}
