package br.com.welisson.designPatterns.interpreter;

/**
 * {@link Divisao}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaDireita / resultadoDaEsquerda;
	}
}
