package Aula4;

import java.util.Scanner;

public class DezeVinte {

    public static void main(String[] args) {
        // comece o c�digo aqui
        // se tiver entre 10 e 20, mostrar quantos est� entre 10 e vinte e fora tantos numeros
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas vezes voc� quer repetir?");
        int vezes = scan.nextInt();
        
        int numDentro = 0;
        int numFora = 0;
        
        for (int i = 1; i <= vezes; i++) {
            System.out.println(i + "Qual o seu n�mero? ");
            int num = scan.nextInt();
            if (num >= 10 && num <= 20) {
                System.out.println("seu valor � " + num);
                numDentro++;
            } else {
                System.out.println("seu numero n�o � aceito");
                numFora++;
            }
        }
        System.out.println("\n A quantidade de numeros fora do padr�o � "+numFora);
        System.out.println("A quantidade de n�meros dentro do padr�o � "+numDentro);
    }
}
