package br.com.welisson.designPatterns.state.example;

/**
 * {@link EmAprovacao}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class EmAprovacao implements EstadoDeUmOrcamento {
	@Override public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.getValor() * 0.05;
	}

	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.estadoAtual = new Aprovado();
	}

	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.estadoAtual = new Reprovado();
	}

	public void finaliza(Orcamento orcamento) {
		// daqui não posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}
}
