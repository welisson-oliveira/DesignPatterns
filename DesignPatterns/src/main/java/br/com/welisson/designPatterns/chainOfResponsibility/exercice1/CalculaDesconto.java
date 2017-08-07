package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public class CalculaDesconto {
	
	private final Desconto desconto;
	private final Orcamento orcamento;
	
	public CalculaDesconto(Orcamento orcamento) {
		this.desconto = new DescontoPorValor();
		this.orcamento = orcamento;
	}
	
	public double calcular(){
		return desconto.calcula(orcamento, new DescontoPorItem());
	}
	
}
