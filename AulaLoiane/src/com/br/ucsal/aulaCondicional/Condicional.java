package com.br.ucsal.aulaCondicional;
import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu Nome: ");
		String nome = scan.next();
		
		System.out.println("digite a sua idade: ");
		int idade = scan.nextInt();
		
		
		if (idade > 10){
			
			System.out.println("O cadastro de: " + nome + " é MAIOR de idade, ela tem " + idade );
			
		} else {
			
			System.out.println("O cadastro de: " + nome + " é MENOR de idade, ela tem " + idade );
		}
	}
}
