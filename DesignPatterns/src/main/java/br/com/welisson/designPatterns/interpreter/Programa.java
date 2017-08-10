package br.com.welisson.designPatterns.interpreter;

/**
 * {@link Programa}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Programa {

	public static void main(String... args){
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));

		Expressao conta = new Soma(esquerda, direita);

		int resultado = conta.avalia();
		System.out.println(resultado);

		System.out.println(new RaizQuadrada(new Numero(9)).avalia());
	}

}
