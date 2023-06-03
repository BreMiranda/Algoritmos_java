package algoritmo2;

import java.util.Scanner;


public class ExecicioDecimal {

    public static void main(String[] args) {
        // comece o código aqui
        Scanner scan = new Scanner (System.in);
                
                System.out.println ("qual é o seu salario?");
                
                float  salario = scan.nextFloat();
                
                System.out.println("Legal, você ganha mensalmente o valor de: "+salario);
    }
}
