package br.com.Aula13.E7;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner (System.in);
			double lado, area, dobro;
			System.out.println("Digite o lado do quadrado");
			lado = scan.nextFloat();
			area = (lado*lado);
			dobro = area*2;
			System.out.println("A area do quadrado e: " + area + " e o dobro dessa area � " + dobro);

		}

	}