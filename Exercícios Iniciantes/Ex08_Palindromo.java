package atividades_ibm;

import java.util.Scanner;

public class Ex08_Palindromo {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Digite uma palavra: ");	
			String palavra = in.nextLine();
			System.out.println("É um palíndromo: " + verificarPalindromo(palavra));
			}
	}
	
	private static boolean verificarPalindromo(String palavra) {
		
		String deTrasPraFrente = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			deTrasPraFrente += palavra.charAt(i);
		}
		
		return palavra.equals(deTrasPraFrente);
	}
}
