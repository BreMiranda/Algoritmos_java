package Aula7;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //receber quantos numeros o usuario quiser digitar(a cada numero informado pe�a para que o 7
        //usuario digite 1 se quiser informar mais um n�mero ou 2 se quiser parar).exibir no final
        //o maior n�mero informado e a m�dia de todos os n�meros;
        Scanner sc = new Scanner(System.in);
        int num = 0, soma = 0, qnt = 0, maxNum = 0, cod = 0;
        float media = 0;

        while (cod != 2) {
            System.out.println("Digite um n�mero");
            num = sc.nextInt();
            System.out.println("===========================");
            System.out.println("O n�mero digitado foi " + num);
            soma += num;
            qnt++;
            System.out.println("digite 1-digitar mais um n�mero ou 2-sair");
            cod = sc.nextInt();

            if (num > maxNum) {
                maxNum = num;
            }

        }
        media = soma / qnt;
        System.out.println("O maior n�mero apresentado foi " + maxNum);
        System.out.println("A m�dia dos numeros apresentados � " + media);

    }

}
