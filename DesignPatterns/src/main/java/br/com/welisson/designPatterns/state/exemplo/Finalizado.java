package br.com.welisson.designPatterns.state.exemplo;

/**
 * {@link Finalizado}
 *
 * @author focusnetworks
 * @version 1.0 07/08/2017
 */
public class Finalizado implements EstadoDeUmOrcamento {
	@Override public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser Aprovados");
	}

	@Override public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser Reprovados");
	}

	@Override public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser Finalizados novamente");
	}

}
