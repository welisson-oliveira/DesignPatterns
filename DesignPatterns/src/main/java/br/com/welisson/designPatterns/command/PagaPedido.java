package br.com.welisson.designPatterns.command;

/**
 * {@link PagaPedido}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class PagaPedido implements Comando {
	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	@Override public void executa() {
		pedido.paga();
	}
}
