package Aula4;

import java.util.Scanner;


public class QuantidadeDeVezes {

    public static void main(String[] args) {
        // comece o código aqui
        //quantas vezes você quer repetir?
        //perguntar a quantidade de vezes que ele pediu um numero
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantas vezes você quer repetir?");
        int vezes = scan.nextInt();
        
        for (int i = 0; i <= vezes; i++){
        System.out.println("Qual o seu número? ");
        int num = scan.nextInt();
            System.out.println("seu valor é" +num);
    }

}
}
