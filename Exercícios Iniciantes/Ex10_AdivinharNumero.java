package atividades_ibm;

import java.util.Random;
import java.util.Scanner;

public class Ex10_AdivinharNumero {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
		Random random = new Random();
		
			int num_aleatorio, palpite;
			num_aleatorio = random.nextInt(100);
			System.out.println("Digite um valor entre 1 e 100: ");
			palpite = in.nextInt();
		
		while(palpite != num_aleatorio) {
			if(palpite < num_aleatorio) {
				System.out.println("Tente um número maior!");
			}else {
				System.out.println("Tente um número menor!");
			}
			
			System.out.println("Digite um valor entre 1 e 100: ");
			palpite = in.nextInt();
		}
		
		System.out.println("Você acertou");
		
	}

}
}
	
