package Aula4;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner sca = new Scanner(System.in);

        System.out.println("qual tabuada o voc� deseja?");
        int num = sca.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tab = i * num;
            System.out.println("a tabuada do sete � " + i + " x " + num + " = " + tab);
        }
    }

}
