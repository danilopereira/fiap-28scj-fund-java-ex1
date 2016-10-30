package com.fiap.atividade2.exercicio1;

import javax.swing.JOptionPane;

import com.fiap.atividade2.exercicio4.ZeroValueException;

public class CalculadoraTester {
	private static final String RESPONSE_TEMPLATE = "O resultado é: ";
	public static void main(String[] args) {
		float op1, op2;
		String operador;
		
		CalculadoraBasica calculadora;
		
		try {
			op1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro numero:"));
			operador = JOptionPane.showInputDialog("Infome o operador:");
			op2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo numero:"));
			calculadora = new CalculadoraImpl(op1);
			
			switch (operador.charAt(0)){
			case '+':
				System.out.println(RESPONSE_TEMPLATE + calculadora.somar(op2));
				break;
			case '-':
				System.out.println(RESPONSE_TEMPLATE + calculadora.subtrair(op2));
				break;
			case '*':
				System.out.println(RESPONSE_TEMPLATE + calculadora.multiplicar(op2));
				break;
			case '/':
				System.out.println(RESPONSE_TEMPLATE + calculadora.dividir(op2));
				break;
			default : System.out.println("Operador inválido!");
			}
		} catch (ZeroValueException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException ex) {
			System.out.println(ex + " o valor deve ser um numero de ponto flutuante");
		}
		
	}

}
