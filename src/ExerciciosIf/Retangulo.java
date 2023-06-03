package ExerciciosIf;

import java.util.Scanner;


public class Retangulo {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados
        
        System.out.println("Calculando a area de um retangulo");
        System.out.println("qual a altura do retangulo?");
        int altura = scan.nextInt();
        
        System.out.println("qual a o valor da base do retangulo?");
        int base = scan.nextInt();
        
        int area = base*altura;
        
        System.out.println("A area do seu retangulo corresponde a :" +area);
    }

}
