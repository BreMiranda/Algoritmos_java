package ExerciciosIf;

import java.util.Scanner;


public class IdadeAlturaPeso {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
         int idade, peso;
        double altura;
        //recebendo dados
        System.out.println("verificando se você pode particpar da testagem do protótipo");
        System.out.println("Me diga sua idade: ");
        idade = scan.nextInt();
        System.out.println("Me diga sua altura");
        altura = scan.nextDouble();
        System.out.println("me diga seu peso ");
        peso = scan.nextInt();
        
        //processando
        if (idade >= 18 && idade<=35 && altura >=1.65 && peso <=100){
            System.out.println("Você pode participar da testagem!!");
        }else{
            System.out.println("Você não pode particpar da testagem ");
        }
    }

}
