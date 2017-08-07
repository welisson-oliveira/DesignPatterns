package br.com.welisson.designPatterns.decorator.exercice2;

public class IKCV extends TemplateDeImpostoCondicional {

	public IKCV(Imposto proximoImposto) {
		super(proximoImposto);
	}
	
	public IKCV() {
		super(null);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getTotal() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			return orcamento.getTotal() * 0.10 + calculaProximo(orcamento);
		} else {
			return orcamento.getTotal() * 0.06 + calculaProximo(orcamento);
		}
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() * 0.10;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getTotal() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

}
