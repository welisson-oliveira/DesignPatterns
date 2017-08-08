package br.com.welisson.designPatterns.templateMethod.example.errado;

public class ICPP implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getTotal() > 500) {
			return orcamento.getTotal() * 0.07;
		} else {
			return orcamento.getTotal() * 0.05;
		}
	}

}
