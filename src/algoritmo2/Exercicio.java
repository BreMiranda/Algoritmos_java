/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo2;

import java.util.Scanner;

/**
 *
 * @author bre-r
 */
public class Exercicio {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//utilizando o scanner para imprimir na tela
        
        //entrdada       
        System.out.println("Me diga um número");//aqui ele recebe o primeiro número
        int num1 = scan.nextInt();
        
        System.out.println("Me diga outro número");//aqui ele recebe o segundo numero
        int num2 = scan.nextInt();
        
        //processamento        
        int soma = num1 + num2;//o int soma os dois valores
        
        //saida
        System.out.println("a soma desses dois números é "+soma);//aqui ele soma os dois valores dados pelo usuario
                
    }
    
}
