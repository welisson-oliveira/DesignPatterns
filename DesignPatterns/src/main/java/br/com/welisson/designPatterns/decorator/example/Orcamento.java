package br.com.welisson.designPatterns.decorator.example;

public class Orcamento {

	private final double valor;

	public Orcamento(final double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}

}
