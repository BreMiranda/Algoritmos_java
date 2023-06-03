package Exercicios2704;

import java.util.Scanner;


public class Exercicio5 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        for(int i = 1; i <=10; i++){
            System.out.println(" me de um número");
            int num = sc.nextInt();
            
            soma += num;
            
        }  
        System.out.println("a soma resulta em: "+soma);
    }
}
