package Aula4;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sca = new Scanner(System.in);

        System.out.println("qual tabuada o você deseja?");
        int num = sca.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tab = i * num;
            System.out.println("a tabuada do sete é " + i + " x " + num + " = " + tab);
        }
    }

}
