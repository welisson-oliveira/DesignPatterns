package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public class SemDesconto implements Desconto {

	public double calcula(Orcamento orcamento, Desconto proximoDesconto) {
		return 0;
	}

	public boolean podeCalcular(Orcamento orcamento) {
		return false;
	}

}
