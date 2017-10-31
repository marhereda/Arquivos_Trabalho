package com.br.ucsal.aulaCaso;

import java.util.Scanner;

public class AulaCaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a o primeirovalor minimo");
		int valMin = scan.nextInt();
		System.out.println("Digite a o o Valor Maximo ");
		int valMax = scan.nextInt();
		
		while (valMin <= valMax){
			
			System.out.println("O Valor esta em " + valMin);
			valMin ++;
		}

	}

}
