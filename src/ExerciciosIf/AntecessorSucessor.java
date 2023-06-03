package ExerciciosIf;

import java.util.Scanner;


public class AntecessorSucessor {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
           // recebendo dados
         System.out.println("Calculando o antecessor e sucessor de um numero");
         System.out.println("me de um valor");
         int num = scan.nextInt();
           // processando
         int sucessor = num +1;
         int antecessor = num -1;
         // imprimindo na tela
         System.out.println("o sucessor do seu número é "+sucessor+"  e antecessor é "+antecessor);
    }

}
