package br.com.welisson.designPatterns.decorator.example;

public abstract class Imposto {
	private Imposto proximoImposto;
	
	public Imposto(Imposto nextImposto){
		this.proximoImposto = nextImposto;
	}
	
	public Imposto(){
	}
	
	protected abstract double calcula(Orcamento orcamento);
	
	
	protected final double calculaProximo(Orcamento orcamento){
		if(proximoImposto != null){
			return proximoImposto.calcula(orcamento);
		}
		return 0;
	}
	
}
