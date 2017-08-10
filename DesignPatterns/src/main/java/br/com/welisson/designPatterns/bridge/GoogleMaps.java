package br.com.welisson.designPatterns.bridge;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * {@link GoogleMaps}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		String googleMaps = "http://maps.google.com.br/maps?q=rua+vergueiro";
		final URL url;
		try {
			url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			// ler inputStream
			return "mapa";
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
