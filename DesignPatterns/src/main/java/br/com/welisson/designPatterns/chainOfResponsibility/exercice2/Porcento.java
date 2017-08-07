package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public class Porcento implements Resposta {

	@Override
	public String responde(Requisicao requisicao, Conta conta, Resposta resposta) {
		if (podeResponder(requisicao)) {
			GeradorDeResposta geradorDeResposta = new GeraPorcento();
			try {
				return geradorDeResposta.gerar(conta);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Impossivel gerar Resposta");
	}

	@Override
	public boolean podeResponder(Requisicao requisicao) {
		return requisicao.getFormato().equals(Formato.PORCENTO);
	}

}
