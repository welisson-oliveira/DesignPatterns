package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

import java.lang.reflect.Field;

public class GeraPorcento implements GeradorDeResposta {

	@Override
	public String gerar(Conta conta) throws IllegalArgumentException, IllegalAccessException {
		final Class<?> clazz = conta.getClass();
		StringBuilder stringBuilder = new StringBuilder();
		for(Field field : clazz.getDeclaredFields()){
			field.setAccessible(true);
			stringBuilder.append(""+field.get(conta)+"%");
		}
		return stringBuilder.toString();
	}

}
