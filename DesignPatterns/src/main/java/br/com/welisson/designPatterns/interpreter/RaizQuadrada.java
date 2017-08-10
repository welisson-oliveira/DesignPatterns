package br.com.welisson.designPatterns.interpreter;

/**
 * {@link RaizQuadrada}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao){
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}
}
