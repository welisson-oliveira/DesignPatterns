package br.com.welisson.designPatterns.templateMethod.exercice1;

public class CalculaImposto {
	
	private Orcamento orcamento;
	private Imposto imposto;

	public CalculaImposto(Orcamento orcamento, Imposto imposto){
		this.orcamento = orcamento;
		this.imposto = imposto;
	}
	
	public double calcular(){
		return imposto.calcula(orcamento);
	}
	
}
