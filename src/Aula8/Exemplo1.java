package Aula8;

import java.util.Scanner;


public class Exemplo1 {

    public static void main(String[] args) {
        // comece o código aqui
        int matriz[] [] = new int[3] [3]; //isso é uma matriz
        
        matriz [0] [0] = 100;
        matriz [1] [1] = 200;
        matriz [2] [2] = 300;
        //=============================================
        int matriz2 [] [] = {
                                     {0,1,2},//linha zero
                                     {3,4,5},//linha um
                                     {6,7,8}};//linha dois
        //=============================================
        Scanner sc = new Scanner(System.in);
        
        int matriz3 [] [] = new int[3] [3];
        
        for(int linha = 0; linha<matriz3.length; linha++){
            for(int coluna =0; coluna<matriz3[linha].length; coluna++){
                matriz3[linha] [coluna] = sc.nextInt();
            }
        }
        for(int linha = 0; linha<matriz3.length; linha++){
            for(int coluna =0; coluna<matriz3[linha].length; coluna++){
                System.out.print(+matriz3[linha][coluna]+" ");//tira o ln pra não pular linha
            }
            System.out.println(" ");//pra pular linha
        }
        
    }

}
