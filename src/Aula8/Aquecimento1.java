package Aula8;

import java.util.Arrays;
import java.util.Scanner;

public class Aquecimento1 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;
        int[] posicoes = new int[10];

        for (int i = 0; i < posicoes.length; i++) {
            System.out.println("Digite um n�mero positivo");
            num = sc.nextInt();

            if (num >= 1) {
                posicoes[i] = num;// = posicoes[i];
            } else {
                System.out.println("o numero digitado n�o � permitido, digite novamente");
                i--;
            }

        }
        System.out.println("a soma dos das casas impares � " + soma);
        System.out.println("os numeros digitados" + Arrays.toString(posicoes));

    }

}
