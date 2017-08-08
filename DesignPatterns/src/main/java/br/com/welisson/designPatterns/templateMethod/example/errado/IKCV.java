package br.com.welisson.designPatterns.templateMethod.example.errado;

public class IKCV implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getTotal() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			return orcamento.getTotal() * 0.10;
		} else {
			return orcamento.getTotal() * 0.06;
		}
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

}
