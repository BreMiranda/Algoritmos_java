package Exercicio;

import java.util.Scanner;


public class mult {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner (System.in);
        
        System.out.println("me de um número");
        int num1 = scan.nextInt();
        
        System.out.println("me de mais um número");
        int num2 = scan.nextInt();
        
        
        int mult = num1 * num2;
        
        System.out.println("a multiplicação dos dois numeros resulta em "+mult);
    }

}
