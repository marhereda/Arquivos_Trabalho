package br.com.Aula13.E5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float metro, cm;
		System.out.println("Digite valor em metro para converter em cm");
		metro = scan.nextFloat();
		cm = metro * 100;
		System.out.println("A media em cm e: " + cm + " cm");
	}

}
