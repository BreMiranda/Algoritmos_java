package Exercicios2704;

import java.util.Scanner;


public class Exercicio10 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner sc = new Scanner(System.in);
        
        int estaEntre=0;
        for (int i = 1 ; i<=20 ;i++){
            System.out.println("digite um n�mero");
            int num = sc.nextInt();

            if(num>=0 &&num<=100){
            estaEntre++;
            }
        }
        System.out.println("Est�o entre 0 e 100: "+estaEntre+" n�meros");
    }

}
