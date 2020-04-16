package br.com.bytebank.banco.teste;

public class TestString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //Esse é a forma indicada para trabalhar com String //objeto literal
		String outro = new String("Alura dois"); //Esse seria o modo correto para criar um objeto, mas nao se usa para String

		nome = nome.replace("A", "a"); //Imutabilidade. Precisa ser atribuido novamente na mesma ou em outra variavel/classe String.
		
		System.out.println(nome);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		System.out.println(nome.indexOf("ur"));
		
		System.out.println(nome.substring(1));
		
		System.out.println(nome.length());
		
		for(int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String helloWorld =" oi mundo   ";
		System.out.println(helloWorld.trim());
		
		
		System.out.println(nome.contains("lur"));
				
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto2 = builder.toString();
		System.out.println(texto2);
		
		
		
		String nome1 = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nome1 = nome1.replace("AL", cs);
		System.out.println(cs);
		System.out.println(nome1);
	}

}
