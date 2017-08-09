package br.com.welisson.designPatterns.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link NotasMusicais}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class NotasMusicais {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	public NotasMusicais(){
		initNotas();
	}

	private static void initNotas(){

		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());

	}

	public Nota pega(String nome){
		return notas.get(nome);
	}
}
