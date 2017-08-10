package br.com.welisson.designPatterns.command;

import java.time.LocalDate;

/**
 * {@link Pedido}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Pedido {
	private String cliente;
	private double valor;
	private Status status;
	private LocalDate dataFinalizacao;


	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public void paga() {
		System.out.println("Pagando pedido: do cliente: "+cliente);
		status = Status.PAGO;
	}

	public void finaliza() {
		System.out.println("Finalizando pedido: do cliente: "+cliente);
		dataFinalizacao = LocalDate.now();
		status = Status.ENTREGUE;
	}

}
