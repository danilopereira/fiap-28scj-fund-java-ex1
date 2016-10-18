package com.fiap.exercicio1;

public class InverteOrdemVetor {
	
	public static void main(String[] args) {
		int[] vetor = {1,2,3};
		InverteOrdemVetor.inverter(vetor);
	}
	
	public static void inverter(int[] vetor){
		for(int i = vetor.length-1; i >= 0; i --){
			System.out.println(vetor[i]);
		}
	}

}
