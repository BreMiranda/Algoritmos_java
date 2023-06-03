package ExercicioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // comece o código aqui
        //Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0, multiplicacao = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor");
            numeros[i] = scan.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];

        }
        System.out.println("A soma dos numeros informados é " + soma);
        System.out.println("A multiplicação dos numeros informados é " + multiplicacao);
        System.out.println("os numeros informados foram: "+Arrays.toString(numeros));

    }

}
