
public class TestaValores {
	
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// uma variavel do tipo primitiva nao segue a outra, mas sim, copia/atribui valores
		System.out.println(segundo);
		
	}

}
