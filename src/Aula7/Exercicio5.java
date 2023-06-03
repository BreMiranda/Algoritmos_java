package AulaVetor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int contPar=0, contImpar=0;

        System.out.println("Digite 10 múmeros: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print((i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares[contPar] = numeros[i];
                contPar++;
            } else {
                impares[contImpar] = numeros[i];
                contImpar++;
            }
        }
        System.out.println();
        System.out.println("VETOR COMPLETO:");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        System.out.println("VETOR PARES:");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i]+" ");
        }
        System.out.println();
        System.out.println("VETOR IMPARES:");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i]+" ");
        }
        System.out.println();
    }
}
