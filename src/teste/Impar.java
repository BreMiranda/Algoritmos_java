package teste;

import java.util.Scanner;


public class Impar {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Me de um valor");
        int valor = scan.nextInt();
               
        if(valor % 2 ==0){
                System.out.println("o numero e par");
        }
        else {
            System.out.println("o numero e impar");
        }
    }    
}
