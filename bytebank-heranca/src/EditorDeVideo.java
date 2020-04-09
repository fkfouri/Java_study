// Gerente eh um funcionario, gerente herda da class Funcionario
public class EditorDeVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamado o metodo de bonificacao do EDITOR DE VIDEO");
		//return super.getBonificacao() + 100;//implementado metodo abastrato
		return 150;
	}

	
}
