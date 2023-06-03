package Exercicios2704;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();
        
        for (int i=1; i <=10; i++){
            System.out.println("seu nome é: "+nome);
        }
    }

}
