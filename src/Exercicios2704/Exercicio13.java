package Exercicios2704;

import java.util.Scanner;


public class Exercicio13 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
         System.out.println("digite um número");
         int num = sc.nextInt();
            
        int maior = num;
        int menor = num;
        
        for (int i = 2; i <= 2; i++){
            System.out.println("digite um número");
            num = sc.nextInt();
           
            if(num > maior)
                {
                    maior = num;
                } else if (num < menor || menor == 0)
                {
                    menor = num;
                }
        }
        System.out.println("O menor numero informado foi: "+menor);
        System.out.println("O maior numero informado foi: "+maior);
    }
 
}
