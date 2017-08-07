package br.com.welisson.designPatterns.decorator.exemple;

public class ISS extends Imposto{

	public ISS(Imposto nextImposto) {
		super(nextImposto);
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaProximo(orcamento);
	}
	
}
