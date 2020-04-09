
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		System.out.println(g1.getNome());
		
		//Observe que consigo instanciar/referenciar um objeto gerenerico (funcionario) de uma classe especifica (Gerente), 
		//mas nao consigo instanciar/referenciar um objeto especifico (Gerente) de uma classe genérica (Funcionario) 
		
		
		Funcionario g2 = new Gerente();
		g2.setNome("Marcos");
		System.out.println(g2.getNome());
		
		
//		Gerente g3 = new Funcionario();
//		g3.setNome("Marcos");
//		System.out.println(g3.getNome());
		
	}

}
