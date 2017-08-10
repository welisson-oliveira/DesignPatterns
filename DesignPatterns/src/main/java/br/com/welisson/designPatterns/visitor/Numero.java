package br.com.welisson.designPatterns.visitor;

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

	@Override public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}

	public int getNumero() {
		return numero;
	}
}
