package Exercicio;

import java.util.Scanner;


public class Cavalo {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados
        System.out.println("Quantas ferraduras serão necessarias no seu haras?");
        System.out.println("quantos cavalos foram comprados?");
        int cavalo = scan.nextInt();
        
        //processando
        int ferraduras = cavalo *4;
        
        //mostrando ao usuario
        System.out.println("essa sera a quantidade de ferraduras que voce vai precisar: "+ferraduras);
        
        
    }

}
