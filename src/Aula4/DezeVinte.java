package Aula4;

import java.util.Scanner;

public class DezeVinte {

    public static void main(String[] args) {
        // comece o código aqui
        // se tiver entre 10 e 20, mostrar quantos está entre 10 e vinte e fora tantos numeros
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas vezes você quer repetir?");
        int vezes = scan.nextInt();
        
        int numDentro = 0;
        int numFora = 0;
        
        for (int i = 1; i <= vezes; i++) {
            System.out.println(i + "Qual o seu número? ");
            int num = scan.nextInt();
            if (num >= 10 && num <= 20) {
                System.out.println("seu valor é " + num);
                numDentro++;
            } else {
                System.out.println("seu numero não é aceito");
                numFora++;
            }
        }
        System.out.println("\n A quantidade de numeros fora do padrão é "+numFora);
        System.out.println("A quantidade de números dentro do padrão é "+numDentro);
    }
}
