package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];

		for (int i = 0; i < contas.length; i++) {

			Conta conta;
			if (i % 2 == 0) {
				conta = new ContaCorrente(i, i);
			} else {
				conta = new ContaPoupanca(i, i);
			}

			contas[i] = conta; // armazena nao o objeto, mas a referencia do objeto no Array

		}

		System.out.println(contas[3].getNumero());

		ContaPoupanca cp = (ContaPoupanca) contas[1];

		System.out.println(cp.getAgencia());

		for (Object o : contas) {
			System.out.println(o);
		}

	}

}
