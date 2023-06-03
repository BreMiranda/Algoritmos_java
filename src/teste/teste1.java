package teste;

import java.util.Scanner;


public class teste1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();
        System.out.print("Digite a forma de pagamento [dinheiro / cartão / débito]: ");
        String formaPagamento = scanner.next();

        double valorFinal = 0.0;

        if (formaPagamento.equals("dinheiro")) {
            valorFinal = valorTotal * 0.95; // 5% de desconto
        } else if (formaPagamento.equals("cartão")) {
            valorFinal = valorTotal * 1.1; // 10% de acréscimo
        } else if (formaPagamento.equals("débito")) {
            valorFinal = valorTotal * 0.97; // 3% de desconto
        } else {
            System.out.println("Forma de pagamento inválida!");
            return;
        }

        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Valor final da compra (" + formaPagamento + "): R$ " + valorFinal);
    }
}
    }

}
