package br.com.welisson.designPatterns.decorator.exemple.chain;

import br.com.welisson.designPatterns.decorator.exemple.Orcamento;

public class CalculaICCC {
	
	public double calcula(final Orcamento orcamento){
		final CalculoICCC calculoICCC = new MenorQueMil();
		return calculoICCC.calcularICCC(orcamento, new EntreMilETresMil());
	}
	
}
