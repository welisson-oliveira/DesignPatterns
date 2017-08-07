package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public interface GeradorDeResposta {
	String gerar(Conta conta) throws IllegalArgumentException, IllegalAccessException;
}
