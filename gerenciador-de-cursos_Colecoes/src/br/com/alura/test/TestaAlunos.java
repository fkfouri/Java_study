package br.com.alura.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		//lembra o conceito de conjuntos
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo"); 
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Nico");
		alunos.add("Mauricio");
		alunos.add("Alberto");
		alunos.add("Fabio");
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("-------------");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println("-------------");
		
		System.out.println(alunos.contains("Tiago"));
		
		
		//tranformando em ArrayList recebendo colecoes
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}

}
