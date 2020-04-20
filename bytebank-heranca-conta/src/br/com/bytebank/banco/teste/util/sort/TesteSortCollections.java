package br.com.bytebank.banco.teste.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteSortCollections {

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

		MyUtil.print(lista);

		// Forma usada antes do Java 1.8
		Collections.sort(lista, new TitularDaContaComparator());
		MyUtil.print(lista);

		//invertendo as collecao
		Collections.reverse(lista);
		MyUtil.print(lista);
		
		//pela ordem natural implementado pela propria Classe conta (ordem pelo saldo)
		Collections.sort(lista);
		MyUtil.print(lista);
		
		//metodo de ordenacao randomica//embaralhado
		Collections.shuffle(lista);
		MyUtil.print(lista);
		
		
		// ordenacao natural implementado pela propria Classe sendo usado pelo ArrayList
		lista.sort(null);
		MyUtil.print(lista);


	}

}
