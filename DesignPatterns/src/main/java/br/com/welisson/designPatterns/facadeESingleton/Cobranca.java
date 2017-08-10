package br.com.welisson.designPatterns.facadeESingleton;

/**
 * {@link Cobranca}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Cobranca {
	private final Tipo boleto;
	private final Fatura fatura;

	public Cobranca(Tipo boleto, Fatura fatura) {

		this.boleto = boleto;
		this.fatura = fatura;
	}

	public void emite() {

	}
}
