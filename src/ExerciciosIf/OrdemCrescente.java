package ExerciciosIf;

import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);

        System.out.println("Colocando em ordem seus números");
        System.out.println("me dê o primeiro valor");
        int valor1 = scan.nextInt();
       
        System.out.println("me dê o segundo valor");
        int valor2 = scan.nextInt();

        System.out.println("me dê o terceiro valor");
        int valor3 = scan.nextInt();

        if (valor1 < valor2) {
            if (valor2 < valor3) {
                System.out.println("a sequencia dos valores é" + valor1 + valor2 + valor3);
            } else if (valor1 < valor3) {
                System.out.println("a sequência dos valores é" + valor1 + valor3 + valor2);
            } else {
                System.out.println("a sequência dos valores é" + valor3 + valor1 + valor2);
            }
        } else if (valor2 < valor3) {
            if (valor1 < valor3) {
                System.out.println(" A sequência dos valores é" + valor2 + valor1 + valor3);
            } else {
                System.out.println("A sequência dos valores é" + valor2 + valor3 + valor1);
            }
        } else {
            System.out.println("A sequência dos valores é" + valor3 + valor2 + valor1);
        }
    }

}
