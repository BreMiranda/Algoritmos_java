package ExerciciosIf;

import java.util.Scanner;


public class PositivoNegativoZero {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados
        System.out.println("calculando se o valor é positivo, negativo ou zero");
        System.out.println(" me de um valor ");
        int valor = scan.nextInt();
        
        //processando
        if(valor >= 1){
            System.out.println("seu valor é positvo");
        } else if (valor<= -1){
            System.out.println("seu valor é negativo");
        }      
        else{
            System.out.println("seu valor é zero");
        }
    }

}
