package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public class ResponderRequisicao {
	
	private Requisicao requisicao;
	private Conta conta;

	public ResponderRequisicao(Requisicao requisicao, Conta conta) {
		this.requisicao = requisicao;
		this.conta = conta;
	}
	
	public String responder(){
		return new XML().responde(requisicao, conta, new CSV());
	}
	
}
