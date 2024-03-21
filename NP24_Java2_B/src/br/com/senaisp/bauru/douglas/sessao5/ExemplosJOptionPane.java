package br.com.senaisp.bauru.douglas.sessao5;

import javax.swing.JOptionPane;

public class ExemplosJOptionPane {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, "Olá " + nome);

}}
