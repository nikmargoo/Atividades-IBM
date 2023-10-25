package atividades_ibm;

import java.util.Scanner;

public class Ex03_CalculadoraSimples {
	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			
			double num1, num2;
			char operacao;
			
			System.out.println("Digite um valor: ");
			num1 = in.nextDouble();
			
			System.out.println("Digite a operação que deseja realizar: ");
			operacao = in.next().charAt(0);
			
			System.out.println("Digite outro número: ");
			num2 = in.nextDouble(); 
			
			double o = 0;
		
		switch (operacao) {
			case '+':
				o = num1 + num2;
				break;
				
			case '-':
				o = num1 - num2;
				break;
				
			case '*':
				o = num1 * num2;
				break;
				
			case '/':
				o = num1 / num2;
				break;
				
			default:
				System.out.println("Essa operação é inválida.");
				
		}
		System.out.println(num1 + " " + operacao + " " + num2 + " = " + o);
	}
}
}
