package Exercicios2704;

import java.util.Scanner;


public class Exercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int par = 0;
        int impar =0;
        for(int i = 1; i<=20;i++){
            System.out.println("me diga um número:");
            int num = sc.nextInt();
            
            if(num%2==0){
            par++;
            }else{
            impar++;
            }
        }
        System.out.println("no total foram: "+par+" numeros pares e "+impar+" númeos impares");
    }

}
