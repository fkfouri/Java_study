package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter2 {

	public static void main(String[] args) throws IOException { 
		
		/*
		 * Alternativa preferencial do instrutor, para nao ter que usar o System.lineSeparator().
		 */
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine(); //Mais elegante do que usar System.lineSeparator() da Class FileWriter
		bw.write("xpto");

		bw.close(); // esse eh o suficiente, nao precisa fechar o isr e o fis.


	}

}
