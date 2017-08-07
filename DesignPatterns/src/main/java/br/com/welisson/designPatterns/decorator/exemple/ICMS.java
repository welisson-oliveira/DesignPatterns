package br.com.welisson.designPatterns.decorator.exemple;

public class ICMS extends Imposto{

	public ICMS(Imposto nextImposto) {
		super(nextImposto);
	}
	
	public ICMS() {
	}

	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50 + calculaProximo(orcamento);
	}

}
