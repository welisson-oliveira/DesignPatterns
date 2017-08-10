package br.com.welisson.designPatterns.visitor;

/**
 * {@link ImpressoraVisitor}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class ImpressoraVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");

		soma.getEsquerda().aceita(this);

		System.out.print("+");

		soma.getDireita().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");

		subtracao.getEsquerda().aceita(this);

		System.out.print("-");

		subtracao.getDireita().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print("(");

		multiplicacao.getEsquerda().aceita(this);

		System.out.print("*");

		multiplicacao.getDireita().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.print("(");

		System.out.print("√");
		raizQuadrada.getRadicando().aceita(this);

		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print("(");

		divisao.getEsquerda().aceita(this);

		System.out.print("*");

		divisao.getDireita().aceita(this);

		System.out.print(")");
	}
}
