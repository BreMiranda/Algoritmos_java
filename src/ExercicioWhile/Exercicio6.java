package ExercicioWhile;

import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        // comece o código aqui
        //Faça um algoritmo que leia vários números inteiros e calcule o somatório dos números negativos (positivos são ignorados). O fim da leitura será indicado pelo número 0
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int soma= 0;
        
        
        do{
        System.out.println("digite um número");
        num = sc.nextInt();
        if(num<0){
        soma +=num;
        } else if(num>0){        
        }
           
        }while(num!=0);
        System.out.println("a soma dos números apresentados é "+soma);
    }

}
