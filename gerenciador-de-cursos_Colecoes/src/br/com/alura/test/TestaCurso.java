package br.com.alura.test;

import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

		if (false) {
			// Uma boa pratica e que o objeto apenas consiga manipular o seus objetos
			List<Aula> aulas = javaColecoes.getAulas();
			System.out.println(aulas);
			aulas.add(new Aula("Trabalhando com Arraylst", 21));

			System.out.println(aulas);
			System.out.println(javaColecoes.getClass());
			System.out.println(aulas == javaColecoes.getAulas());
		} else {
			//Gostaria de nao permitir que as pessoas pudessem invocar o metodo add do getAulas().
			
			//javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylst", 21));
			javaColecoes.adiciona(new Aula("Trabalhando com Arraylst", 21));

			javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
			javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
			
			System.out.println(javaColecoes.getAulas());
		}

	}
}
