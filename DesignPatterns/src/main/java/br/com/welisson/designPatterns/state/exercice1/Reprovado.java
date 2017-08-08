package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link Reprovado}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class Reprovado implements EstadoDeUmOrcamento {
	@Override public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser Aprovados!");
	}

	@Override public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser Reprovados novamente!");
	}

	@Override public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser Finalizados!");
	}
}
