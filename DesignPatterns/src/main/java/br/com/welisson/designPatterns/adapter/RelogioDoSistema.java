package br.com.welisson.designPatterns.adapter;

import java.util.Calendar;

/**
 * {@link RelogioDoSistema}
 *
 * @author Welisson Oliveira
 * @version 1.0 10/08/2017
 */
public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}
