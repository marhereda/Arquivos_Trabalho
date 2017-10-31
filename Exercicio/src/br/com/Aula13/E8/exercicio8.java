package br.com.Aula13.E8;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		double horaTrab, salario, numeroHoras;
		System.out.println("Quanto vc ganha por hora ");
		horaTrab = scan.nextFloat();
		System.out.println("Qual o Numero de horas trabalhadas ");
		numeroHoras = scan.nextFloat();
		salario = numeroHoras * horaTrab;
		System.out.println("O Total de salario neste mes e: " + salario);

	}

}