package Aula7;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);

        String[] cidades = new String[5];

        System.out.println("Digite os nomes das cidades");
        for (int i = 0; i < cidades.length; i++) {
            System.out.println(i + 1 + ": ");
            cidades[i] = sc.nextLine();//entrada de n nomes, dá pra entrar com mais

            // System.out.println((i + 1) + " - " + cidades[i]);
        }
        for (int i = 0; i < cidades.length; i++) { //saida de n dados;
          //  System.out.println("\n=================================");
            System.out.println("as cidades citadas são " + cidades[i]);
        }
    }

}


