package ExercicioWhile;

import java.util.Scanner;


public class Exercicio7 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Uma empresa deseja aumentar seus pre�os em 20%. Fa�a um algoritmo que leia o c�digo e o pre�o de custo de cada produto e calcule o pre�o novo. 
        //Calcule tamb�m, a m�dia dos pre�os com e sem aumento. Mostre o c�digo e o pre�o novo de cada produto e, no final, as m�dias. 
        //A entrada de dados deve terminar quando for lido um c�digo de produto negativo.
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
        if(cod>0){System.out.println("digite o pre�o");
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
        System.out.println("A m�dia dos pre�os antes do acrescimo "+media);
        System.out.println("A m�dia dos pre�os depois do acrescimo "+mediaC);
    }

}
