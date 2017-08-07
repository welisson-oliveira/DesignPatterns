package br.com.welisson.designPatterns.strategy.exercice1;

import br.com.welisson.designPatterns.strategy.exercice1.chainOfResponsibility.CalculaICCC;

public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {
		return new CalculaICCC().calcula(orcamento);
	}

}
