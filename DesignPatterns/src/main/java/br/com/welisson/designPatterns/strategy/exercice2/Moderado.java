package br.com.welisson.designPatterns.strategy.exercice2;

public class Moderado extends AbstractInvestimento {

	public void investir(Conta conta){
		double porcentangem = geraPorcentagem();
		if(porcentangem < 0.5){
			conta.deposita(subtraiImposto(conta.getSaldo() * 0.007));
		}else{
			conta.deposita(subtraiImposto((conta.getSaldo() * 0.025)));
		}
	}

}
