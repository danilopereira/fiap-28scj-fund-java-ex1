package com.fiap.exercicio5;

import javax.swing.JOptionPane;

public class Fatorial {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para o calculo de fatorial"));
		JOptionPane.showMessageDialog(null, num+"! = " + fatorial(num));
	}
	
	private static int fatorial(int num){
		if(num <= 1 ){
			return 1;
		}
		else{
			return num * fatorial(num - 1);
		}
	}

}
