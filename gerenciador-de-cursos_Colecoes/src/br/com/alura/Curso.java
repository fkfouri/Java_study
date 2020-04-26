package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	/*
	 * deixo de uma forma mais poliformico, ou seja, de um modo mais generico quanto
	 * menos voce se compromete com o objeto e com tudo com o que ele faz voce ganha
	 * coesao e baixo acoplamento
	 */
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}



	public List<Aula> getAulas() {
		// return aulas;

		// os livros de boa pratica de OO, indicam que facemos uma programacao
		// defensiva, ou seja, nao deveolver as referencias dos objetos,
		// mas passe uma copia (imutavel) do objeto. Tipo um ReadOnly
		// uma forma de inibir o remove, add e sort. As outras operaçoes estao normais.

		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);

	}

	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : this.aulas) {
//			tempoTotal += aula.getTempo();
//		}
//
//		return tempoTotal;
		
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
		// this.aulas.forEach((e)-> tempoTotal += e.getTempo());

	

	}
	
	@Override
	public String toString() {
		return "[Curso: " + this.nome +", tempo total: " + this.getTempoTotal() + "]";
	}



	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}



	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}



	public Aluno buscaMatriculado(int numero) {
//		//ate agora estamos trabalhando com colecoes
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero);
//			return aluno;
//		}
//		//return null; // evitar o retorno null
//		throw new NoSuchElementException("matricula nao encontrada");
		
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("matricula nao encontrada");
		
		return matriculaParaAluno.get(numero);
	}

}
