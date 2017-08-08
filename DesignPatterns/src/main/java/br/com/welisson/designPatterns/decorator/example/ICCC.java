package br.com.welisson.designPatterns.decorator.example;

import br.com.welisson.designPatterns.decorator.example.chain.CalculaICCC;

public class ICCC extends Imposto {

	public ICCC(Imposto nextImposto) {
		super(nextImposto);
	}
	
	public ICCC() {
	}

	public double calcula(Orcamento orcamento) {
		return new CalculaICCC().calcula(orcamento) + calculaProximo(orcamento);
	}

}
