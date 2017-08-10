package br.com.welisson.designPatterns.facadeESingleton;

/**
 * {@link ContatoCliente}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class ContatoCliente {
	private final Cliente cliente;
	private final Cobranca cobranca;

	public ContatoCliente(Cliente cliente, Cobranca cobranca) {

		this.cliente = cliente;
		this.cobranca = cobranca;
	}

	public void dispara() {

	}
}
