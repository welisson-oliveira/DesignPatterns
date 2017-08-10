package br.com.welisson.designPatterns.visitor;

/**
 * {@link Visitor}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public interface Visitor {

	void visitaSoma(Soma soma);
	void visitaSubtracao(Subtracao subtracao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	void visitaDivisao(Divisao divisao);
	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
	void visitaNumero(Numero numero);
}
