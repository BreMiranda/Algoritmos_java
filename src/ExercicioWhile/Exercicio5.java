package ExercicioWhile;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //5)	Escrever um algoritmo que leia uma quantidade desconhecida de n�meros e conte quantos deles est�o 
        //nos seguintes intervalos: [0..25], [26..50], [51..75] e [76..100]. A entrada de dados deve terminar quando for lido um n�mero negativo

        Scanner sc = new Scanner(System.in);

        int conjunto1 = 0;
        int conjunto2 = 0;
        int conjunto3 = 0;
        int conjunto4 = 0;
        int num = 1;

        do {
            System.out.println("digite um n�mero");
            num = sc.nextInt();

            if (num > 0 && num <= 25) {
                conjunto1++;
            } else if (num >= 26 && num <=50) {
                conjunto2++;
            } else if (num >= 51 && num <= 75) {
                conjunto3++;
            } else if (num >= 76 && num <= 100) {
                conjunto4++;
            }

        } while (num > 0);
        System.out.println("a quantidade de n�meros de 0 a 25 informados foi " + conjunto1);
        System.out.println("a quantidade de n�meros de 26 a 50 informados foi " + conjunto2);
        System.out.println("a quantidade de n�meros de 51 a 75 informados foi " + conjunto3);
        System.out.println("a quantidade de n�meros de 76 a 100 informados foi " + conjunto4);
    }
}
