package br.com.welisson.designPatterns.command;

/**
 * {@link Comando}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
@FunctionalInterface
public interface Comando {
	void executa();
}
