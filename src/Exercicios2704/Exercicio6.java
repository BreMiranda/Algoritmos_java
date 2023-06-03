package Exercicios2704;

import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 1; i<=20; i++){
            System.out.println("qual sua idade? ");
            int idade = sc.nextInt();
            soma += idade;
        } 
        System.out.println("a soma de todas as idades apresentadas é "+soma);
    }

}
