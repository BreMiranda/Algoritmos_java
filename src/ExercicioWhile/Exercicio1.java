package ExercicioWhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o código aqui
        //Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos. O final da leitura acontecerá quando for lido um valor negativo 
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int qntVezes = 0;
        int soma = 0;

        while (num >= 0) { ///colocando uma condição no while 
            System.out.println("digite um número");
            num = sc.nextInt();
            if (num >= 0) {
                soma += num; //atribuindo o valor do num ao soma
                qntVezes++; //caso o número seja <= zero ele vai somar na variavel qntvezes para no final dividir todos os valores
            }//caso digite um numero negativo, vai sair da loop da repetição
        }
        int media = soma / qntVezes;
        System.out.println("a média dos números informados é " + media);
    }
}
