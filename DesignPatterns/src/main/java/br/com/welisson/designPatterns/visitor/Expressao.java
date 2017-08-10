package br.com.welisson.designPatterns.visitor;

/**
 * {@link Expressao}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public interface Expressao {
	int avalia();

	void aceita(Visitor visitor);

}
