package controller;

import model.Lista;

public class ControllerParImparHash {

	Lista<Integer>[] tb = new Lista[2];

	private int hashCode(int numero) {
		int hash = numero % 2;
		return hash;
	}

	public ControllerParImparHash() {
		int tamanho = tb.length;
		for (int i = 0; i < tamanho; i++) {
			tb[i] = new Lista<Integer>();
		}
	}

	public void add(int valor) throws Exception {
		int hash = hashCode(valor);
		Lista<Integer> l = tb[hash];
		if (l.isEmpty()) {
			l.addFirst(valor);
		} else {
			l.addLast(valor);
		}
	}
	
	
	public void conta() throws Exception {
		int total = 0;
				
		for (int i = 0; i < tb.length; i++) {
			Lista<Integer> l = tb[i];
			int tamanho = l.size();
			System.out.println("Linha " + i + ": " + tamanho);
			
			System.out.print("Linha " + i + ":");
			for (int j = 0; j < tamanho; j++) {
				System.out.print( l.get(j)+";");
			}
				
			total = total + tamanho;
			System.out.println("\n------");
		}
		System.out.println("Total: " + total);
		
	}
	

}
