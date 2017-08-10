package br.com.welisson.designPatterns.facadeESingleton;

/**
 * {@link EmpresaFacadeSingleton}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class EmpresaFacadeSingleton {
	private static EmpresaFacade instancia;

	public EmpresaFacade getInstancia() {
		if(instancia == null) {
			instancia = new EmpresaFacade();
		}

		return instancia;
	}
}
