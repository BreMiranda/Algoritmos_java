package ExercicioWhile;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Escreva um algoritmo que calcule a m�dia dos n�meros digitados pelo usu�rio, se eles forem pares. Termine a leitura se o usu�rio digitar zero (0).
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        float media = 0;
        int qnt = 0;

        do {
            System.out.println("digite um n�mero");
            num = scan.nextInt();
            
            if (num != 0){
                if( num % 2 == 0) {
                soma += num;
                qnt++;
            }
            else{
              System.out.println("O n�mero digitado n�o � par");
            }}
        }while (num != 0);
            if (num == 0) {
                media = soma / qnt;
                System.out.println("a m�dia dos numeros � " + media);
            } 
        }
}