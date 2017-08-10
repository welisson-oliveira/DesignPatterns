package br.com.welisson.designPatterns.visitor;

/**
 * {@link Programa}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Programa {

	public static void main(String... args){
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(7));

		Expressao conta = new Soma(esquerda, new RaizQuadrada(direita));

		int resultado = conta.avalia();
		System.out.println(resultado);

		Visitor visitor = new ImpressoraVisitor();
		conta.aceita(visitor);
		System.out.println();

		Visitor visitorPrefixa = new ImpressoraVisitorPreFixa();
		conta.aceita(visitorPrefixa);
		System.out.println();
	}

}
