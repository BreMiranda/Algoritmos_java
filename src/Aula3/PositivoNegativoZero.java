package Aula3;

import java.util.Scanner;

public class PositivoNegativoZero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Me de um n�mero");
        int valor = scan.nextInt();

        if (valor >= 1) {
            System.out.println("este valor � positivo");
        } else if (valor <= -1) {
            System.out.println("este valor � negativo");
        } else {
            System.out.println("este valor � igual a 0");
        }
    }

}
