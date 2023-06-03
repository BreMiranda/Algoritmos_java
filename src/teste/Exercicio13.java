package teste;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um numero: ");
        int x = sc.nextInt();

        int i;
        int maior = x;
        int menor = x;

        for(i = 2; i <= 10; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x > maior){
                maior = x;
            } else if (x < menor){
                menor = x;
            }
        }

        System.out.println("O menor numero digitado é: "+menor);
        System.out.println("O maior numero digitado é: "+maior);

    }
}