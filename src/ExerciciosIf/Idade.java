package ExerciciosIf;

import java.util.Scanner;


public class Idade {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Em que fase da vida voc� esta?");
        System.out.println("Me diga sua idade");
        int idade = scan.nextInt();
        
        if (idade<12){
            System.out.println("Voc� � uma crian�a");
        }else if(idade> 12 && idade<18){
            System.out.println("Voc� � um adolescente");
        } else if (idade >=18 && idade<60){
          System.out.println("Voc� � um adulto");      
        }else {
         System.out.println("Voc� � um idoso");       
        }
        
    }
}
