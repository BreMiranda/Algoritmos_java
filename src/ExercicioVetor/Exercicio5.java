package ExercicioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // comece o código aqui
        //Faça um Programa que leia 10 números inteiros e armazene-os num
        //vetor. Armazene os números pares no vetor PAR e os números IMPARES no
        //vetor impar. Imprima os três vetores.

        Scanner sc = new Scanner(System.in);
        int[] par = new int[10];
        int[] impar = new int[10];
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um valor");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                par[i] += num[i];
            } else {
                impar[i] += num[i];
            }
            
           // System.out.println("os numeros pares são "+par[i]);
        }
        System.out.println("os numeros pares são"+Arrays.toString(par));
        System.out.println("os numeros impares são"+Arrays.toString(impar));
        System.out.println("Todos os números digitados são"+Arrays.toString(num));
    }

}
