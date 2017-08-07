package br.com.welisson.designPatterns.strategy.exercice1;

public class CalculadorDeImposto {
	
	private final Orcamento orcamento;
	private final Imposto imposto;

	public CalculadorDeImposto(final Orcamento orcamento, final Imposto imposto) {
		this.orcamento = orcamento;
		this.imposto = imposto;
	}
	
	public double calculaImposto(){
		return imposto.calcula(orcamento);
	}
	
}
