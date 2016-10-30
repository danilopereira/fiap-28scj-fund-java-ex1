package com.fiap.atividade3.exercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Codificador {

	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Informe a mensagem a ser criptografada");
		
		try {
			encripta(message);
			decripta();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void encripta(String message) throws IOException {
		File file = new File("files/mensagemCodificada.txt");
		
		StringBuilder sb = new StringBuilder(message);
		for(int i = 0; i < message.length(); i++){
			int ascii = (int)message.charAt(i);
			sb.setCharAt(i, (char)(ascii + 1));
		}
		escreverNoArquivo(sb.toString(),file);
		
		System.out.println("Encriptado");
	}
	
	private static void decripta() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("files/mensagemCodificada.txt"));
		String message = br.readLine();
		StringBuilder sb = new StringBuilder(message);
		for(int i = 0; i < message.length(); i++){
			int ascii = (int)message.charAt(i);
			sb.setCharAt(i, (char) (ascii-1));
		}
		File file = new File("files/mensagemDecodificada.txt");
		escreverNoArquivo(sb.toString(),file);
		
		System.out.println("Decripitado");
	}
	
	private static void escreverNoArquivo(String message, File file) throws IOException{
		FileWriter fw = new FileWriter(file);
		fw.write(message);
		fw.close();
	}

}
