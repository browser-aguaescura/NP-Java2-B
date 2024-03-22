package br.com.senaisp.bauru.douglas.licao04.exercicio;

public class ProcessadorDriver {
	public String processarNome(String nome) {
		//Pegando o sobrenome
		String sbnome = nome.substring(nome.lastIndexOf(' ')+1);
		String Ininome = ''+ nome.charAt(0)+ '.';
		return sbnome + ', '+ ininome;
		
		
	}
	

}
