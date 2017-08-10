package br.com.welisson.designPatterns.adapter;

import java.io.IOException;
import java.util.Calendar;

/**
 * {@link Programa}
// *	Quando voce cria uma interface que a implementação concreta dela te leva para outro sistema,<br />
 * você esta usando o padrão Bridge
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Programa {
	public static void main (String... args) throws IOException {

		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();

	}
}