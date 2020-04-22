package br.com.alura.java.io.Unicode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "ç";

		System.out.println("Esse é o unicode do caracter => " + s.codePointAt(0));

		// Qual coding o Java usa por padrao?

		Charset charset = Charset.defaultCharset();
		System.out.println("O Java usa por padrao o Charset " + charset.displayName());

		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + ", windows-1252");
		
		bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes);
		System.out.println("O caracter sem conversao => " + sNovo);
		
		bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes);
		System.out.println("O caracter sem conversao => " + sNovo + ", convertido fica -> " + new String(bytes, "UTF-8"));
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes);
		System.out.println("O caracter sem conversao => " + sNovo+ ", convertido fica -> "+ new String(bytes, "UTF-16"));
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes);
		System.out.println("O caracter sem conversao => " + sNovo+ ", convertido fica -> " + new String(bytes, "US-ASCII"));
		
		
	}
}
