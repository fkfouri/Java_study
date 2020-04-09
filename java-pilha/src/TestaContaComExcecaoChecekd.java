
public class TestaContaComExcecaoChecekd {

	public static void main(String[] args) {
		Conta2 c = new Conta2();
		
		try {
			c.deposita();
		} catch (MinhaExceptionChecked e) {
			System.out.println("tratamento....");
		}
		

	}

}
