package ExerciciosIf;

import java.util.Scanner;


public class Nota {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Descubra se voc� passou de ano");
        System.out.println("Qual foi a sua nota?");
        float nota = scan.nextFloat();
        
        if(nota>= 7){
            System.out.println("Voc� passou de ano, parabens!!");
        }else if(nota< 7 && nota >=5){
            System.out.println("t� de recupera��o, vai ter que se esfor�ar mais um pouco...");
        }else{
            System.out.println("Reprovou, infelizmente, tente novamente no pr�ximo semestre");
        }
    } 

}
