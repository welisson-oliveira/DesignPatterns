package br.com.welisson.designPatterns.observer.exercice1;

/**
 * {@link EnviadorDeEmail}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class EnviadorDeEmail implements AcaoAposGerarNota {
	@Override public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por e-mail");
	}
}
