package Exercicios2704;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("qual seu nome?");
        String nome = scan.nextLine();
        
        System.out.println("Me diga um número");
        int num = scan.nextInt();
        
        for (int i = 1 ; i <= num; i++ ){
            System.out.println("Seu nome é "+nome);
        }
        
    }

}
