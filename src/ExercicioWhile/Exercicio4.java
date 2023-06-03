package ExercicioWhile;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // comece o código aqui
        //Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. Termine a leitura se o usuário digitar zero (0).
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        float media = 0;
        int qnt = 0;

        do {
            System.out.println("digite um número");
            num = scan.nextInt();
            
            if (num != 0){
                if( num % 2 == 0) {
                soma += num;
                qnt++;
            }
            else{
              System.out.println("O número digitado não é par");
            }}
        }while (num != 0);
            if (num == 0) {
                media = soma / qnt;
                System.out.println("a média dos numeros é " + media);
            } 
        }
}