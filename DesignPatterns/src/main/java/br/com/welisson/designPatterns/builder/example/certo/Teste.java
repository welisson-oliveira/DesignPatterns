package br.com.welisson.designPatterns.builder.example.certo;

/**
 * {@link Teste}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class Teste {
	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.paraEmpresa("Caelum");
		criador.comCnpj("123.456.789/0001-00");
		criador.addItem(new ItemDaNota("item 1", 100.0));
		criador.addItem(new ItemDaNota("item 2", 200.0));
		criador.addItem(new ItemDaNota("item 3", 300.0));
		criador.comObservacoes("entregar nf pessoalmente");
		criador.naDataAtual();
	}

}
