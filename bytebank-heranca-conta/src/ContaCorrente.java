
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero)  {
		super(agencia, numero);
		
	}
	
	
	//tem uma taxa para saque de Conta Corrente
	
	@Override  //Isso eh uma anotacao do codigo java; serve para o compilador saber a sua intencao com o metodo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; // taxa de 20 centavos por saque.
		return super.saca(valorASacar);
	}

}
