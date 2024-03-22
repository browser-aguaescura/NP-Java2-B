package br.com.senaisp.bauru.douglas.licao04.exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		MetodosCalciulos mc = new MetodosCalciulos();
		
		double temperatura = mc.converterFahrenheit(60.5);
		
		
		System.out.println("Temperatura é "+ temperatura +"C°");
		
			double hip = mc.calcularHipotenusa (15, 10);
			
			
			System.out.println("Você tirou "+ mc.jogarDado() );
			

	}

}
