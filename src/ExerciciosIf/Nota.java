package ExerciciosIf;

import java.util.Scanner;


public class Nota {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Descubra se você passou de ano");
        System.out.println("Qual foi a sua nota?");
        float nota = scan.nextFloat();
        
        if(nota>= 7){
            System.out.println("Você passou de ano, parabens!!");
        }else if(nota< 7 && nota >=5){
            System.out.println("tá de recuperação, vai ter que se esforçar mais um pouco...");
        }else{
            System.out.println("Reprovou, infelizmente, tente novamente no próximo semestre");
        }
    } 

}
