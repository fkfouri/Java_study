package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class TesteRWProperties {

	public static void main(String[] args) throws Exception {
		
		/* 
		 * Exemplo de Criacao de arquivo Properties
		 */

		Properties propsWriter = new Properties(); 
		propsWriter.setProperty("login", "alura"); //chave, valor
		propsWriter.setProperty("senha", "alurapass");
		propsWriter.setProperty("endereco", "www.alura.com.br");
		
		propsWriter.store(new FileWriter("conf.properties"), "algum comentário");
		

		
		/*
		 * Exemplo de Leitura de arquivo Properties
		 */
		
		Properties props = new Properties();        
		props.load(new FileReader("conf.properties"));

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}

}
