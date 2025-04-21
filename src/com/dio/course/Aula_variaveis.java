package com.dio.course;

import java.util.Locale;

public class Aula_variaveis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//tipos primitivos
		final double VALOR_DE_PI = 3.14;//constante
		
		String meuNome = "Jocélio";
		
		byte idade = 41;
		short ano = 2024;
		int cep = 62870000;
		long cpf = 66105263292L;
		float altura = 1.86F;
		double salario = 8000.0;
		int salario2 = (int) 8000.0;//casting

	}

}
