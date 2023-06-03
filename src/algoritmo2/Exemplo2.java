/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo2;

/**
 *
 * @author bre-r
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 5;
        int num2 = 2;
        
        int soma = num1 + num2 ;
        int subtracao = num1 - num2;    
        int mult = num1 * num2;
        int div = num1 / num2;
        int resto = num1 % num2; //o resto da divisão
        
        
        System.out.println("soma = " +soma);
        System.out.println("subracao = " +subtracao);
        System.out.println("Multiplicacao = "+mult);
        System.out.println("divisao = " +div);
        System.out.println("Resto = " +resto);
        
        //num1 = num1++; // são a mesma coisa //num1 ++ = num1 + 1
        num1++;
        
        System.out.println("Num1 = " +num1);
        
        num2--; //num2 -- = num2 - 1;
        System.out.println("num2 = " +num2);
    }
    
}
