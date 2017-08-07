package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public class DescontoPorItem implements Desconto {

	public double calcula(Orcamento orcamento, Desconto proximoDesconto) {
		if(podeCalcular(orcamento)){
			return orcamento.getTotal() * 0.1;
		}
		return proximoDesconto.calcula(orcamento, new SemDesconto());
	}

	public boolean podeCalcular(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

}
