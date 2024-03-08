package br.com.senaisp.bauru.douglas.sessao3;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        /*•Um ShoppingCart pode precisar saber as seguintes
propriedades:
−Preço do item
−Valor do imposto sobre vendas
−Quantidade de itens
−Preço total calculado de todos os itens no carrinho
•Um ShoppingCart pode precisar dos seguintes
comportamentos:
−Imprimir uma mensagem com seu total*/
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 5.00, tax = 0.05;
        		int quantity = 3;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = price * quantity * (1+ tax);
        
        // Modify message to include quantity 
       message = custName+" wants to purchase "+ quantity + " of the " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        message = "Total: " + totalPrice;
        System.out.println(message);
    }    
}
