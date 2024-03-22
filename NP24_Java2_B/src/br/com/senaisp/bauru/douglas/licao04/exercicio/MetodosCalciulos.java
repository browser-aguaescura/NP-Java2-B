package br.com.senaisp.bauru.douglas.licao04.exercicio;

import java.util.Random;

public class MetodosCalciulos {
	/**Metodo dpara calcular a temperatura de fahrenheit para °C
	 * 
	 * @param temperatura
	 * @return °C
	 */
	public double converterFahrenheit(double temperatura) {
		return (temperatura - 32)*5/9;
			
	}
	/** Metid de Calculo de Hipotenua 
	 * 
	 * @param co Informr o cateto oposto 
	 * @param ca Informar o cateto adjascente
	 * @returnValor da hipotenusa
	 */
	public double calcularHipotenusa (double co, double ca) {
		return Math.sqrt(Math.pow(co, 2)+ Math.pow(ca, 2) );
	}
	public int jogarDado( ) {
		Random rnd = new Random();
		return rnd.nextInt(6)+1+ rnd.nextInt(6)+1;
	}
	}

