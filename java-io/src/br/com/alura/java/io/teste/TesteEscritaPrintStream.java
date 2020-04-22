package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException { 
		
		PrintStream ps = new PrintStream("lorem2.txt", "UTF-8");
		//PrintStream ps2 = new PrintStream(new File("lorem2.txt"));
		//PrintWriter pw = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("xpto PrintStream");
		
		ps.close(); 

		System.out.println("Note que o metodo sysout tambem eh println" );

	}

}
