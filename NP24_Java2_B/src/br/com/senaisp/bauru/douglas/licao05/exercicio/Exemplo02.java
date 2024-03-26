package br.com.senaisp.bauru.douglas.licao05.exercicio;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int ano;
		Scanner sc = new Scanner(System.in);
		boolean vDataValida = false;

		System.out.println("Digite sua data de nascimento:");
		String xDtNasc = sc.nextLine();

		Scanner sc2 = new Scanner(xDtNasc);
		sc2.useDelimiter("/");

		dia = sc2.nextInt();
		mes = sc2.nextInt();
		ano = sc2.nextInt();

		sc2.close();

		System.out.println("Dia: " + dia);
		System.out.println("Mês: " + mes);
		System.out.println("Ano: " + ano);

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			vDataValida = dia >= 1 && dia <= 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			vDataValida = dia >= 1 && dia <= 30;
			break;
		case 2:
			vDataValida = dia >= 1 && dia <= 28 || dia >= 1 && dia <= 29 && ano % 4 == 0 && ano % 100 != 0
					|| dia >= 1 && dia <= 29 && ano % 400 == 0;
			break;
		}

		if (vDataValida)
			System.out.println("Data Valida");
		else
			System.out.println("Data Invalida");

	}

}
