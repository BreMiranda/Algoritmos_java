package ExercicioVetor;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        // comece o código aqui
        // Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 1; i < num.length; i++) {
            System.out.println(+i + " - Digite um número real");
            num[i] = sc.nextInt();
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(+i + "º numero: " + num[i]);
        }
    }

}
