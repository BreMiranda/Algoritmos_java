package ExercicioVetor;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        // Fa�a um Programa que leia um vetor de 10 n�meros reais e mostre-os na ordem inversa
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 1; i < num.length; i++) {
            System.out.println(+i + " - Digite um n�mero real");
            num[i] = sc.nextInt();
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(+i + "� numero: " + num[i]);
        }
    }

}
