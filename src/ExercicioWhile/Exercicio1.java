package ExercicioWhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Construir um algoritmo que calcule a m�dia aritm�tica de v�rios valores inteiros positivos. O final da leitura acontecer� quando for lido um valor negativo 
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int qntVezes = 0;
        int soma = 0;

        while (num >= 0) { ///colocando uma condi��o no while 
            System.out.println("digite um n�mero");
            num = sc.nextInt();
            if (num >= 0) {
                soma += num; //atribuindo o valor do num ao soma
                qntVezes++; //caso o n�mero seja <= zero ele vai somar na variavel qntvezes para no final dividir todos os valores
            }//caso digite um numero negativo, vai sair da loop da repeti��o
        }
        int media = soma / qntVezes;
        System.out.println("a m�dia dos n�meros informados � " + media);
    }
}
