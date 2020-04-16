package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	// Array []
	public static void main(String[] args) {
		
		//forma classica de criar objeto de Array
		int[] idades = new int[6];
		
		// tambem pode ser escrito desta forma
		int auxIdades[]=new int[5];
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		System.out.println(idades[3]);
		System.out.println(idades.length);
		
		
		for(int i=0; i<idades.length; i++) {
			idades[i] = i*i;
		}
		
		for(int i=0; i<idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
		//Forma literal de criar um objeto Array
		int[] refs = {1,2,3,4,5};
		
	}

}
