package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteSocket {

	public static void main(String[] args) throws IOException { 
		//conexao tipo rede/socket
		//Nao vai funcionar pois nao esta conectado
		Socket s = new Socket();
		
		InputStream fis = s.getInputStream() ; //System.in; //entrada do teclado
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = s.getOutputStream(); //System.out;// new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); //descarga, nao acumula o buffer, descarga imediata
			linha = br.readLine();
		}

		br.close(); // esse eh o suficiente, nao precisa fechar o isr e o fis.
		bw.close();

	}

}
