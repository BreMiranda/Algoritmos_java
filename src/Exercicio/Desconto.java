package Exercicio;

import java.util.Scanner;


public class Desconto {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados:
        System.out.println("Calculando o valor final da sua compra");
        System.out.println("Qual o valor da sua compra?");
        int valor = scan.nextInt();
        
        System.out.println("Qual o valor do desconto?");
        int desc = scan.nextInt();
        
        //processando
        int valorDesc = valor*desc/100;
        int valorFinal = valor - valorDesc;
        
        //imprimindo o valor na tela
        System.out.println("O valor final do seu produto é: "+valorFinal);
        
    }

}
