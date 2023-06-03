package Aula3;

import java.util.Scanner;

public class SoleFolga {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Está de folga?");
        boolean folga = scan.nextBoolean();

        System.out.println("Está sol?");
        boolean sol = scan.nextBoolean();

        if (sol || folga) {//trocar o &&(e) por ||(ou) e testar
            System.out.println("Vamos para a praia hoje");
        } else {
            System.out.println("Não vamos passear");
        }
    }

}
