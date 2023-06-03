package Aula4;

import java.util.Scanner;

public class Fora10e20 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas vezes você quer repetir? ");
        int vezes = scan.nextInt();

        for (int i = 0; i <= vezes; i++) {
            System.out.println("Qual seu número: ");
            int num = scan.nextInt();
            if (num >= 10 &&  num <= 20) {
                System.out.println("Seu número é " + num);
            } else {
                System.out.println("Seu número é inválido");
            }
        }
    }

}
