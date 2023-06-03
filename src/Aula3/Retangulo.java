package Aula3;

import java.util.Scanner;


public class Retangulo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o valor da base do triângulo?");
        int base =scan.nextInt();
        
        System.out.println("qual o valor da altura? ");
        int altura =scan.nextInt();
        
        int area = base * altura;
        
        System.out.println("A area deste triângulo é " +area);
        
    }

}
