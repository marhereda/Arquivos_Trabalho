package com.br.ucsal.aula16;

import java.util.Scanner;

public class FazerWille {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		int i=1;
		System.out.println("Digite um numero maximo  ");
		int numeroMax = scan.nextInt();
		
		while (i <= numeroMax ){
			System.out.println("o numero agora eh: " + i );
			i++;
		}
	}

}
