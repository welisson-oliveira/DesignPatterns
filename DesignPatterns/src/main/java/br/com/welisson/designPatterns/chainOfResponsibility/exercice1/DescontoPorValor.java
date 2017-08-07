package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public class DescontoPorValor implements Desconto {

	public double calcula(Orcamento orcamento, Desconto proximoDesconto) {
		if(podeCalcular(orcamento)){
			return orcamento.getTotal() * 0.07;
		}
		return proximoDesconto.calcula(orcamento, new DescontoPorVendaCasada());
	}

	public boolean podeCalcular(Orcamento orcamento) {
		return orcamento.getTotal() > 500;
	}

}
