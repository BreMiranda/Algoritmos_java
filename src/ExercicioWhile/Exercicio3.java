package ExercicioWhile;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Escreva um algoritmo que calcule a m�dia aritm�tica das 3 notas dos alunos de uma classe.
        //O algoritmo dever� ler, al�m das notas, o c�digo do aluno e dever� ser encerrado quando o c�digo for igual a zero.

        Scanner sc = new Scanner(System.in);
        int cod = 1;
        float portugues = 0;
        float matematica = 0;
        float quimica = 0;
        float media = 0;

        while (cod != 0) {

            System.out.println("digite o c�digo do aluno ou 0 para sair");
            cod = sc.nextInt();
            if (cod == 0) {
                break;
            } else {
                System.out.println("digite a nota de portugues");
                portugues = sc.nextFloat();
                System.out.println("digite a nota de matematica");
                matematica = sc.nextFloat();
                System.out.println("digite a nota de quimica");
                quimica = sc.nextFloat();

                media = (portugues + matematica + quimica) / 3;

                System.out.println("A m�dia aritm�tica deste aluno � " +String.format("%.2f", media));
            }

        }
        System.out.println("C�digo inv�lido");
    }
}
