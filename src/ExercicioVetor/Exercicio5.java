package ExercicioVetor;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Fa�a um Programa que leia 10 n�meros inteiros e armazene-os num
        //vetor. Armazene os n�meros pares no vetor PAR e os n�meros IMPARES no
        //vetor impar. Imprima os tr�s vetores.

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
            
           // System.out.println("os numeros pares s�o "+par[i]);
        }
        System.out.println("os numeros pares s�o"+Arrays.toString(par));
        System.out.println("os numeros impares s�o"+Arrays.toString(impar));
        System.out.println("Todos os n�meros digitados s�o"+Arrays.toString(num));
    }

}
