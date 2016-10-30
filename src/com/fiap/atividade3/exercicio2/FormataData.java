package com.fiap.atividade3.exercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormataData {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2012, 9, 10, 12, 00);
		
		System.out.println("a. "+ldt.format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm")));
		System.out.println("b. "+ldt.format(DateTimeFormatter.ofPattern("dd-MM-YY hh:mm:ss")));
		System.out.println("c. "+ldt.format(DateTimeFormatter.ofPattern("EEEE")));
		System.out.println("d. "+ldt.format(DateTimeFormatter.ofPattern("YYYY")));
		System.out.println("e. "+ldt.format(DateTimeFormatter.ofPattern("G")));

	}

}
