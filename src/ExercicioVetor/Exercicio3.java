package ExercicioVetor;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        // comece o código aqui
        //Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
        Scanner sc = new Scanner(System.in);
        int[] nota = new int [4]; 
        int media = 0, notaAlunos =0;
        
        for (int i = 0; i <nota.length; i++){
        System.out.println("Digite a nota");
        nota[i] = sc.nextInt();
        notaAlunos += nota[i];
        media = notaAlunos/4;
        }
        System.out.println("A média das notas é: "+media);
        
        
    }

}
