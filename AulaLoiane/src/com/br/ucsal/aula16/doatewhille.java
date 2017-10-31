package com.br.ucsal.aula16;


import java.util.Scanner;

public class doatewhille {
	
	public static void main (String [] args){
Scanner scan = new Scanner(System.in);
		int i=0;
		System.out.println("Digite mais um numero maximo ");
		int Max = scan.nextInt();
		
		do {
			i++;
			
			System.out.println("vc esta no: " + i );
			
		} while (  i<Max);
		
		scan.close();
	}
}