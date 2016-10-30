package com.fiap.atividade3.exercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;

public class MedidorDeEficiencia {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		HashSet<Integer> hs = new HashSet<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		WeakHashMap<Integer, Integer> whm = new WeakHashMap<>();
		long inicio = 0;
		long fim = 0;
		
		long diferencaAL = 0;
		long diferencaLL = 0;
		System.out.println("Gravando:");
		System.out.println("ArrayList");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(al);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaAL = fim - inicio;
		
		System.out.println("LinkedList");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(ll);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaLL = fim - inicio;
		
		System.out.println("Melhor tempo de gravação: " + (diferencaAL < diferencaAL ? "ArrayList":"LinkedList"));
		
		System.out.println("Lendo:");
		System.out.println("ArrayList");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		al.get(500_000);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaAL = fim - inicio;
		
		System.out.println("LinkedList");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		ll.get(500_000);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaLL = fim - inicio;
		
		System.out.println("Melhor tempo de leitura: " + (diferencaAL < diferencaAL ? "ArrayList":"LinkedList"));
		
		System.out.println("----------------------------------------------------------");
		
		long diferencaStack = 0;
		long diferencaHS = 0;
		System.out.println("Gravando:");
		System.out.println("Stack");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(stack);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaStack = fim - inicio;
		
		System.out.println("HashSet");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(hs);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaHS = fim - inicio;
		
		System.out.println("Melhor tempo de gravação: " + (diferencaStack < diferencaHS ? "Stack":"HashSet"));
		
		System.out.println("Lendo:");
		System.out.println("Stack");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		stack.get(500_000);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaStack = fim - inicio;
		
		System.out.println("LinkedList");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		for(Integer i : hs){
			if(i.equals(500_000)){
				break;
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaHS = fim - inicio;
		
		System.out.println("Melhor tempo de leitura: " + (diferencaStack < diferencaHS ? "Stack":"HashSet"));
		
		System.out.println("----------------------------------------------------------");
		
		long diferencaHM = 0;
		long diferencaWHM = 0;
		System.out.println("Gravando:");
		System.out.println("HashMap");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(hm);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaHM = fim - inicio;
		
		System.out.println("WeakHashMap");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		gravar(whm);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaWHM = fim - inicio;
		
		System.out.println("Melhor tempo de gravação: " + (diferencaHM < diferencaWHM ? "HashMap":"WeakHashMap"));
		
		System.out.println("Lendo:");
		System.out.println("HashMap");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		hm.get(500_000);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaHM = fim - inicio;
		
		System.out.println("WeakHashMap");
		inicio = System.currentTimeMillis();
		System.out.println("Início: "+inicio+"ms");
		whm.get(500_000);
		fim = System.currentTimeMillis();
		System.out.println("Fim: "+fim+"ms");
		diferencaWHM = fim - inicio;
		
		System.out.println("Melhor tempo de leitura: " + (diferencaHM < diferencaWHM ? "HashMap":"WeakHashMap"));
		
	}
	
	private static void gravar(Collection collection){
		for(int i=0; i < 1_000_000; i ++){
			collection.add(i);
		}
	}
	
	private static void gravar(Map<Integer, Integer> map){
		for(int i=0; i < 1_000_000; i ++){
			map.put(i, i);
		}
	}
	
}
