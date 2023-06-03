package Aula7;

import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10]; //o Array é com colchetes[] depois dos = no colchetes deve colocar o valor

        nomes[0] = "Fabio";
        nomes[1] = "Brenda";
        nomes[9] = "homem aranha";

        System.out.println("No indice 0, temos o nome  " + nomes[0]);
        System.out.println("No indice 1, temos o nome  " + nomes[1]);
        System.out.println("No indice 2, temos o nome  " + nomes[2]);
        System.out.println("No indice 9, temos o nome  " + nomes[9]);

        int[] idades = new int[50];//outra forma de utilizar o array
        idades[0] = 11;
        idades[49] = 15;

        int[] valores = {11, 89, 85, 18, 21, 14, 111};
        System.out.println("valores: " + valores[2]);
        valores[2] = 100;//mudando o valor do valores
        System.out.println("valores: " + valores[2]);

        //=======================================================
        String[] eventos = {"teatro", "cinema", "show"};

        for (int i = 0; i < eventos.length; i++)//length é o tamanho do array 
        {
            System.out.println((i+1)+" - "+eventos[i]);
        }
        
        
        //================================
        String [] cidades = new String[5];
        
        System.out.println("Digite os nomes das cidades");
        for (int i =0; i<cidades.length;i++){
            System.out.println(i+1+": ");
        cidades[i]=sc.nextLine();
        }
        System.out.println("");
        
        
    }

}
