package br.com.alura.test;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Arraylst", 21));

		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
		
		
		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Guilherme", 5617);
		Aluno a3 = new Aluno("Mauricio", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os aluno matriculados: ");
		javaColecoes.getAlunos().forEach(a -> System.out.println(a));
		
		System.out.println("O aluno " + a1 + " esta matriculado? " + javaColecoes.estaMatriculado(a1));
		
		
		
		//Equals
		/*
		 * Embora esteja matriculado, o JAva vai entender como dois objetos distintos
		 * 
		 */
		Aluno novoAluno = new Aluno("Rodrigo", 34672);
		System.out.println("O aluno " + novoAluno.getNome() + " esta matriculado? ");
		System.out.println( javaColecoes.estaMatriculado(novoAluno));
		
		System.out.println("O a1 é equals ao Rodrigo?");
		System.out.println(a1.equals(novoAluno)); //Preciso reescrever o metodo equals na classe Aluno
		
		///obrigatoriamente o seguinte eh true
		System.out.println(a1.hashCode() == novoAluno.hashCode());
	}

}
