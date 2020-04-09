
//isso eh um schema de uma conta
// eh uma especificacao do que eh uma conta
class Conta {

	// 4 caracteristicas // 4 atributos
	private double saldo;
	int agencia = 48;
	int numero;
	Cliente titular;

	// isso eh um metodo, uma maneira de fazer algo
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;

	}
	
	public double getSaldo() {
		return saldo;
	}
}