package Exercicio;

import java.util.Scanner;


public class OperacoesBasicas {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner (System.in);
        
       //recebendo dados        
        System.out.println("Informe o primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Informe o segundo número:");
        int num2 = scan.nextInt();
        
        //processando
        int soma = num1 +num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        
        
        System.out.println(" A soma dos numeros informados é igual a: " +soma);
        System.out.println(" A subtracao dos numeros informados é igual a: " +sub);
        System.out.println(" A multiplicacao dos numeros informados é igual a: " +mult);
        System.out.println(" A divisao dos numeros informados é igual a: " +div);
        
        
        
    }

}
