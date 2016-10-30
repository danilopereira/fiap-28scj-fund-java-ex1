package com.fiap.atividade3.exercicio4;

public class Pessoa{
	private String name;
	private int idade;
	private Sexo sexo;
	private String empresa;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", sexo=" + sexo + ", empresa=" + empresa + "]";
	}
	
	

}
