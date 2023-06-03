package ExerciciosIf;

import java.util.Scanner;


public class Termometro {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Como está o tempo hoje");
        System.out.println("qual a temperatura em Celsius?");
        int valor = scan.nextInt();
        
        if (valor >=30){
        System.out.println("O tempo está quente");
        }else if (valor >15 && valor <=30){
         System.out.println("o tempo está morno");
        }else{
        System.out.println("o tempo está frio");
        } 
    }

}
