package atividades_ibm;

import java.util.Scanner;

public class Ex02_ParOuImpar {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			int num, pOui;
			System.out.println("Digite um número para saber se é par ou ímpar: ");
			num = in.nextInt();
			pOui = (num%2);
			
			if(pOui == 0) {	
				System.out.println("O número " + num + " é par.");
			}else {
				System.out.println("O número " + num + " é ímpar.");
			}
		}
	}

}
