package Exercicios2704;

import java.util.Scanner;


public class Exercicio10 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        int estaEntre=0;
        for (int i = 1 ; i<=20 ;i++){
            System.out.println("digite um número");
            int num = sc.nextInt();

            if(num>=0 &&num<=100){
            estaEntre++;
            }
        }
        System.out.println("Estão entre 0 e 100: "+estaEntre+" números");
    }

}
