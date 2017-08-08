package br.com.welisson.designPatterns.observer.exercice1;

/**
 * {@link Impressora}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class Impressora implements AcaoAposGerarNota {
	@Override public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}
