package teste;

import java.util.Scanner;


public class teste3 {

    public static void main(String[] args) {
        // comece o c�digo aqu
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidadeValores = 0;
        
        System.out.println("Digite os valores inteiros positivos (Digite um valor negativo para sair):");
        
        while (true) {
            int valor = scanner.nextInt();
            
            if (valor < 0) {
                break; // Encerra o loop se o valor for negativo
            }
            
            soma += valor;
            quantidadeValores++;
        }
        
        if (quantidadeValores > 0) {
            double media = (double) soma / quantidadeValores;
            System.out.println("A m�dia dos valores �: " + media);
        } else {
            System.out.println("Nenhum valor v�lido foi inserido.");
        }
        
        scanner.close();
    }
}
    