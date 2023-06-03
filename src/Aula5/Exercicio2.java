package Aula5;

import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sca = new Scanner(System.in);
        
        System.out.println(" Qual o código do produto você comprou? ");
        int cod = sca.nextInt();
        
        System.out.println(" Qual a quantidadade?");
        int qnt = sca.nextInt();
        
        float total= 0;
        
        switch (cod){
            case 100://cachorro quente
                total = qnt * 1.70f;
                System.out.println("o valor total da sua compra é "+total);
                break;
            case 101: //bauru simples
                total = qnt *2.30f;
                System.out.println("o valor total da sua compra é "+total);
                break;
            case 102://bauru com ovo
                total = qnt*2.60f;
                System.out.println("o valor total da sua compra é "+total);
                break;
            case 103://hamburguer
                total = qnt*2.40f;
                System.out.println("o valor total da sua compra é "+total);
                break;
            case 104://cheeseburger
                total = qnt *2.50f;
                System.out.println("o valor total da sua compra é "+total);
                break;
            case 105://refrigerante
                total = qnt*1.00f;
                System.out.println("o valor total da sua compra é "+total);
                break;
                 
            default:
                System.out.println("número inválido");
        }
    }

}
