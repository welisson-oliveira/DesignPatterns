package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public class CSV implements Resposta {

	@Override
	public String responde(Requisicao requisicao, Conta conta, Resposta nextResposta) {
		if (podeResponder(requisicao)) {
			GeradorDeResposta geradorDeResposta = new GeraCSV();
			try {
				return geradorDeResposta.gerar(conta);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return nextResposta.responde(requisicao, conta, null);

	}

	@Override
	public boolean podeResponder(Requisicao requisicao) {

		return requisicao.getFormato().equals(Formato.CSV);
	}

}
