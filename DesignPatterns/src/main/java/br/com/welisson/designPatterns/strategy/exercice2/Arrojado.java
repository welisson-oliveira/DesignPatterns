package br.com.welisson.designPatterns.strategy.exercice2;

public class Arrojado extends AbstractInvestimento {
	
	public void investir(Conta conta){
		double porcentagem = geraPorcentagem();
		if(porcentagem <= 0.2){
			conta.deposita(( subtraiImposto(conta.getSaldo() * 0.5)));
		}else if(porcentagem > 0.2 && porcentagem <= 0.5 ){
			conta.deposita(subtraiImposto( subtraiImposto(conta.getSaldo() * 0.3)));
		}else{
			conta.deposita(subtraiImposto( subtraiImposto(conta.getSaldo() * 0.006)));
		}
		
	}
}
