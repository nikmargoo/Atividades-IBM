package atividades_ibm;

import java.util.Scanner;

public class Ex01_Soma {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			int a, b;
			System.out.println("Digite um número para somar: ");
			a = in.nextInt();
			System.out.println("Digite outro número para somar: ");
			b = in.nextInt();
			
			int c;
			c = a + b;
			
			System.out.println("O resultado da soma é: " + c);
	}
}
}