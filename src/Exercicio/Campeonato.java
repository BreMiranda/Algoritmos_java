package Exercicio;

import java.util.Scanner;


public class Campeonato {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner (System.in);
        
        
        //recendo dados
        System.out.println("Me de a quantidade de pontos do campeão: ");
        int pontosCampeao = scan.nextInt();
        
        System.out.println("Me de a quantidade de pontos do time lanterna: ");
        int pontosLanterna = scan.nextInt();
   
        //processando
        int pontosEmpate = (pontosCampeao - pontosLanterna) /3; 
        
        //imprimindo
        System.out.println("A quantidade de vitorias para o time lanterna alcancar o Campeao é: "+pontosEmpate);
        
    }

}
