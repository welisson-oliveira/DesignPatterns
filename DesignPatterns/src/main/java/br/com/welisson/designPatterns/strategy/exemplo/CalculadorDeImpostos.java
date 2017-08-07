package br.com.welisson.designPatterns.strategy.exemplo;

public class CalculadorDeImpostos {
	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {

		return imposto.calcula(orcamento);

	}
}
