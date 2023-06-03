package ExercicioWhile;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner sc = new Scanner(System.in);
        int codigo = 1;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulo = 0;
        int branco = 0;

        while (codigo != 0) {
            System.out.println("digite o código do seu candidato ou 0 para sair");
            codigo = sc.nextInt();
            
            switch (codigo) {
                case 1:
                    System.out.println("você votou no candidato 1!");
                    candidato1++;
                    break;
                case 2:
                    System.out.println("você votou no candidato 2!");
                    candidato2++;
                    break;
                case 3:
                    System.out.println("você votou no candidato 3!");
                    candidato3++;
                    break;
                case 4:
                    System.out.println("você votou no candidato 4!");
                    candidato4++;
                    break;
                case 5:
                    System.out.println("você votou nulo");
                    nulo++;
                    break;
                case 6:
                    System.out.println("você votou em branco");
                    branco++;
                    break;
            }
        }
        
            System.out.println("o total de votos no candidato1 foi:" + candidato1);
            System.out.println("o total de votos no candidato2 foi:" + candidato2);
            System.out.println("o total de votos no candidato3 foi:" + candidato3);
            System.out.println("o total de votos no candidato4 foi:" + candidato4);
            System.out.println("o total de votos nulos foi:" + nulo);
            System.out.println("o total de votos em branco foi:" + branco);

    }

}
