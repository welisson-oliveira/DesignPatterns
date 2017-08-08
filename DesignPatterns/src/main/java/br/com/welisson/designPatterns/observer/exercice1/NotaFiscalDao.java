package br.com.welisson.designPatterns.observer.exercice1;

/**
 * {@link NotaFiscalDao}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class NotaFiscalDao implements AcaoAposGerarNota {
	@Override public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}
}
