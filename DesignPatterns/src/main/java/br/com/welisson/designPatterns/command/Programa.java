package br.com.welisson.designPatterns.command;

/**
 * {@link Programa}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Programa {

	public static void main(String... args){
		Pedido pedido1 = new Pedido("Welisson", 150.0);
		Pedido pedido2 = new Pedido("Wilson", 250.0);

		FilaDeTrabalho fila = new FilaDeTrabalho();
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido1));

		fila.processa();
	}
}
