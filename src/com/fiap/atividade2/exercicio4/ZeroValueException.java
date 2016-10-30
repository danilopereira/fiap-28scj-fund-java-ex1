package com.fiap.atividade2.exercicio4;

public class ZeroValueException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public ZeroValueException(String message){
		super(message);
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}

}
