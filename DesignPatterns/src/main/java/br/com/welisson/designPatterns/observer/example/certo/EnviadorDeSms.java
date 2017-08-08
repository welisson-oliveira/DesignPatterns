package br.com.welisson.designPatterns.observer.example.certo;

/**
 * {@link EnviadorDeSms}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class EnviadorDeSms implements AcaoAposGerarNota {
	@Override public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por sms");
	}
}
