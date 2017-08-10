package br.com.welisson.designPatterns.facadeESingleton;

/**
 * {@link Fatura}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Fatura {
	private final Cliente cliente;
	private final double valor;

	public Fatura(Cliente cliente, double valor) {

		this.cliente = cliente;
		this.valor = valor;
	}
}
