package Aula4;

import java.util.Scanner;


public class QuantidadeDeVezes {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //quantas vezes voc� quer repetir?
        //perguntar a quantidade de vezes que ele pediu um numero
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas vezes voc� quer repetir?");
        int vezes = scan.nextInt();
        
        for (int i = 0; i <= vezes; i++){
        System.out.println("Qual o seu n�mero? ");
        int num = scan.nextInt();
            System.out.println("seu valor �" +num);
    }

}
}
