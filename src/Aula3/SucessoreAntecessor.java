package Aula3;

import java.util.Scanner;


public class SucessoreAntecessor {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Me de um número? ");
        int valor = scan.nextInt();
        
        int suc = valor +1;
        int ant = valor -1;
        
        System.out.println("o sucessor do seu número é "+suc+"\n e o antecessor é "+ant);
        
        
    }

}
