package br.com.Aula13.E3;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		// Exercicio 3 
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Digite 1� Numero");
		int num1 = scan.nextInt();
		
		System.out.println("Digite 2� Numero");
		int num2 = scan.nextInt();
		
		System.out.println("o numeros digitados foram: " + num1 + " + " + num2);
		System.out.println("A soma do numero digitado e: " + (num1+num2));
		
	}

}