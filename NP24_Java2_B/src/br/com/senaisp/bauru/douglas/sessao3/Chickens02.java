package br.com.senaisp.bauru.douglas.sessao3;

public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	// media diaria
    	double dailyAverage = 0, monthlyAverage = 0, totaleggs = 0;
    			double monthlyProfit = 0.0;
    			//Na segunda o fazendeiro recolhe 100 ovos 
    			totaleggs += 100;
    					//Na terça o fazendeiro recolhe 121 ovos
    			totaleggs += 121;
    			//Na quarta o fazendeiro vai recolher 117
    			totaleggs += 117;
    			//Fazendo as contas
    			dailyAverage = totaleggs /3;
    			monthlyAverage = dailyAverage * 30;
    			monthlyProfit = monthlyAverage * .18;
    			
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
