
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);

		System.out.println(conta.saldo);

		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaMarcena = new Conta();
		contaMarcena.deposita(1000);

		if (contaMarcena.tranfere(300, conta)) {
			System.out.println("transferido com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		

		System.out.println(contaMarcena.saldo);
		System.out.println(conta.saldo);
	}

}
