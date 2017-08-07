package br.com.welisson.designPatterns.strategy.exercice2;

public class Conservador extends AbstractInvestimento {
	
	public void investir(final Conta conta){
		conta.deposita(subtraiImposto(conta.getSaldo() * 0.008));
	}

	
}
