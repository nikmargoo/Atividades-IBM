package atividades_ibm;

import java.util.Scanner;

public class Ex07_Tabuada {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
				
			int num;
			System.out.println("Digite um número: ");
			num = in.nextInt();
				
			for(int i = 0; i < 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
				
	}

}
}