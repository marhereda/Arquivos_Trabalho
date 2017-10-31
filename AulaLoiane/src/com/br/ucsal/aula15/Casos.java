package com.br.ucsal.aula15;

import java.util.Scanner;

public class Casos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		switch (numero){
		
		case 1: System.out.println("vc digitou o numero 1"); break;
		case 2: System.out.println("vc digitou o numero 2"); break;
		case 3: System.out.println("vc digitou o numero 3"); break;
		case 4: System.out.println("vc digitou o numero 4"); break;
		case 5: System.out.println("vc digitou o numero 5"); break;
		case 6: System.out.println("vc digitou o numero 6"); break;
		default:System.out.println("Não eh valido"); break;
		
		}
	}
	
}
