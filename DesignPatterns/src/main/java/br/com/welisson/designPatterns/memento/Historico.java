package br.com.welisson.designPatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link Historico}
 *
 * @author Welisson Oliveira
 * @version 1.0 09/08/2017
 */
public class Historico {
	private List<Estado> estadosSalvos = new ArrayList<Estado>();

	public Estado pega(int index) {
		return estadosSalvos.get(index);
	}

	public void adiciona(Estado estado) {
		estadosSalvos.add(estado);
	}
}
