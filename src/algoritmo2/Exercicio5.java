package algoritmo2;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo o valor
        System.out.println("Qual o valor do produto?");
        int produto = scan.nextInt();
        
        System.out.println("Qual a porcentagem de desconto?");
        int desc = scan.nextInt();
        
        //processando
        int valDesc = produto*desc/100; //calculando a porcentagem em cima do produto     
        int valorfinal = produto - valDesc;//calculando o valor final: valor do produto - desc;
        
        //imprimindo na tela
        System.out.println("esse é o valor de desconto"+valDesc+"\nesse é o valor final do produto: "+valorfinal);
        
        
        
        
        
    }

}
