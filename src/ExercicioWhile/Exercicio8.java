package ExercicioWhile;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        // comece o c�digo aqui
        //Foi feita uma pesquisa entre os 1000 habitantes de uma regi�o para coletar os seguintes dados: 
        //sexo (0-feminino, 1-masculino), idade e altura. Fa�a um algoritmo que leia as informa��es coletadas e mostre as seguintes informa��es:
        //a) m�dia da idade do grupo;
        //b) m�dia da altura das mulheres;
        //c) m�dia da idade dos homens;
        //d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).

        Scanner sc = new Scanner(System.in);
        int hab = 0;
        int idadeF = 0, idadeM = 0, somaM = 0, somaF = 0,  somatorioIdadeF = 0, somatorioIdadeM = 0, mediaIdadeM = 0,  mediaIdadeF=0;
        double alturaF = 0, alturaM = 0, media = 0, mediaAlturaF = 0, somaTodos = 0, percentual = 0;

        System.out.println("quantos habitantes s�o?");
        hab = sc.nextInt();
        while (hab > somaTodos) {

            System.out.println("Qual seu sexo? 0- feminino e 1- masculino");
            int sexo = sc.nextInt();

            if (sexo == 0) {
                somaF++;
                somaTodos++;
                System.out.println("Qual sua idade?f");
                idadeF = sc.nextInt();
                if (idadeF >= 18 && idadeF <= 35) {
                    percentual++;
                }
                mediaIdadeF+=idadeF;
                System.out.println("qual sua altura?");
                alturaF = sc.nextDouble();
                mediaAlturaF += alturaF;
            } else if (sexo == 1) {
                somaM++;
                somaTodos++;
                System.out.println("Qual sua idade?");
                idadeM = sc.nextInt();
                
                if (idadeM >= 18 && idadeM <= 35) {
                    percentual++;
                }
                mediaIdadeM += idadeM;
                System.out.println("qual sua altura?");
                alturaM = sc.nextDouble();
            } else if (sexo != 0 && sexo != 1) {
                System.out.println("C�digo incorreto, digite novamente.");
            }
        }
        double porcentagem = (percentual/somaTodos)*100;
        System.out.println("A m�dia de idade de todos os habitantes � " + (mediaIdadeM + mediaIdadeF) / somaTodos);
        System.out.println("A m�dia de Altura das mulheres � "  + mediaAlturaF / somaF);
        System.out.println("A m�dia de idade dos homens � " + mediaIdadeM / somaM);
        System.out.println("A quantidade de habitantes maiores de 18 e menores de 35 � " +porcentagem+"%");

    }

}
