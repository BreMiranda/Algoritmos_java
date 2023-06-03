package Exercicios2704;

import java.util.Scanner;


public class Exercicio7 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        int soma =0;
        int media = 0;
                
        for (int i = 1; i<=20; i++){
            System.out.println("Qual a sua idade?");
            int idade = sc.nextInt();
            
            soma += idade;
            media = soma/20;
        }
        System.out.println("=================================");
        System.out.println("A média das idade informadas é " +media);
    }

}
