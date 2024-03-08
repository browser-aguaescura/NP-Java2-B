package br.com.senaisp.bauru.douglas.sessao3;

public class Chickens01 {
    public static void main(String[] args) {
        //        //Mr. Brown tinha um sitio, Ia Ia Ia Oh!!!
    	// Put yout code here
        //ovos de galinha = 4, contador de galinha = 8
    	
    	int ovodegalinha = 4, contagalinha = 8;
    	int totalovos = 0;
    	
    	//Na segunda, ao meio dia, Mr. Brown recolhe os ovos
    	totalovos = totalovos + contagalinha * ovodegalinha;
    //Na terça, Mr. Brown ganha uma galinha e recolhe os ovos 
    	totalovos+= ++contagalinha * ovodegalinha;
    	//Na quart, ele perde metade das galinhas e depois recolhe os ovos
    	totalovos += contagalinha / 2 * ovodegalinha;
    	
        System.out.println(totalovos);
    }   
}
