
package br.com.welisson.designPatterns.state.exercice1;

/**
 * {@link Aprovado}
 *
 * @author Welisson Oliveira
 * @version 1.0 07/08/2017
 */
public class Orcamento {
	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
