package algoritmo2;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //Entrada
        System.out.println("Quantos cavalos foram comprados?");
        int cavalos = scan.nextInt();
        
        int ferraduras = cavalos * 4;
        
        System.out.println("você precisará dessa quantidade de ferraduras: "+ferraduras);
        
        
        
    }

}
