package br.com.alura.java.io.Unicode;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeituraStream {

	public static void main(String[] args) throws IOException { //o IOEception cobre as execoes de FileInputStream e BufferedReader

		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis, "UTF-8"); //<= sera aqui onde define o charset
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		while (linha!=null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();


	}

}
