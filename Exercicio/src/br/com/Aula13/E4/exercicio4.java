package br.com.Aula13.E4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// Exercicio 4 
		Scanner scan = new Scanner (System.in);
		
		int media;
		
		System.out.println("Digite 1� Nona Bimestral");
		int nota1 = scan.nextInt();
		
		System.out.println("Digite 2� Numero");
		int nota2 = scan.nextInt();
		
		System.out.println("Digite 3� Nona Bimestral");
		int nota3 = scan.nextInt();
		
		System.out.println("Digite 4� Numero");
		int nota4 = scan.nextInt();
		media=(nota1+nota2+nota3+nota4)/2;
	
		System.out.println("A media e: " + media);
		
	}

}
