package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura (Schema) de uma conta.
 * 
 * @author fkfouri
 * 
 */
public abstract class Conta {
	//isso eh um schema de uma conta
	// eh uma especificacao do que eh uma conta

	// 4 caracteristicas // 4 atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; // um atributo da classe e nao mais do objeto

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta");
	}

	// isso eh um metodo, uma maneira de fazer algo
	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param valor
	 */
	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void tranfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode ter numero menor que zero");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ter agencia negativa");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		// dentro do metodo static nao eh possivel chamar o this do objeto
		return Conta.total;
	}

}