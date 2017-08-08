package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link EmAprovacao}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class EmAprovacao implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {

		if(!descontoAplicado){
			orcamento.valor -= orcamento.getValor() * 0.05;
			descontoAplicado = true;
		}else{
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}
}
