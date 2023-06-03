package ExerciciosIf;

import java.util.Scanner;


public class MaiorNumero {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        //recebendo dados
        System.out.println("calculando qual o maior valor dado");
        System.out.println("me dê o primeiro valor");
        int valor1 = scan.nextInt();
        
        System.out.println("Me dê o segundo valor");
        int valor2 = scan.nextInt();
        //calculando e imprimindo na tela
        if (valor1>valor2){
            System.out.println("O valor maior é "+valor1);
        }
        else{
        System.out.println("o Valor maior é "+valor2);
        }
    }

}
