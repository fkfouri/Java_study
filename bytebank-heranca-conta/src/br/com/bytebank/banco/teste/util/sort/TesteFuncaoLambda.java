package br.com.bytebank.banco.teste.util.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteFuncaoLambda {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// laco antes do sort
		MyUtil.print(lista);

		/*
		 * Function Objects
		 */
		// NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		// lista.sort(comparator);

		/*
		 * Classes Anonimas Gera na pasta bin um arquivo TesteSortClasseAnonima$1.class
		 * 
		 * Possivel utilizar no Navigator.
		 */
		lista.sort((Conta c1, Conta c2) -> {
			return Integer.compare(c1.getNumero(), c2.getNumero());
		});

		/*
		 * Permite deixar o codigo muito mais enxuto
		 */
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
		MyUtil.print(lista);

		/*
		 * Mais exemplo de classe Anonima
		 * 
		 * Este gera o arquivo TesteSortClasseAnonima$2.class
		 */
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {

			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();

			return nomeC1.compareTo(nomeC2);

		};

		System.out.println("-------------------------------------");

		lista.sort(comp);

		/*
		 * utilizando o metodo forEach da propria lista
		 */
		lista.forEach(new Consumer<Conta>() {

			@Override
			public void accept(Conta conta) {
				System.out.println(conta + ", " + conta.getTitular().getNome());

			}

		});

		System.out.println("-------------------------------------");
		/*
		 * simplificando ainda mais o foreach da linha
		 */
		lista.forEach((Conta conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

		// MyUtil.print(lista);

	}

}
