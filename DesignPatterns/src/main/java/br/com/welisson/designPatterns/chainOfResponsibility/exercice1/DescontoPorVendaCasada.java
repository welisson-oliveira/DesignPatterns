package br.com.welisson.designPatterns.chainOfResponsibility.exercice1;

public class DescontoPorVendaCasada implements Desconto {

	@Override
	public double calcula(Orcamento orcamento, Desconto proximoDesconto) {
		if(podeCalcular(orcamento)){
			return orcamento.getTotal() * 0.05;
		}
		return proximoDesconto.calcula(orcamento, null);
	}

	@Override
	public boolean podeCalcular(Orcamento orcamento) {
		boolean caneta = orcamento.existe("CANETA");
		boolean lapis = orcamento.existe("LAPIS");
		
		return caneta && lapis;
	}

}
