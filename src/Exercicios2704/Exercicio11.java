package Exercicios2704;

import java.util.Scanner;


public class Exercicio11 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        System.out.println("me diga um número inteiro positivo");
        int num = sc.nextInt();
        
         for (int i = 1; i <= 10; i++) {
            int tab = i * num;
            System.out.println("a tabuada do sete é " + i + " x " + num + " = " + tab);
        }
    }

}
