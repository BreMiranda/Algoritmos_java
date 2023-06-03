package Aula3;

import java.util.Scanner;


public class ImparouPar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Me de um valor: ");
        int valor = scan.nextInt();
        
       //int resto = valor % 2;
       
       if(valor %2 == 0){
           System.out.println("Este número é par! ");
       }
       else{
           System.out.println("Este número é impar!");
       }
        
    }

}
