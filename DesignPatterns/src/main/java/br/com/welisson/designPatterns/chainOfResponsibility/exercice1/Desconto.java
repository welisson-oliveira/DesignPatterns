package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public interface Desconto {
	double calcula(Orcamento orcamento, Desconto proximoDesconto);
	
	boolean podeCalcular(Orcamento orcamento);
}
