package br.com.Aula13.E9;

import java.util.Scanner;

public class ecercicio9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner (System.in);
				double grauFh, grauCel;
				System.out.println("Qual a temperatura em Graus Farenheit");
				grauFh = scan.nextFloat();
				grauCel = (5*(grauFh-32))/9;
				System.out.println("Atemperatura em Ceicius e: " + grauCel);
				scan.close();
				
	}
}
