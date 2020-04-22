package br.com.alura.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylst", 21));

		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();	
		System.out.println(aulasImutaveis);
		
		//e uma especie de clone
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		// encontrando o total de tempo dos cursos
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);

	}
}
