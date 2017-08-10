package br.com.welisson.designPatterns.interpreter;

/**
 * {@link Soma}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Soma implements Expressao {
	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaDireita + resultadoDaEsquerda;
	}
}
