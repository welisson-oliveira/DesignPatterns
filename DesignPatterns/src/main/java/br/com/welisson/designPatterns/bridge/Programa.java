package br.com.welisson.designPatterns.bridge;

import java.io.IOException;

/**
 * {@link Programa}
// *	Quando voce cria uma interface que a implementação concreta dela te leva para outro sistema,<br />
 * você esta usando o padrão Bridge
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class Programa {
	public static void main (String... args) throws IOException {
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");
	}
}