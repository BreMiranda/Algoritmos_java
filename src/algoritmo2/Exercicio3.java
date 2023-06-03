package algoritmo2;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {
        // comece o código aqui
        
        Scanner scan = new Scanner (System.in);
        
        //entrada
        System.out.println("Me diga seu nome:");
        String nome = scan.nextLine();
        
        System.out.println("Endereço residencial:");
        String end = scan.nextLine();
        
        System.out.println("Número de telefone: ");
        String tel = scan.nextLine();
        
        System.out.println("Área de atuação profissional");
        String prof = scan.nextLine();
        
        //saida
        System.out.println("Seu nome é "+nome+" e seu endereço residencial "+end+", seu numero de telefone é "+tel+ " sua profissão é: "+prof);
        
        
        
        
        
        
    }

}
