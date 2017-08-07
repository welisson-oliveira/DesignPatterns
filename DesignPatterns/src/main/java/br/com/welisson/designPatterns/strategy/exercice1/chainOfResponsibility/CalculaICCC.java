package br.com.welisson.designPatterns.strategy.exercice1.chainOfResponsibility;

import br.com.welisson.designPatterns.strategy.exercice1.Orcamento;

public class CalculaICCC {
	
	public double calcula(final Orcamento orcamento){
		final CalculoICCC calculoICCC = new MenorQueMil();
		return calculoICCC.calcularICCC(orcamento, new EntreMilETresMil());
	}
	
}
