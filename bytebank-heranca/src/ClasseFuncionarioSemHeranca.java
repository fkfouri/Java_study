
public class ClasseFuncionarioSemHeranca {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - Funcionario comum, 1 - Gerente, 2 - Diretor

	
	//essa estrutura de IF tende aparecer em outros pontos da classe e tende a crescer cada vez que um novo tipo de funcionario aparecer.
	// A Heranca resolve este problema.
	public double getBonificacao() {
		if (this.tipo == 0) { // 0 - Funcionario comu
			return this.salario * 0.1;
		} else if (this.tipo == 1) { // 1 - Gerente
			return this.salario;
		} else { // 2 - Diretor
			return this.salario + 1000;
		}

	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

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
