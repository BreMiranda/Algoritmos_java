package ExerciciosIf;

import java.util.Scanner;


public class Termometro {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Como est� o tempo hoje");
        System.out.println("qual a temperatura em Celsius?");
        int valor = scan.nextInt();
        
        if (valor >=30){
        System.out.println("O tempo est� quente");
        }else if (valor >15 && valor <=30){
         System.out.println("o tempo est� morno");
        }else{
        System.out.println("o tempo est� frio");
        } 
    }

}
