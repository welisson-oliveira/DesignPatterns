package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

public class XML implements Resposta {

	@Override
	public String responde(Requisicao requisicao, Conta conta, Resposta nextResposta) {
		if(podeResponder(requisicao)){
			GeradorDeResposta gerarResposta = new GeraXML();
			try {
				return gerarResposta.gerar(conta);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return nextResposta.responde(requisicao, conta, new Porcento());

	}

	@Override
	public boolean podeResponder(Requisicao requisicao) {
		return requisicao.getFormato().equals(Formato.XML);
	}

}
