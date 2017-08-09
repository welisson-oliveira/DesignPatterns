package br.com.welisson.designPatterns.flyweight.exercice1;

import java.util.List;

/**
 * {@link Piano}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class Piano {

	public void toca(List<Nota> musica){

		StringBuilder musicaEmNotas = new StringBuilder();
		for(Nota nota : musica) {
			musicaEmNotas.append(nota.simbolo() + " ");
			System.out.println(nota);
		}

		System.out.println(musicaEmNotas);
	}
}
