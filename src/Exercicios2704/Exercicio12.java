package Exercicios2704;

import java.util.Scanner;


public class Exercicio12 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int num=0;
        int positivo =0;
        int negativo = 0;
        int zero = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("digite um n�mero");
            num = sc.nextInt();
            
            if (num >=1){
            positivo++;
            }else if(num <=-1){
            negativo++;
            }else{
            zero++;
            }
        }
        System.out.println(" A quantidade de n�meros positivos informados foi " +positivo);
        System.out.println(" A quantidade de n�meros negativos informados foi " +negativo);
        System.out.println(" A quantidade de n�meros 0 informados foi " +zero);
    }

}
