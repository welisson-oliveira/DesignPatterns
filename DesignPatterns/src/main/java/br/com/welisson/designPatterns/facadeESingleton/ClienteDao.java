package br.com.welisson.designPatterns.facadeESingleton;

/**
 * {@link ClienteDao}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class ClienteDao {
	public Cliente buscaPorCpf(String cpf) {
		return new Cliente();
	}
}
