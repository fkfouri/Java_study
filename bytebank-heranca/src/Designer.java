// Gerente eh um funcionario, gerente herda da class Funcionario
public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamado o metodo de bonificacao do DESIGNER");
		return 200;
	}

	
}
