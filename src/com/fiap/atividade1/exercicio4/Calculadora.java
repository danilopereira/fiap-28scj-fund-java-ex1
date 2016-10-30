package com.fiap.atividade1.exercicio4;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {
	public static void main(String[] args) {
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JTextField operador = new JTextField(1);
		
		JPanel panel = new JPanel();
		panel.add(num1);
		panel.add(operador);
		panel.add(num2);
		
		int opcao = JOptionPane.showConfirmDialog(null, 
				panel, 
				"Os operadores aceitos são: x (multiplicação) / (divisão) + (adição) - (subtração)",
				JOptionPane.OK_CANCEL_OPTION);
		
		if(opcao == JOptionPane.OK_OPTION){
			switch (operador.getText().charAt(0)){
			case '+':
				soma(num1.getText(), num2.getText());
				break;
			case '-':
				subitracao(num1.getText(), num2.getText());
				break;
			case 'x':
				multiplicacao(num1.getText(), num2.getText());
				break;
			case '/':
				divisao(num1.getText(), num2.getText());
				break;
			default : JOptionPane.showMessageDialog(null, "Operador inválido");
			}
		}
	}

	private static void divisao(String text, String text2) {
		int num1 = Integer.parseInt(text);
		int num2 = Integer.parseInt(text2);
		JOptionPane.showMessageDialog(null, "Resultado : " + (num1/num2));
	}

	private static void multiplicacao(String text, String text2) {
		int num1 = Integer.parseInt(text);
		int num2 = Integer.parseInt(text2);
		JOptionPane.showMessageDialog(null, "Resultado : " + (num1*num2));
	}

	private static void subitracao(String text, String text2) {
		int num1 = Integer.parseInt(text);
		int num2 = Integer.parseInt(text2);
		JOptionPane.showMessageDialog(null, "Resultado : " + (num1-num2));
	}

	private static void soma(String text, String text2) {
		int num1 = Integer.parseInt(text);
		int num2 = Integer.parseInt(text2);
		JOptionPane.showMessageDialog(null, "Resultado : " + (num1+num2));
	}

}
