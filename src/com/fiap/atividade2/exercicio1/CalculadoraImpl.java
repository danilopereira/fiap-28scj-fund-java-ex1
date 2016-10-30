package com.fiap.atividade2.exercicio1;

import com.fiap.atividade2.exercicio4.ZeroValueException;

public class CalculadoraImpl implements CalculadoraBasica {
	
	private float op1;
	
	public float getOp1() {
		return op1;
	}

	public CalculadoraImpl(float op1) throws ZeroValueException {
		if(0 == op1){
			throw new ZeroValueException("o primeiro operador não pode ser zero!");
		}
		
		this.op1 = op1;
		
		
	}

	@Override
	public float somar(float op2){
		return this.op1+(float)op2;
	}

	@Override
	public float subtrair(float op2) {
		return this.op1-(float)op2;
	}

	@Override
	public float dividir(float op2) {
		return this.op1/(float)op2;
	}

	@Override
	public float multiplicar(float op2) {
		return this.op1*(float)op2;
	}

}
