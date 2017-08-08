package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link EstadoDeUmOrcamento}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public interface EstadoDeUmOrcamento {
	void aplicaDescontoExtra(Orcamento orcamento);

	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);

}
