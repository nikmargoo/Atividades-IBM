package atividades_ibm;

import java.util.Scanner;

public class Ex06_Media {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner (System.in)) {
			
			int n1, n2, n3, media = 0;
			System.out.println("Digite três números: ");
			n1 = in.nextInt();
			n2 = in.nextInt();
			n3 = in.nextInt();
			
			media = (n1 + n2 + n3)/3;
			
		System.out.println("A média desses números é igual a: " + media);
		}
	}

}
