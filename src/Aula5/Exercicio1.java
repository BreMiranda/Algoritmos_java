package Aula5;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner sc = new Scanner(System.in);

        System.out.println(" me diga um n�mero");
        int num1 = sc.nextInt();

        System.out.println("Me diga mais um n�mero");
        int num2 = sc.nextInt();

        System.out.println("Digite qual opera��o voc� gostaria: 1- Soma 2- Subtra��o 3- Multiplica��o 4- Divis�o");
        int num = sc.nextInt();
        switch (num) {
            case 1://se for inteiro n�o coloca aspas, se for char � uma aspas s� '
                int soma = num1 + num2;
                System.out.println(" A soma dos dois n�meros resulta em:" + soma);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println(" A subtra��o dos dois n�meros resulta em:" + sub);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.println(" A multiplica��o dos dois n�meros resulta em:" + mult);
                break;
            case 4:
                int div = num1 / num2;
                System.out.println(" A divis�o dos dois n�meros resulta em: " + div);
            default:
                System.out.println("n�mero inv�lido");
        }
    }

}
