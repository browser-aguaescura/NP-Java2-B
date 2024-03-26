package br.com.senaisp.bauru.douglas.licao05.exercicio;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o codigo da cor (1, 2 ou 3): ");
	int codigo = sc.nextInt();
	String cor = "Cor invalida";
	switch (codigo) {
	case 1 -> cor = "Proxima luz do semáforo será verde";
	case 2 -> cor = "Proxima luz do semáforo será amarelo";
	case 3 -> cor = "Proxima luz do semáforo será vermelho";
	}
	// Outra forma 
	/*if (codigo ==1) {
	cor = "Proxima luz do semáforo será verde";}
	else if (codigo ==2) { cor = "Proxima luz do semáforo será amarelo";}
	else if (codigo ==3) { cor = "Proxima luz do semáforo será vermelho";
	 if e else if
	*/
	
	
	System.out.println(cor);
	sc.close();
}
}


