
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		// conta.setAgencia(-50);
		// conta.setNumero(-330);

		System.out.println(conta.getAgencia());

		Conta conta2 = new Conta(1337, 12345);
		System.out.println(conta2.getAgencia());

		Conta conta3 = new Conta(122, 908);
		System.out.println(conta3.getAgencia());
		
		
		System.out.println("O total de contas � " + Conta.getTotal());

	}

}
