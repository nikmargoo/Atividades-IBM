package atividades_ibm;

import java.util.Scanner;

public class Ex05_ContagemRegressiva {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner (System.in)) {
			
			int num, i;
			System.out.println("Digite um número: ");
			num = in.nextInt();
			
			for(i = num; i >= 1; i--) {
				System.out.printf("%d", i).println();
			}
		}
	}

}
