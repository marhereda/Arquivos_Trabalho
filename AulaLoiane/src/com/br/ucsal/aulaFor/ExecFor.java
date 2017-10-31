package com.br.ucsal.aulaFor;
import java.util.Scanner;


public class ExecFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite uma numero Min");
		int numMin = scan.nextInt();
		
		System.out.println("digite uma numero Max");
		int numMax = scan.nextInt();
		
		
		
		System.out.println("o min foi : " + numMin + " o numero Max foi: " + numMax);

		System.out.println("------------------------------------------ " );
		System.out.println(" " );
		int i;
		for (i=numMin ; numMin <= numMax  ; numMin++){
			
			System.out.println("o min foi : " + numMin + " o numero Max foi: " + numMin);
		}
		
		

	}

}
