package ExerciciosIf;

import java.util.Scanner;


public class VariavelTemp {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Trocando o valor de duas variaveis");
        //recebendo dados
        System.out.println("me de um valor");
        int valor1 = scan.nextInt();
        
        System.out.println("me de um segundo valor");
        int valor2 = scan.nextInt();
        
        System.out.println(" o valor de x é igual a "+ valor1+ " e o valor de y é igual a  "+valor2);
         // processando dados
        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;
        
         System.out.println(" o valor de x é igual a "+ valor1+ " e o valor de y é igual a  "+valor2);
       
    }

}
