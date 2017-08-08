package br.com.welisson.designPatterns.decorator.example;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {
	}
	
	@Override
	protected double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaProximo(orcamento);
	}

}
