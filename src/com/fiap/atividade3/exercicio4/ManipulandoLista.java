package com.fiap.atividade3.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManipulandoLista {
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = alimentaLista();
		
		System.out.println("Aleatório");
		Random random = new Random();
		System.out.println(pessoas.get(random.nextInt(pessoas.size())));
		System.out.println("-------------------------------------------------------");
		System.out.println("Ordem Crescente");
		pessoas.stream().sorted((p1, p2)-> p1.getName().compareTo(p2.getName())).forEach(p->System.out.println(p));
		System.out.println("-------------------------------------------------------");
		System.out.println("Ordem Decrescente");
		pessoas.stream().sorted((p1, p2)-> p2.getName().compareTo(p1.getName())).forEach(p->System.out.println(p));	
		
	}

	private static List<Pessoa> alimentaLista() {
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setName("João Garcia");
		pessoa.setIdade(20);
		pessoa.setSexo(Sexo.MASCULINO);
		pessoa.setEmpresa("AIK Enterprises");
		pessoas.add(pessoa);
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setName("Maria Martins");
		pessoa1.setIdade(44);
		pessoa1.setSexo(Sexo.FEMININO);
		pessoa1.setEmpresa("Simples");
		pessoas.add(pessoa1);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setName("Henrique Fernando");
		pessoa2.setIdade(43);
		pessoa2.setSexo(Sexo.MASCULINO);
		pessoa2.setEmpresa("Magazine André");
		pessoas.add(pessoa2);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setName("Inácio Luís");
		pessoa3.setIdade(33);
		pessoa3.setSexo(Sexo.MASCULINO);
		pessoa3.setEmpresa("Magazine André");
		pessoas.add(pessoa3);
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setName("Fernando Ferreira");
		pessoa4.setIdade(87);
		pessoa4.setSexo(Sexo.MASCULINO);
		pessoa4.setEmpresa("Casas Recife");
		pessoas.add(pessoa4);
		
		return pessoas;
	}

}
