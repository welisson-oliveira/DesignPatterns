package br.com.welisson.designPatterns.strategy.exercice2;

public class RealizadorDeInvestimentos {
	private final Investimento investimento;
	private final Conta conta;

	public RealizadorDeInvestimentos(final Investimento investimento, final Conta conta) {
		this.investimento = investimento;
		this.conta = conta;
	}
	
	public void investir(){
		investimento.investir(conta);
	}
	
}
