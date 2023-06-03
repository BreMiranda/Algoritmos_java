package Exercicio;

import java.util.Scanner;


public class DadosPessoais {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner(System.in);
        
        //recebendo dados
        System.out.println("Preencha os seguintes dados pessoais:");
        System.out.println("Nome completo:");
        String nome = scan.nextLine();
        
        System.out.println("Endereço:");
        String endereco = scan.nextLine();
        
        System.out.println("Número de telefone");
        String tel = scan.nextLine();
        
        System.out.println("Área de atuação profissional:");
        String area = scan.nextLine();
        
        //imprimindo na tela
        System.out.println("Seu nome é "+nome+"\n voce mora no seguinte endereco "+endereco+"\n o numero de telefone é "+tel+"\ne trabalha na seguinte area "+area);
    }
    

}
