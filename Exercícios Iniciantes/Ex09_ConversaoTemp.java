package atividades_ibm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09_ConversaoTemp {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			double c, f;
			DecimalFormat formatador = new DecimalFormat("#0.0");
			System.out.println("Digite a temperatura em fahrenheit: ");
			f = in.nextDouble();
			
			c = (5 * (f - 32)) / 9;
			
			System.out.println("Temperatura em Celsius: " + formatador.format(c) + "ºC");
		}
				
	}

}
