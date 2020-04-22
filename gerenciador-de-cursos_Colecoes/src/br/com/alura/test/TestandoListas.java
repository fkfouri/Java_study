package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<String>();

		// metodo add
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		// metodo remove
		aulas.remove(0);

		System.out.println(aulas);

		// metodo get
		String primeiraAula = aulas.get(0);
		System.out.println("A primeria aula é " + primeiraAula);

		// laco for
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// for incremental com metodo size
		for (int i = 0; i > aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		// metodo foreach
		aulas.forEach((i) -> System.out.println("Aula: " + i.toString()));

		// metodo foreach
		aulas.forEach((i) -> {
			System.out.println("percorrendo: ");
			System.out.println("Aula: " + i.toString());
		});
		
		
		aulas.add("Aumentando nosso conhecimento");
		
		System.out.println(aulas);
		//metodo de ordenacao
		Collections.sort(aulas); //Ordem lexicografica (
		System.out.println(aulas);
		
		
	}

}
