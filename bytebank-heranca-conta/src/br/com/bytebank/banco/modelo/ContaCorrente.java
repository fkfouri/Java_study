package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero)  {
		super(agencia, numero, "Corrente");
	}
	
	
	//tem uma taxa para saque de Conta Corrente
	
	@Override  //Isso eh uma anotacao do codigo java; serve para o compilador saber a sua intencao com o metodo
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2; // taxa de 20 centavos por saque.
		super.saca(valorASacar);
	}


	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}


	@Override
	public void deposita(double valor) {
		super.saldo += valor;
			}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
