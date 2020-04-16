package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(11, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

	    boolean existe = lista.contains(cc2); // Tem a mesma referencia
	    System.out.println("Já existe? " + existe);
	    
	    
		Conta cc3 = new ContaCorrente(22, 22);

	    existe = lista.contains(cc3); // Tem a mesma referencia
	    
	    /*
	     * Observe que as contas tem o mesmo numero e agencia, e que sao entao as mesmas contas,
	     * porem o arraylist guarda como referencias diferentes, ou seja, entende que sao objetos diferentes
	     * */

        System.out.println("Já existe? " + existe);
        
		for (Conta conta : lista) {
			System.out.println(conta);
		}

		
	}

}
