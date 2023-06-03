package ExerciciosIf;

import java.util.Scanner;


public class Triplo {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("mostrando o tiplo do valor");
        //recebendo dados
        System.out.println("me de um valor");
        int valor1 = scan.nextInt();
        
        int triplo = valor1 *3;
        
        System.out.println("o triplo do seu valor é: "+triplo);
    }

}
