package ExerciciosIf;

import java.util.Scanner;


public class IdadeAlturaPeso {

    public static void main(String[] args) {
        // comece o c�digo aqui
        Scanner scan = new Scanner(System.in);
        
         int idade, peso;
        double altura;
        //recebendo dados
        System.out.println("verificando se voc� pode particpar da testagem do prot�tipo");
        System.out.println("Me diga sua idade: ");
        idade = scan.nextInt();
        System.out.println("Me diga sua altura");
        altura = scan.nextDouble();
        System.out.println("me diga seu peso ");
        peso = scan.nextInt();
        
        //processando
        if (idade >= 18 && idade<=35 && altura >=1.65 && peso <=100){
            System.out.println("Voc� pode participar da testagem!!");
        }else{
            System.out.println("Voc� n�o pode particpar da testagem ");
        }
    }

}
