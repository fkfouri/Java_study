package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperOutros {

	public static void main(String[] args) {

		Integer idadeRef = new Integer(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing

		Double dRef = 3.2;
		dRef = Double.valueOf(3.2);// autoboxing
		System.out.println(dRef.doubleValue());// unboxing

		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

		/*
		 * Heranca de poliformismo da classe java.lang.Number
		 */
		Number refNumero = Double.valueOf(3.14);
		refNumero = Float.valueOf(29.9f); //float literal
		System.out.println(refNumero);

		/*
		 * Criando uma lista que receba diversos formatos de numeros
		 * */
		
		List<Number> lista = new ArrayList<Number>();
		lista.add(10); //inteiro
		lista.add(32.6);
		lista.add(2.5f); //float literal
		
	}

}
