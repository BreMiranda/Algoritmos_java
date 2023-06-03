package Exercicios2704;

import java.util.Scanner;


public class Exercicio15 {

    public static void main(String[] args) {
        // comece o código aqui
        
        Scanner scan = new Scanner(System.in);
        
        int x;
        double soma=0;
        double soma1=0;
        double soma2=0;
        
        System.out.println("digite um número");
        x = scan.nextInt();
        
        for (int i = 2; i<=2;i++){
        double numerado = 1.0;
        double denominador = i;
        
         System.out.println("1+1/"+i+++" ");
         soma = 1.0 + (numerado/denominador);
        }
        for (int i =3; i<=x; i++){
        double numerador =1.0;
            System.out.println("+1/"+i+" ");
            soma1 += (numerador/i);
        }
        soma2 = soma1 +soma2;
        System.out.println("Soma: "+soma2);
    }

}
