package br.com.alura.java.io.Unicode;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraEncoding {

	public static void main(String[] args) throws Exception {

		// Scanner sc = new Scanner("arquivo.txt"); // Se usar desta forma, o Scanner
		// vai ler o string "arquivo.txt".

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {

			String linha = scanner.nextLine();

			System.out.println(linha);

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));

			Scanner linhaScanner = new Scanner(linha);
			// linhaScanner.useLocale(Locale.US); //define uma regra automatica, decimal
			// separado por ponto e as vezes por virgula
			linhaScanner.useDelimiter(","); // delimitador

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt(); // poderia ter sido um ParseInt()
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format("%s - %04d-%d, %s: %010.2f", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			// System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			
			valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%d, %s: %8.2f %n", tipoConta, agencia, numero, titular, saldo);
			System.out.println( valorFormatado);

			linhaScanner.close();
		}
		;

		scanner.close();

	}

}
