package ExercicioWhile;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //9)	Fa�a um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
        //- a quantidade de pessoas com mais de 90 quilos; 
        //  - a m�dia das idades das sete pessoas
        Scanner sc = new Scanner(System.in);
        int pessoas = 0, idade = 0, idadeTodos = 0, media = 0, maiorde90 = 0;
        float peso = 0;
        
        while (pessoas < 7) {
            pessoas++;
            
            System.out.println(+pessoas + "� digite sua idade ");
            idade = sc.nextInt();
            idadeTodos += idade;

            System.out.println("digite seu peso");
            peso = sc.nextFloat();

            if (peso > 90) {
                maiorde90++;
            }
        }
        media = idadeTodos / 7;
        System.out.println("a quantidade de pessoas com peso superior a 90kg � " + maiorde90);
        System.out.println("a m�dia de idade de todos os participantes � " + media);
    }

}
