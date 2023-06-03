package Aula5;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);

        System.out.println(" me diga um número");
        int num1 = sc.nextInt();

        System.out.println("Me diga mais um número");
        int num2 = sc.nextInt();

        System.out.println("Digite qual operação você gostaria: 1- Soma 2- Subtração 3- Multiplicação 4- Divisão");
        int num = sc.nextInt();
        switch (num) {
            case 1://se for inteiro não coloca aspas, se for char é uma aspas só '
                int soma = num1 + num2;
                System.out.println(" A soma dos dois números resulta em:" + soma);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println(" A subtração dos dois números resulta em:" + sub);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.println(" A multiplicação dos dois números resulta em:" + mult);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println(" A divisão dos dois números resulta em: " + div);
            default:
                System.out.println("número inválido");
        }
    }

}
