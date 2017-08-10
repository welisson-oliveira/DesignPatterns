package br.com.welisson.designPatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link FilaDeTrabalho}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class FilaDeTrabalho {
	private List<Comando> comandos;

	public FilaDeTrabalho(){
		comandos = new ArrayList<>();
	}

	public void adiciona(Comando comando){
		comandos.add(comando);
	}

	public void processa(){
		for (Comando comando : comandos){
			comando.executa();
		}
	}
}
