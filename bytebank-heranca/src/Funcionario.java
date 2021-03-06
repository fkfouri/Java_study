
// Classe MAE, Classe PAI, Base Class, Super Class
public abstract class Funcionario {

	private String nome;
	private String cpf; //visivel somente nessa classe
	private double salario; //visivel para as classes filhos
	
//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
