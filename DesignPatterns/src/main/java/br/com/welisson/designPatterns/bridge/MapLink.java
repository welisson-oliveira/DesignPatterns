package br.com.welisson.designPatterns.bridge;

/**
 * {@link MapLink}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class MapLink implements Mapa {
	@Override public String devolveMapa(String rua) {
		return "mapa do mapLink";
	}
}
