package ExercicioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Fa�a um Programa que leia um vetor de 5 n�meros inteiros, mostre a soma, a multiplica��o e os n�meros.

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0, multiplicacao = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor");
            numeros[i] = scan.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];

        }
        System.out.println("A soma dos numeros informados � " + soma);
        System.out.println("A multiplica��o dos numeros informados � " + multiplicacao);
        System.out.println("os numeros informados foram: "+Arrays.toString(numeros));

    }

}
