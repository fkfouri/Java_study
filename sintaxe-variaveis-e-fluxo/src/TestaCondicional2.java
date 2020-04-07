
public class TestaCondicional2 {

	public static void main(String[] args) {
		// sysout: CTRL + Espace
		System.out.println("testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente vc nao pode entrar");
		}

		
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		} else {

			System.out.println("infelizmente vc nao pode entrar");

		}
		
		
		switch (idade) {
		case 16:
			System.out.println("Sua idade é 16");
			break;

		default:
			System.out.println("sua idade não é 16");
			break;
		}
	}

}
