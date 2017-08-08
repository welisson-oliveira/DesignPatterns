package br.com.welisson.designPatterns.factory.exemplo.errado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * {@link JDBCExemplo}
 *	Imagine que em todo lugar que você precise de uma conexão de banco de dados, você tenha que adicionar essa linha de Connection</br>
 *	E quando a conexão mudasse? Seria necessário alterar toda classe que fizesse conexão com o Banco de dados.</ br>
 *	Em casos como esse seria melhor utilizar o padrão Factory.
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class JDBCExemplo {
	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/fj21");
		System.out.println("Conectado!");
		conexao.close();
	}
}