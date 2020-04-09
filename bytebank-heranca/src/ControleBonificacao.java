
public class ControleBonificacao {

	private double soma = 0;

	
	//Chamada generica
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}

	public double getSoma() {
		return soma;
	}

}
