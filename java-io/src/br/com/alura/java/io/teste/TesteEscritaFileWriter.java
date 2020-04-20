package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		long ini = System.currentTimeMillis();

		/*
		 * Alternativa mais simples
		 */
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

		/*
		 * No Windows, a quebra de linha eh "\r\n", em sistema base Unix somente "\n"
		 */
		fw.write("\r\n"); // quebra de linha

		/*
		 * Porem o Java tem um metodo Static que devolve a quebra da linha de acordo com
		 * o sistema
		 */
		fw.write(System.lineSeparator());
		fw.write("xpto");

		fw.close(); // esse eh o suficiente, nao precisa fechar o isr e o fis.

		long fim = System.currentTimeMillis();

		System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}

}
