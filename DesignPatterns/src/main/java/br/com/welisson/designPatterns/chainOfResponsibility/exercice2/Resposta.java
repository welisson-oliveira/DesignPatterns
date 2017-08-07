package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public interface Resposta {
	String responde(Requisicao requisicao, Conta conta, Resposta nextResposta);
	
	boolean podeResponder(Requisicao requisicao);
}
