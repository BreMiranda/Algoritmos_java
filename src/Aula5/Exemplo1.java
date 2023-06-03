package Aula5;

import java.util.Scanner;


public class Exemplo1 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Digite uma letra");
        String letra =sc.nextLine();
        
        switch(letra){
            case "a": 
                //System.out.println("Abacaxi"); //Se A e M mostrar a mesma coisa tira o break e o sout do A
               // break;
            case "m":
                System.out.println("Morango");
                break;
            case "p":
                System.out.println("pera");
                break;
            default:
                System.out.println("Letra Inválida");
        }
        
      
    }

}
