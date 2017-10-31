package br.ucsal.AulaFor;

import java.util.Scanner;

public class AulaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//Digite quantas vezes vc preciza que o for repita 
		
		System.out.println("Dite a quantidade de vezes ");
		int  voltas = scan.nextInt();
		
		
		for (int i=1; i > voltas; i++ ){
			
			System.out.println("Agora estou em  " + i);
		}
		
	}

}
