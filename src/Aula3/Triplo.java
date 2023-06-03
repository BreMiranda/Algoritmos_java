package Aula3;

import java.util.Scanner;


public class Triplo {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("me de um valor");
        int valor = scan.nextInt();
        
        int triplo = valor *3;
        
        System.out.println("o triplo deste valor é "+triplo);
        
    }

}
