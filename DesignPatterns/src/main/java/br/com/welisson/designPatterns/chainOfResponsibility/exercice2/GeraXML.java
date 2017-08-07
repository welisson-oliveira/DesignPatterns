package br.com.welisson.designPatterns.chainOfResponsibility.exercice2;

import java.lang.reflect.Field;

public class GeraXML implements GeradorDeResposta {

	@Override
	public String gerar(final Conta conta) throws IllegalArgumentException, IllegalAccessException {
		final Class<?> clazz = conta.getClass();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<"+clazz.getSimpleName()+">\n");
		for(Field field : clazz.getDeclaredFields()){
			stringBuilder.append("<"+field.getName()+">");
			field.setAccessible(true);
			stringBuilder.append("<"+field.get(conta)+">");
			stringBuilder.append("</"+field.getName()+">\n");
		}
		stringBuilder.append("</"+clazz.getSimpleName()+">\n");
		return stringBuilder.toString();
	}

}
