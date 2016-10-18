package com.fiap.exercicio3;

import javax.swing.JOptionPane;

public class CadastraSalarioEMedia {
	public static void main(String[] args) {
		String resposta = JOptionPane.showInputDialog("Informe o número de funcionários que serão cadastrados");
		int[] funcionarios = new int[Integer.parseInt(resposta)];
		int media = 0;
		
		for(int i = 0; i < funcionarios.length; i ++){
			String salario = JOptionPane.showInputDialog("Informe o salário do " + (i+1) + "o funcionário");
			funcionarios[i] = Integer.parseInt(salario);
			media += Integer.parseInt(salario);
		}
		
		JOptionPane.showMessageDialog(null, "A média salarial dos funcionários é: " + (media/funcionarios.length));
		
	}
	
}
