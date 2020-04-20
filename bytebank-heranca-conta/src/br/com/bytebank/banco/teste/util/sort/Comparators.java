package br.com.bytebank.banco.teste.util.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;

/*
 * criando uma classe para comparacao
 */
class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		/*
		 * alternativa 1 por ser comparacao numerica
		 */
		return c1.getNumero() - c2.getNumero();

		/*
		 * Alternativa 2 (mais elegante) usando o metodo estatico do Integer
		 */
		// return Integer.compare(c1.getNumero(), c2.getNumero());

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//
//		if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}

/*
 * criando uma classe para comparacao
 */
class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return nomeC1.compareTo(nomeC2);
	}

}

class MyUtil {

	public static void print(List<Conta> lista) {

		System.out.println("-------------------------------------");

		// laco depois do sort
		for (Conta conta : lista) {
			if (conta.getTitular() != null) {
				System.out.println(conta + ", " + conta.getTitular().getNome());
			} else {
				System.out.println(conta);
			}
		}
	}

}
