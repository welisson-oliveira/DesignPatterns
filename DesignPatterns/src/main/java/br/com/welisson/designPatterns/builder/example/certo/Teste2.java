package br.com.welisson.designPatterns.builder.example.certo;

/**
 * {@link Teste2}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class Teste2 {
	public static void main(String... args){
		NotaFiscal criador = new NotaFiscalBuilder()
		.paraEmpresa("Caelum")
		.comCnpj("123.456.789/0001-00")
		.addItem(new ItemDaNota("item 1", 100.0))
		.addItem(new ItemDaNota("item 2", 200.0))
		.addItem(new ItemDaNota("item 3", 300.0))
		.comObservacoes("entregar nf pessoalmente")
		.naDataAtual().builder();
	}
}
