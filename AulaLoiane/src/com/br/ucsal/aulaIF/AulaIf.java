package com.br.ucsal.aulaIF;

import java.util.Scanner;

import javax.xml.soap.DetailEntry;


public class AulaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
int i=0;

		do {
			
			System.out.println("Digite 3 Valores e escolha uma das opções ");
			System.out.println("Digite 1 Valor");
			int valor1 = scan.nextInt();
			System.out.println("Digite 3 Valores");
			int valor2 = scan.nextInt();
			System.out.println("Digite 3 Valores");
			int valor3 = scan.nextInt();
			
			
				
			System.out.println("Escolha uma opção  ");
			System.out.println("1 - Para Ordem Crescente ");
			System.out.println("2 - Para somar os dois maiores  ");
			System.out.println("3 - Para Ordem Estou aqui ");
			System.out.println("4 - Para Sair ");
			int op = scan.nextInt();
			
			
			switch (op) {
			
				case 1:{
					System.out.println("estou no 1 ");
					break;
				}
				case 2:{
					System.out.println("estou no 2 ");
					break;
				}
				case 3:{
					System.out.println("estou no 3 ");
					break;
				}
				case 4:{
					System.out.println("estou no 4 ");
					i=5;
				
					break;
					
				}
			
			}	
		}while (i>=4); // while
		
		
	}

}
