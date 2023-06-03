package ExerciciosIf;

import java.util.Scanner;


public class Impar {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("mê de um valor ");
        int Valor   = scan.nextInt();
        
        if(Valor % 2 == 0){
            System.out.println("o seu número é par");
         }
        else{
            System.out.println("o seu numero e impar");
        }
    }

}
