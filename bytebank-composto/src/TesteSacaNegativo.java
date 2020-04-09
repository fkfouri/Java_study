
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		//isso deve ser proibido
		//conta.saldo -= 101;
		
		System.out.println(conta.getSaldo());
	}
}
