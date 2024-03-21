package br.com.senaisp.bauru.douglas.licao04.sessao05;

public class FestaAlex {
	//constantes 
	final static double IMPOSTO = 0.05;
			final static double GORJETA = 0.15;
			
			public static double  calcularConta(double valor) {
				return valor * (1+GORJETA) * (1+IMPOSTO);
			}
	public static void main(String[] args) {
		double pessoa1 = 10;
				double pessoa2 = 12;
				double pessoa3 = 9;
				double pessoa4 = 8;
				double pessoa5 = 7;
				double pessoa6 = 15;
				double pessoa7 = 11;
				double pessoa8 = 30;

						
						// contas							
				
				double total1 = calcularConta(pessoa1);
				double total2 = calcularConta(pessoa2);
				double total3 = calcularConta(pessoa3);
				double total4 = calcularConta(pessoa4);
				double total5 = calcularConta(pessoa5);
				double total6 = calcularConta(pessoa6);
				double total7 = calcularConta(pessoa7);
				double total8 = calcularConta(pessoa8);
				//Mostrar valores
				
				System.out.println("pessoa 1: R$ "+total1);
				System.out.println("pessoa 2: R$ "+total2);
				System.out.println("pessoa 3: R$ "+total3);
				System.out.println("pessoa 4: R$ "+total4);
				System.out.println("pessoa 5: R$ "+total5);
				System.out.println("pessoa 6: R$ "+total6);
				System.out.println("pessoa 7: R$ "+total7);
				System.out.println("pessoa 8: R$ "+total8);
				
}}
