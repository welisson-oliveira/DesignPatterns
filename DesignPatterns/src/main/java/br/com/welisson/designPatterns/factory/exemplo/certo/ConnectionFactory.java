package br.com.welisson.designPatterns.factory.exemplo.certo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * {@link ConnectionFactory}
 *
 * @author Welisson Oliveira
 * @version 1.0 08/08/2017
 */
public class ConnectionFactory {

	private final Map<String, List<String>> config;
	String banco = System.getenv("tipoBanco");

	public ConnectionFactory(){
		config = new HashMap<>();
		config.put("mySql", Arrays.asList("jdbc:mysql://localhost:3306/example","root", ""));
		config.put("postgres", Arrays.asList("jdbc:postgres://localhost:5432/example","postgres", ""));
	}

	public Connection getFacConnection(){
		try {
			return DriverManager.getConnection(config.get(banco).get(0),config.get(banco).get(1),config.get(banco).get(2));
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}

