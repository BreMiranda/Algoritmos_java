package ExercicioWhile;

import java.util.Scanner;


public class Exercicio7 {

    public static void main(String[] args) {
        // comece o código aqui
        //Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o código e o preço de custo de cada produto e calcule o preço novo. 
        //Calcule também, a média dos preços com e sem aumento. Mostre o código e o preço novo de cada produto e, no final, as médias. 
        //A entrada de dados deve terminar quando for lido um código de produto negativo.
        Scanner sc = new Scanner(System.in);
        int cod = 1;
        double precoCusto = 0;
        double precoFinal = 0;
        double valorAcrescentado = 0;
        int somaC = 0;
        int somaF = 0;
        int totalC = 0;
        int totalF = 0;
        float mediaC = 0;
        float media = 0;
        
        while(cod>0){
        System.out.println("digite o codigo");
        cod = sc.nextInt();
        if(cod>0){System.out.println("digite o preço");
        precoCusto = sc.nextInt();
        
        somaC+=precoCusto;
        totalC++;

        valorAcrescentado = precoCusto*0.2;
        precoFinal= precoCusto+valorAcrescentado;
        somaF+=precoFinal;
        totalF++;
       
        System.out.println("O valor final com o acrescimo "+precoFinal);
        
        mediaC = somaC / totalC;
        media = somaF / totalF;}
        
        }
        System.out.println("==================================================");
        System.out.println("A média dos preços antes do acrescimo "+media);
        System.out.println("A média dos preços depois do acrescimo "+mediaC);
    }

}
