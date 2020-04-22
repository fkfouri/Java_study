package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando as Arraylists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		//precisei implementar o contrato de Comparable<Aula> na classe Aula e definir o metodo compareTo
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//ordenando pela referencia de tempo eusando o Comparator
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		//ordenacao pelo metodo sort da propria classe
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.out.println(aulas);
		
	}

}
