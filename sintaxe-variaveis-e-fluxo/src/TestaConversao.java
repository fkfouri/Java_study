
public class TestaConversao {

	public static void main(String[] args) {

		double salario = 1234.50;
		// casting
		int valor = (int)salario;
		System.out.println(valor);
		
		//valores grandes
		long numeroGrande = 23451231234L;
		
		//valores pequenos
		short valorPequeno = 2131;
		
		byte b = 127; // vai ate 127.`
		
		float pontoFlutuante = 3.14F;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
	}

}
