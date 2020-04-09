package br.com.bytebank.banco.modelo;

//FQN => br.com.bytebank.banco.modelo.CalculadorDeImposto
public class CalculadorDeImposto {

	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
