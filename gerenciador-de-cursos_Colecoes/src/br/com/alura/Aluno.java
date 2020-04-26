package br.com.alura;

public class Aluno {

	private String nome;

	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome nao pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return String.format("[Aluno: %s, matricula: %d]", this.nome, this.numeroMatricula);
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
	/*
	 * Esse Override se faz necessario para corrigir um problema de espalhamento de tabelas Hash.
	 * Neste caso, vou pegar a primera letra do nome e usar ele como referencia para a criacao do Hashcode.
	 * 
	 * Na pratica, eh como se criasse um hash com nomes comecados com a letra A, outro hash com letra B e assim por diante.
	 * 
	 * O Espalhamento automatico segue uma regra "maluca" para criar o hashcode.
	 * 
	 * Sempre implemente um hashcode 
	 */
	@Override
	public int hashCode() {
		//return super.hashCode();
		//return this.nome.charAt(0);
		return this.nome.hashCode();
	}

}
