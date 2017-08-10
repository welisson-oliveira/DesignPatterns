package br.com.welisson.designPatterns.interpreter;

/**
 * {@link Numero}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Numero implements Expressao {

	private int numero;
	public Numero(int numero){
		this.numero = numero;
	}

	@Override public int avalia() {
		return numero;
	}
}
