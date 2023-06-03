package algoritmo2;

import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        // comece o código aqui
        
        Scanner scan = new Scanner (System.in);
        
        //ENTRADA DE DADOS
        System.out.println("Informe um número: ");
        int num1 = scan.nextInt();//INFORMANDO PRIMEIRO NÚMERO
        
        System.out.println("Informe o segundo número:");
        int num2 = scan.nextInt();
                
        //PROCESSAMENTO
         int soma = num1 + num2;
         int sub = num1 - num2;
         int mult = num1 * num2;
         float  div = num1 / num2;
         
         
         //SAIDA
         System.out.println("a soma dos dois numeros informados resulta em "+soma);
         System.out.println("a subtração dos dois numeros informados resulta em: "+sub);
         System.out.println("a multiplicação dos dois numero informados resulta em: "+mult);
         System.out.printf("a divisão dos dois numeros informados resulta em: "+div);
         
        
        
                
          
                
              
    }

}
