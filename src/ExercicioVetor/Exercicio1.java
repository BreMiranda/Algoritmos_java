package ExercicioVetor;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os.

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um n�mero inteiro");
            num[i] = sc.nextInt();}
        for(int i =0; i<num.length;i++){
            System.out.println(+i + " - " + num[i]);
        }

    }

}
