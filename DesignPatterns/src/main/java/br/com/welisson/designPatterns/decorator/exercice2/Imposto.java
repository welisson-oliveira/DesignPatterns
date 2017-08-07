package br.com.welisson.designPatterns.decorator.exercice2;

public abstract class Imposto {
	protected final Imposto proximoImposto;

	public Imposto(Imposto proximoImposto) {
		this.proximoImposto = proximoImposto;
	}
	
	public Imposto(){
		this.proximoImposto = null;
	}

	protected abstract double calcula(Orcamento orcamento);
	
	protected final double calculaProximo(Orcamento  orcamento){
		return proximoImposto != null ? proximoImposto.calcula(orcamento) : 0;
	}
}
