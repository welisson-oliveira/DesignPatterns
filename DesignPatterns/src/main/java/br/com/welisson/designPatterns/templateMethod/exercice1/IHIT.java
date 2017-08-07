package br.com.welisson.designPatterns.templateMethod.exercice1;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	public final double impostoMinimo(Orcamento orcamento) {
		return 0.01 * orcamento.getItens().size();
	}

	@Override
	public final double impostoMaximo(Orcamento orcamento) {
		return 0.13 * orcamento.getTotal() + 100;
	}

	@Override
	public final boolean itensIguais(Orcamento orcamento) {
		return orcamento.itensIguais();
	}

}
