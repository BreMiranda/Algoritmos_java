package Exercicios2704;

import java.util.Scanner;


public class Exercicio8 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scaa = new Scanner(System.in);
        
        int menor = 0,maior=0;
        for( int i = 1; i<=20; i++){
            System.out.println("Qual sua idade ");
            int numero = scaa.nextInt();
            
            if (numero>=18){
                maior++;
            }else{
                menor++;
            }
        }
         System.out.println("o n�mero de �suarios maiores de idade � " +maior);
    }

}
