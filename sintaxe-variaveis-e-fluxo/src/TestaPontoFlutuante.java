
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 1234.50;
		
		System.out.println("o salário é " + salario);
		
		double divisao = 3.14 / 2;
		
		System.out.println("resultado é " + divisao);
		
		int outraDivisao = 5/2;
		System.out.println("o resultado esperado é inteiro truncado: " + outraDivisao );
		
		double novaTentativa = 5/2; 
		System.out.println("o Java primeiro faz a conta, e depois atribui o valor. Importante dizer que ele truncou, para depois descobrir que era double.");
		System.out.println(novaTentativa);
		
		double novaTentativa2 = 5.0/2; 
		System.out.println("bastava que um deles fosse do tipo double.");
		System.out.println(novaTentativa2);
	}

}
