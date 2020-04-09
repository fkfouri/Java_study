
public class TestaTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 333);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
