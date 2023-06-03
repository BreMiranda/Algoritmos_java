package Exercicio;

import java.util.Scanner;


public class Numerodecimal {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //adicionando o scanner (o usuario infoma algo) ao código 
        
        System.out.println("me de um numero decimal?");
        float numero = scan.nextFloat(); //atribuindo o valor informado do usuario a classe
        
        System.out.println("o seu número é:" +numero); // imprmindo o valor atribuindo na tela
    }

}
