package com.br.ucsal.aulaWille;
import java.util.Scanner;


public class Aula_Wille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.println("digite uma numero minimo ");
		int valMin = scan.nextInt();
		System.out.println("digite uma numero Máximo ");
		int valMax = scan.nextInt();
		
		while (valMin <= valMax){
			System.out.println("o valor e: "+ valMin);
			valMin ++;
		}

	}

}
