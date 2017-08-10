package br.com.welisson.designPatterns.command;

/**
 * {@link ConcluiPedido}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class ConcluiPedido implements Comando {

	private Pedido pedido;
	public ConcluiPedido(Pedido pedido){
		this.pedido = pedido;
	}

	@Override public void executa() {
		pedido.finaliza();
	}
}
