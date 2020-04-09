// Gerente eh um funcionario, gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public double getBonificacao() { //Este metodo foi reescrito, mesma assinatura da classe mae
		//return this.salario;   //this se refere a uma variavel definida nesta classe
		//return super.salario;	//super se refere a uma variavel definida pela classe mae. Mosta para o DEV que precisa subir a classe para encontrar a definicao
		
		System.out.println("Chamado o metodo de bonificacao do GERENTE");
		//return super.getBonificacao() + super.getSalario();  //implementado metodo abastrato
		
		return super.getSalario();
	}



	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	
}
