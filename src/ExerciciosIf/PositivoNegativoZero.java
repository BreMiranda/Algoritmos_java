package ExerciciosIf;

import java.util.Scanner;


public class PositivoNegativoZero {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados
        System.out.println("calculando se o valor � positivo, negativo ou zero");
        System.out.println(" me de um valor ");
        int valor = scan.nextInt();
        
        //processando
        if(valor >= 1){
            System.out.println("seu valor � positvo");
        } else if (valor<= -1){
            System.out.println("seu valor � negativo");
        }      
        else{
            System.out.println("seu valor � zero");
        }
    }

}
