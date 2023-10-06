package atividades_ibm;

import java.util.Scanner;

public class Ex04_NumeroFatorial {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			int num;
			System.out.println("Digite um número: ");
			num = in.nextInt();
			
			long fatorial = 1;
			int i = 1;
			
			while (i <= num) {
				fatorial = fatorial * i;
				i++;
			}
		
			System.out.println("O fatorial de " + num + " é " + fatorial);
		}

		
	}

}
